package TP2Ejercicio2;

public class Miejecucion extends Thread {
    public void run(){
        ir();
    };
    public void ir(){
        hacerMas();
    };
    public void hacerMas(){
        System.out.println("En la pila");
    };
}