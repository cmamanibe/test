package TP3Ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VerificarCuenta implements Runnable{
    private CuentaBanco cb=new CuentaBanco();
    
    private void HacerRetiro(int cantidad) throws InterruptedException{
        if (cb.getBalance()>=cantidad){
        System.out.println(Thread.currentThread().getName()+
        " esta realizanso un retiro de: "+cantidad+" $");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        cb.retiroBancario(cantidad);
        System.out.println(Thread.currentThread().getName()+
        ": Retiro realizado.");
        System.out.println(Thread.currentThread().getName()+ 
        ": Los fondos son de: "+cb.getBalance()+" $");
        }else{
            System.out.println("No hay suficiente dinero enla cuenta para"+
             "realizar el retiro sr.: "+Thread.currentThread().getName());
             System.out.println("Su saldo actual es de: "+cb.getBalance());
             try {
                Thread.sleep(1000);
             } catch (Exception e) {
                
             }
        }
    }

    public void run(){
        for(int i=0;i<=3;i++){
            try {
                this.HacerRetiro(10);
                if(cb.getBalance()<0)
                    System.out.println("la cuenta esta sobre girada.");
            } catch (InterruptedException e) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE,null,e);
                    }
        }
    }
}