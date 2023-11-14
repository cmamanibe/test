package TP5.Ejercicio5;

public class Pasajero implements Runnable{
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    Tren trenTuristico;
    public Pasajero(Tren t){
        trenTuristico=t;
    }
    public void run(){
        int numeroViaje=1;
        while(true){
           
            trenTuristico.comprarTicket();
            trenTuristico.presentarTicketControl();
            System.out.println(green+Thread.currentThread().getName()+" inicia viaje "+numeroViaje+reset);
            trenTuristico.abordarPasajero();
            System.out.println(green+Thread.currentThread().getName()+" Ascendio al tren "+reset);
            trenTuristico.descenderPasajero();
            System.out.println(green+Thread.currentThread().getName()+" Descendio del tren "+reset);
            numeroViaje++;
        }
    }
    
}
