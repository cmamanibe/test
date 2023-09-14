package TP2Ejercicio7;

public class Supermercado {
    public static void main(String[]args){
        Cliente cliente1=new Cliente("Pepe",new int[]{2,2,1,5,2,3});
        Cliente cliente2=new Cliente("Juan", new int[]{1,3,5,1,1});
        long initialTime=System.currentTimeMillis();
        CajeroThread cajero1= new CajeroThread("Maria",cliente1,initialTime);
        CajeroThread cajero2= new CajeroThread("Paula",cliente2,initialTime);
        cajero1.start();
        cajero2.start();

        }
}
