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
       boolean salida=true;
        switch (clase) {
            case "Oxigeno":
                ma.oListo();
                break;
        
            case "Hidrogeno":
                ma.hListo();
                break;
        }
        while(salida){
            try {
                salida=ma.hacerAgua();//hacer agua
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}


