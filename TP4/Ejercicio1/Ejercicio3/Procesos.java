package TP4.Ejercicio1.Ejercicio3;

public class Procesos implements Runnable {
    private Bandera ordenEjecucion;
    private int numeroOrden;
    
    public Procesos(int orden, Bandera bandera){
        numeroOrden=orden;
        ordenEjecucion=bandera;
    }
    public void run(){
        while (true) {
            if (ordenEjecucion.getBandera()==numeroOrden){
                System.out.println("Se ejecuta P"+Thread.currentThread().getName());
                ordenEjecucion.cambiarBandera();
        }
        }

    }
}
