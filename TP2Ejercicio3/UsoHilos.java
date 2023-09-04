package TP2Ejercicio3;

public class UsoHilos {
    public static void main(String[] args){
        System.out.println("Hilo principal iniciando.");

        miHilo mh1= new miHilo("#1");
        miHilo mh2= new miHilo("#2");
        miHilo mh3= new miHilo("#3");

        Thread nuevoHilo1= new Thread(mh1);
        Thread nuevoHilo2= new Thread(mh2);
        Thread nuevoHilo3= new Thread(mh3);

        nuevoHilo1.start();
        nuevoHilo2.start();
        nuevoHilo3.start();

        for(int i=0;i<50;i++){
            System.out.print(" .");
        }
        try {
           // Thread.sleep(100);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Hilo principal Interrumpido.");
        }
        System.out.println("Hilo principal Finalizado.");
    }
}
