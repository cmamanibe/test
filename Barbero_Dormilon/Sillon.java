package Barbero_Dormilon;

import java.util.concurrent.Semaphore;

public class Sillon {
    
    private Semaphore semSillon=new Semaphore(1,true);
    //El valor true organiza el orden de ejecucion
    private Semaphore semBarbero=new Semaphore(0);
    private Semaphore semSalida=new Semaphore(0);

    public Sillon(){
            this.semSillon.release();
    }

    public void usarSillon(Barbero b){
        try{
        this.semSillon.acquire();
        this.semBarbero.release();
        }catch(Exception e){

        }
    }
    public void esperarCliente(){
        try{
        this.semBarbero.acquire();
        }catch(Exception e){
            
        }
    }

    public void liberarSillon(){
        try{
            this.semSalida.acquire();
            this.semSillon.release();
            this.semBarbero.acquire();
        }catch(Exception e){

        }
}
}