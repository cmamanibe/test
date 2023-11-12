package TP5.EjercicioHamster;

import java.util.concurrent.ThreadLocalRandom;

public class HamsterMonitor implements Runnable {
    private Plato comida;
    private Rueda ejercicio;
    private String miNombre;

    public HamsterMonitor(Plato laComida, Rueda elEjercicio, String nombre){
        comida=laComida;
        ejercicio= elEjercicio;
        miNombre=nombre;
    }
    public void run(){
        while(true){
            comida.empezarAComer(miNombre);
            try {
                Thread.sleep((long) ThreadLocalRandom.current().nextInt(1,5)*1500);
            } catch (Exception e) {
                // TODO: handle exception
            }
            comida.terminarDeComer(miNombre);
            ejercicio.rodar(miNombre);
        }
    }
   /*public void run(){
        while(true){
            comida.comer(miNombre);
            ejercicio.rodar(miNombre);
            try{
                Thread.sleep(ThreadLocalRandom.current().nextInt(1,5)*3500);
            }catch(InterruptedException ex){

            }
            
        }
    }*/
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Rueda r=new Rueda();
        Plato p=new Plato(2);
        HamsterMonitor[] hm=new HamsterMonitor[5];
        Thread[] listaHamster=new Thread[5];
        for (int i = 0; i < listaHamster.length; i++) {
            hm[i]=new HamsterMonitor(p, r, "rata"+i);
            listaHamster[i]=new Thread(hm[i],"hiloHamster"+i);
           listaHamster[i].start();  
        }    


    }
}
