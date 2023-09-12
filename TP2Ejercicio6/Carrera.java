package TP2Ejercicio6;

public class Carrera {

    public static void main(String[] args){
    Corredor[] corredores=new Corredor[10];

    for(int i=0;i<10;i++){
        corredores[i]=new Corredor("Atleta_"+i);
    }
    System.out.println("Inicia la carrera:");

    for(int j=0;j<10;j++){
        corredores[j].start();
    }
    try {
        Thread.sleep(10000);
    } catch (Exception e) {
        // TODO: handle exception
    }       
    System.out.println("Finalizo la carrera");
    for(int j=0;j<10;j++){
        corredores[j].status();
    }
    }
}
