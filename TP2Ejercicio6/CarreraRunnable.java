package TP2Ejercicio6;

public class CarreraRunnable {
    
    public static void main(String[] args){

        CorredorRunnable[] arrayAtleta= new CorredorRunnable[10];

        Thread[] arrayCorredores=new Thread[10];

        for(int x=0;x<10;x++){
            arrayAtleta[x]=new CorredorRunnable("Corredor_"+x);
            arrayCorredores[x]=new Thread(arrayAtleta[x], "Atleta_"+x);
        }
    
        System.out.println("Inicia la carrera:");
    
        for(int j=0;j<10;j++){
            arrayCorredores[j].start();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }       
        System.out.println("Finalizo la carrera");
        for(int i=0;i<10;i++){
           arrayAtleta[i].status();
        }
        }
}
