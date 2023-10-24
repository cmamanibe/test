package TP4.Ejercicio1;

public class SynchronizedCounter {
    private int c=0;
    public synchronized void increment(){c++;}
    public void decrement(){c--;}
    public synchronized int value(){return c;}

public static void main(String[] args){
    SynchronizedCounter c=new SynchronizedCounter();
    c.increment();
    c.decrement();
    System.out.println(c.value());
}
}