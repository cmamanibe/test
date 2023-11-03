package TP4.Ejercicio1.Ejercicio6;

public class Pasajero implements Runnable {
    public boolean viajando;
    public Taxi taxi;
    public Pasajero(Taxi t){
        taxi=t;
        viajando=false;
    }

    public void run(){
        while (true) {
            taxi.subirPax();
            taxi.bajarPax();
        }
    }
}
