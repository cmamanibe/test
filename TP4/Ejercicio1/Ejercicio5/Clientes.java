package TP4.Ejercicio1.Ejercicio5;


import java.util.concurrent.ThreadLocalRandom;

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
char usuarioImpresoraTipo;
    public Clientes(GestorImpresoras g){
        gImp=g;
        char[] lista={'A','B','C','A','B'};
        usuarioImpresoraTipo=lista[ThreadLocalRandom.current().nextInt(0, 5)];       
    }


    public void run(){
        while(true){
            System.out.println(yellow+Thread.currentThread().getName()+" solicita impresion en impresora tipo"+usuarioImpresoraTipo+reset);
            gImp.asignarImpresora(usuarioImpresoraTipo);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

