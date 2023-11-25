package Parcial2023;

public class MonitorAgua {

    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    private int atomoO;
    private int atomoH;
    private int cantAgua;
    
    public MonitorAgua(){
        atomoH=0;
        atomoO=0;
        cantAgua=0;
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
        atomoO++;
        System.out.println(blue+"Ingreso un Atomo de Oxigeno, existen "+atomoO+" atomos de Oxigeno"+reset);
        try {
            this.wait();
                       
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public synchronized void hListo(){
        atomoH++;
        System.out.println(yellow+"Ingreso un Atomo de Hidrogeno, existen "+atomoH+" atomos de Hidrogeno"+reset);
        try {
            this.wait();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
