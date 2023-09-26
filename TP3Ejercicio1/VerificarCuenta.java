package TP3Ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VerificarCuenta implements Runnable{
    private CuentaBanco cb=new CuentaBanco();
    
    private void HacerRetiro(int cantidad) throws InterruptedException{
        //if (cb.getBalance()>=cantidad){

        cb.retiroBancario(cantidad);
      
        //}
    }

    public void run(){
        for(int i=0;i<=5;i++){
            try {
                this.HacerRetiro(15);
                if(cb.getBalance()<0)
                    System.out.println("la cuenta esta sobre girada.");
            } catch (InterruptedException e) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE,null,e);
                    }
        }
    }
}