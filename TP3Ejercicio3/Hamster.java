package TP3Ejercicio3;

public class Hamster implements Runnable {
    private Hamaca descanso;
    private Rueda correr;
    private Plato comer;

    public Hamster(){
        descanso=new Hamaca();
        correr=new Rueda();
        comer=new Plato();
    }

    public boolean realizo_todas_las_actividades(){
        return (descanso.uso)&&(comer.uso)&&(correr.uso);
    }

    public void run(){
        while(!realizo_todas_las_actividades()){
            this.comer.platoComida();
            this.correr.ejercitar();
            this.descanso.hamacar();
        }
    }
}
