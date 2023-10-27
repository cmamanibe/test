package TP4.Ejercicio1.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        int bandera=1;
        Procesos p;
        Thread[] hilos=new Thread[3];

        for (int i = 0; i < hilos.length; i++) {
            p=new Procesos(i+1,bandera);
            hilos[i]=new Thread(p,"-"+(i+1));
            hilos[i].start();
            }
    }
}
