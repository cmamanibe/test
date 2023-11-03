package TP4.Ejercicio1.Ejercicio6;

import java.util.concurrent.Semaphore;

public class Taxi {
    Semaphore taxiSem=new Semaphore(1);
    Semaphore pax=new Semaphore(0);

    public Taxi(){

    }
    public void subirPax(){
        try {
            taxiSem.acquire();
            System.out.println("Inicio viaje "+Thread.currentThread().getName());
            Thread.sleep(1000);
            pax.release();
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
    public void bajarPax(){
        try {
            pax.acquire();
            taxiSem.release();
            System.out.println("Finalizo viaje"+Thread.currentThread().getName());
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
            simula[i]=new Thread(p[i], "pasajero_"+i);
            simula[i].start();
        }
        System.out.println("Inicia el taxista");
        c.start();
    }
}
