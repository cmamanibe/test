package TP2Ejercicio6;

public class CarreraRunnable {
    
    public static void main(String[] args){

        CorredorRunnable Atleta= new CorredorRunnable();

        Thread[] corredores;

        for(int x=0;x<10;x++){
            corredores[x]=new Thread(Atleta, "Atleta_"+x);
        }
    
        System.out.println("Inicia la carrera:");
    
        for(int j=0;j<10;j++){
            corredores[j].start();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }       
        System.out.println("Finalizo la carrera");
        for(int j=0;j<10;j++){
            corredores[j]
        }
        }
}
