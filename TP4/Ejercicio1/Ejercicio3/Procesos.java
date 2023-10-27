package TP4.Ejercicio1.Ejercicio3;

public class Procesos implements Runnable {
    private int ordenEjecucion;
    private int numeroOrden;
    public Procesos(int orden, int bandera){
        numeroOrden=orden;
        ordenEjecucion=bandera;
    }
    public void run(){
        while (true) {
            if (ordenEjecucion==numeroOrden)
                synchronized((Object) ordenEjecucion){
                System.out.println("Se ejecuta P"+Thread.currentThread().getName());
                if (ordenEjecucion==3){
                    ordenEjecucion=1;
                }else{
                    ordenEjecucion++;
                }
            }
        }

    }
}
