package TP4.Ejercicio1.Ejercicio6;

import java.util.concurrent.Semaphore;

public class Taxi {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    
    String paxName="";

    Semaphore taxiSemaforo=new Semaphore(0);
    Semaphore paxSemaforo=new Semaphore(0);

    public Taxi(){
        
    }
    // METODOS DE TAXISTA ESPERAR PASAJERO Y DESCENDER PASAJERO
    public void esperarPax(){
        try {
            paxSemaforo.acquire();// Asciende un pasajero
            System.out.println(green+ "Inicio viaje el "+paxName+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
    public void desciendePax(){
        try {
            taxiSemaforo.release();
            System.out.println(red+" Finalizo viaje el "+paxName+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //METODOS DE PASAJERO PEDIR TAXI Y ESPERAR TAXI
    public void pedirTaxi(){
        try {
            paxSemaforo.release();//LIBERA PASAJEROS
            System.out.println(yellow+"Solicita Taxi el "+ Thread.currentThread().getName()+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void esperarTaxi(){
        try {
            taxiSemaforo.acquire(); //OCUPA EL TAXI
            paxName=Thread.currentThread().getName();
            System.out.println(blue+Thread.currentThread().getName()+" obtuvo taxi!! " +reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Taxi t=new Taxi();
        Taxista conductor=new Taxista(t);
        Thread c=new Thread(conductor, "Taxista");

        Pasajero[] p=new Pasajero[5];
        Thread[] simula=new Thread[5];

        for (int i = 0; i < p.length; i++) {
            p[i]=new Pasajero(t);
            simula[i]=new Thread(p[i], "Pasajero_"+i);
            simula[i].start();
        }
        System.out.println("Inicia el taxista");
        c.start();
    }
}
