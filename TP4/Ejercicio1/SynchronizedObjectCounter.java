package TP4.Ejercicio1;

public class SynchronizedObjectCounter {
    private int c=0;
    public void increment(){
        Object x= (Integer) c;
        synchronized (x){c++;}
    }
    public void decrement(){
        synchronized (this){c--;}
    }
    public int value(){return c;}
    public static void main(String[] args){
        SynchronizedObjectCounter c=new SynchronizedObjectCounter();
        c.increment();
        System.out.println(c.value());
        c.decrement();
        System.out.println(c.value());
    }
}
