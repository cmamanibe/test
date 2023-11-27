package Parcial2023;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CerrojoAgua {

    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    private int atomoO,atomoH, cantAgua;
    private final Lock cerrojo;
    private final Condition oxigenoOK, hidrogenoOK;
    
    public CerrojoAgua(){
        atomoH=0;
        atomoO=0;
        cantAgua=0;
        this.cerrojo=new ReentrantLock(true);
        oxigenoOK=cerrojo.newCondition();
        hidrogenoOK=cerrojo.newCondition();
    }

    public synchronized void hacerAgua(){
        try {
          if ((atomoO>0)&&(atomoH>2)){
                cantAgua++;
                this.notify();
                System.out.println(green+"------ Se genero una molecula de agua, llevan " +this.cantAgua+reset);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
    public synchronized int cantidadAgua(){
        return cantAgua;
    }
    public synchronized void vaciar(){
        cantAgua=0;
        System.out.println(red+"++++++ Se vacio +++++"+reset);
    }
    public synchronized void oListo(){
        cerrojo.lock();
        atomoO++;
        System.out.println(blue+"Ingreso un Atomo de Oxigeno, existen "+atomoO+" atomos de Oxigeno"+reset);
        try {
            while(atomoH<2){
                oxigenoOK.await();
            }
            atomoO--;
            hidrogenoOK.signalAll();   
        } catch (Exception e) {
    
        }finally{
            cerrojo.unlock();
        }
    }
    public synchronized void hListo(){
        cerrojo.lock();
        atomoH++;
        System.out.println(yellow+"Ingreso un Atomo de Hidrogeno, existen "+atomoH+" atomos de Hidrogeno"+reset);
        try {
            while (atomoO<1) {
                hidrogenoOK.await();
            }
            atomoH--;
            oxigenoOK.signal();
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            cerrojo.unlock();
        }
    }
}
