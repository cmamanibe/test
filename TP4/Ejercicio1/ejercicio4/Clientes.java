package TP4.Ejercicio1.ejercicio4;

public class Clientes implements Runnable{
    private GestorImpresoras gImp;
    String black="\033[30m"; 
String red="\033[31m"; 
String green="\033[32m"; 
String yellow="\033[33m"; 
String blue="\033[34m"; 
String purple="\033[35m"; 
String cyan="\033[36m"; 
String white="\033[37m";
String reset="\u001B[0m";
    public Clientes(GestorImpresoras g){
        gImp=g;
       
    }


    public void run(){
        while(true){
            System.out.println(yellow+Thread.currentThread().getName()+" solicita impresion"+reset);
            gImp.asignarImpresora();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
