package TP2Ejercicio7;

public class Supermercado {
    public static void main(String[]args){
        Cliente cliente1=new Cliente("Pepe",new int[]{2,2,1,5,2,3});
        Cliente cliente2=new Cliente("Juan", new int[]{1,3,5,1,1});

        Cajero cajero1= new Cajero("Maria");
        long initialTime=System.currentTimeMillis();
        cajero1.procesarCompra(cliente1, initialTime);
        cajero1.procesarCompra(cliente2, initialTime);
    }
}
