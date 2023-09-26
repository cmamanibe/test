package TP3Ejercicio1;

public class Main {
    public static void main(String[] args){
        VerificarCuenta vc_l=new VerificarCuenta();
        VerificarCuenta vc_m=new VerificarCuenta();
        
        Thread Luis= new Thread(vc_l,"Luis");
        Thread Manuel =new Thread(vc_m,"Manuel");
        Luis.start();
        Manuel.start();
    }
}