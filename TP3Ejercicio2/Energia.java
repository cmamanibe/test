package TP3Ejercicio2;

public class Energia {
    public int nivel;

    public Energia(){
        nivel=10;
    }

    public void drenar(){
        System.out.println(Thread.currentThread().getName()+": Drena energia");
        nivel=nivel-3;
        System.out.println(nivel);
    }

    public void revitalizar(){
        System.out.println(Thread.currentThread().getName()+": Revitaliza energia");
        nivel=nivel+3;
        System.out.println(nivel);
    }
}