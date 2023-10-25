package TP4.Ejercicio1;

public class SynchronizedObjectCounter {
    private int c=0;
    public void increment(){
        synchronized (c){c++;}
    }
    public void decrement(){
        synchronized (this){c--;}
    }
    public int value(){return c;}
}
