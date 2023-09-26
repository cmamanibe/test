package TP3Ejercicio1;

public class CuentaBanco{
    private int balance=50;
    public CuentaBanco(){

    }
    public synchronized int getBalance(){
        return balance;
    }
    public synchronized void retiroBancario(int retiro){
        if (balance >=retiro){
            System.out.println(Thread.currentThread().getName()+
            " esta realizando un retiro de: "+retiro +"$.");
            balance=balance-retiro;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.println(Thread.currentThread().getName()+": Retiro realizado.");
            System.out.println(Thread.currentThread().getName()+": Los fondos son de: "+balance+"$.");
        }else{
            System.out.println("No hay suficiente dinero en la cuenta para realizar retiro Sr. "+
            Thread.currentThread().getName());
            System.out.println("Su saldo es de: "+ balance+"$.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}