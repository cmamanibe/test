package TP5.Ejercicio5;

import java.util.concurrent.Semaphore;

public class Tren {
private int cantidadPasajeros,maximoPasajeros;
Semaphore recorrido=new Semaphore(0); //inicia o finaliza un recorrido
Semaphore ticket=new Semaphore(0);
Semaphore cantPax=new Semaphore(0);

public Tren(){
maximoPasajeros=10;
cantidadPasajeros=0;
}
//metodos de control
public void permitirAbordaje(){
while(cantidadPasajeros<maximoPasajeros){
    cantidadPasajeros++;
    cantPax.release();
}
}
public void permitirDescenso(){

    try {
        recorrido.acquire();
    } catch (Exception e) {
        // TODO: handle exception
    }
}
//metodos de vendedor
public void venderBoleto(){
    if (cantidadPasajeros<maximoPasajeros){
        ticket.release();
    }
}
public boolean inicioRecorrido(){
    return recorrido.availablePermits()==1;
}
//metodos de pasajero
public void comprarTicket(){
    try {
        ticket.acquire();        
    } catch (Exception e) {
        // TODO: handle exception
    }
}
public void presentarTicketControl(){
    try {
        cantPax.acquire();
    } catch (Exception e) {
        // TODO: handle exception
    }
}
public void abordarPasajero(){
    if(cantidadPasajeros==maximoPasajeros){
        try {
            System.out.println("/// inicia Recorrido");
            recorrido.release();
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
public void descenderPasajero(){
    if(cantidadPasajeros!=0){
        cantPax.release();
        cantidadPasajeros--;
    }
}

public static void main(String[] args) {
    Tren trenTuristico=new Tren();
    Pasajero[] listaPasajeros=new Pasajero[50];
    Thread[] hilosPasajeros=new Thread[50];

    ControlTren cTren=new ControlTren(trenTuristico);
    VendedorTickets vTickets=new VendedorTickets(trenTuristico);

    for (int i = 0; i < hilosPasajeros.length; i++) {
        listaPasajeros[i]=new Pasajero(trenTuristico);
        hilosPasajeros[i]=new Thread(listaPasajeros[i],"Pasajero_"+i);
        hilosPasajeros[i].start();
    }

    Thread control=new Thread(cTren,"Control");
    Thread vendedor=new Thread(vTickets,"Vendedor");

    vendedor.start();
    control.start();
}
}
