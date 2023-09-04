package TP2Ejercicio3;

public class miHilo implements Runnable{
    String nombreHilo;

    miHilo(String nombre){
        nombreHilo=nombre;
    }

    public void run(){
        System.out.println("Comenzando "+ nombreHilo);
        try {
            for(int contar=0; contar<10;contar++){
                Thread.sleep(400);
                System.out.println("En "+nombreHilo+", el recuento  "+contar);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(nombreHilo+ " Interrumpido.");
        }
        System.out.println("Terminado "+nombreHilo);
    }
    
}
