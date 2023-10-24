package TP4.Ejercicio1.Ejercicio2;

import java.util.concurrent.Semaphore;

public class Semaforo {
    public Semaphore sem1=new Semaphore(1);
        
    public Semaphore sem2=new Semaphore(0);
        
    public Semaphore sem3=new Semaphore(0);
        
    public Semaphore sem4=new Semaphore(0);

    public void p1(){
        try {
            sem2.acquire();
        } catch (Exception e) {
            // TODO: handle exception
        }
        sem1.release();
        System.out.println("Se ejecuto p1");
    }
    public void p2(){
        try {
            sem3.acquire();
        } catch (Exception e) {
            // TODO: handle exception
        }
        sem2.release();
        System.out.println("Se ejecuto p2");
    }
    public void p3(){
        try {
            sem1.acquire();
        } catch (Exception e) {
            // TODO: handle exception
        }
        sem3.release();
        sem4.release();
        System.out.println("Se ejecuto p3");
    }
    public void p4(){
        try {
            sem4.acquire();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Se ejecuto p4");
    }

    public static void main(String[] args) {
        Semaforo f=new Semaforo();
        f.p1();
        f.p3();
        f.p2();
        f.p4();
    }
}
