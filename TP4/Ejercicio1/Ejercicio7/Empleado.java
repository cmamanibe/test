package TP4.Ejercicio1.Ejercicio7;

public class Empleado implements Runnable {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    Confiteria conf;
    public Empleado(Confiteria c){
        conf=c;
    }

    public void run(){
        while (true) {
            conf.pedirMenu();
            System.out.println(red+"Espera menú "+Thread.currentThread().getName()+reset);
            try {
                Thread.sleep(10000);
            } catch (Exception e) {

            }
            conf.liberarSilla();
        }
    }
    
}