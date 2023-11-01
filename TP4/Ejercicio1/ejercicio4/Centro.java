package TP4.Ejercicio1.ejercicio4;

public class Centro {

    public static void main(String[] args) {
        int n=10;
        GestorImpresoras gestor=new GestorImpresoras();
        Clientes[] Clients=new Clientes[n];
        Thread[] t= new Thread[n];

        for (int i = 0; i < t.length; i++) {
            Clients[i]=new Clientes(gestor);
            t[i]=new Thread(Clients[i], "Cliente_"+i);
            t[i].start();
        }

        
    }
}
