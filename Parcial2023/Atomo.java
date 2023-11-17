package Parcial2023;

import java.util.concurrent.ThreadLocalRandom;

public class Atomo implements Runnable {
    private String clase;
    private MonitorAgua ma;

    public Atomo(MonitorAgua monitor){
        String[] tipoClase={"Oxigeno","Hidrogeno"};
        clase=tipoClase[ThreadLocalRandom.current().nextInt(0,2)];
        ma=monitor;
    }
    public String tipoAtomo(){
        return clase;
    }
    public void run(){
        switch (clase) {
            case "Oxigeno":
                ma.oListo();
                break;
        
            case "Hidrogeno":
                ma.hListo();
                break;
        }
        System.out.println("Finalizo "+Thread.currentThread().getName());
    }
}


