package TP4.Ejercicio1.ejercicio4;

import java.util.concurrent.Semaphore;

public class Impresora {
    public String estado;
    public Semaphore semImprimiendo;
    public Semaphore semLibre;
    public int numeroImpresora;
    String black="\033[30m"; 
String red="\033[31m"; 
String green="\033[32m"; 
String yellow="\033[33m"; 
String blue="\033[34m"; 
String purple="\033[35m"; 
String cyan="\033[36m"; 
String white="\033[37m";
String reset="\u001B[0m";
    public Impresora(int x){
        try {
            numeroImpresora=x;
            semImprimiendo=new Semaphore(0);  //No esta ocupada
            semLibre=new Semaphore(1);        //Esta libre
            estado="Disponible";
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void setOcupada(){
        try {
            semLibre.acquire();
            estado="Ocupada";
            System.out.println(green+Thread.currentThread().getName()+" imprimiendo en impresora "+numeroImpresora+reset );
            Thread.sleep(5000);
            semImprimiendo.release();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void setDisponible(){
        try {
            semImprimiendo.acquire();
            estado="Disponible";
            System.out.println(red+Thread.currentThread().getName()+" Finalizo impresion en impresora "+numeroImpresora+reset);
            semLibre.release();            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public boolean impresoraDisponible(){
        return estado=="Disponible";
    }
}