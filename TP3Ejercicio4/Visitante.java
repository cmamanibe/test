package TP3Ejercicio4;

public class Visitante implements Runnable {
   private Sistema s;

   public Visitante(Sistema x){  
        this.s=x;
    }

    public void run(){
        while(true){
            this.s.asignarReserva(this.s.seleccionar());
        }
    }


}
