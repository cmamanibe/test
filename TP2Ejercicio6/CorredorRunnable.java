package TP2Ejercicio6;

import java.util.Random;

public class CorredorRunnable implements Runnable {
        int distanciaRecorrida;
    
    public void run(){

        Random ran=new Random();
        while (distanciaRecorrida<100){ 
                distanciaRecorrida=distanciaRecorrida+ran.nextInt(10);
                System.out.println("Corriendo "+Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

    }
}
    public CorredorRunnable(){
      
        distanciaRecorrida=0;
    }

    public void status(){
        System.out.println(Thread.currentThread().getName()+" recorrio: "+this.distanciaRecorrida);
    }
}
