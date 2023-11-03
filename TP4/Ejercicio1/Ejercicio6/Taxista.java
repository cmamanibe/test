package TP4.Ejercicio1.Ejercicio6;

public class Taxista implements Runnable {
    Taxi auto;
    public Taxista(Taxi t){
        auto=t;
    }
    public void run(){
        while(true){
            auto.subirPax();
        }
    }
}
