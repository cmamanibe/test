package TP4.Ejercicio1.ejercicio4;

public class Centro {

    public static void main(String[] args) {

        Clientes[] Clients=new Clientes[n];
        Thread[] t= new Thread[n];

        for (int i = 0; i < t.length; i++) {
            
            Clients[i]=new Clientes();
            t[i]=new Thread(Clients[i], "Cliente_"+i);
            t[i].start();
        }

        
    }
}
