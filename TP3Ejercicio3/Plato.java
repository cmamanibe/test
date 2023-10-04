package TP3Ejercicio3;

public class Plato {
    
    public boolean uso;

    public Plato(){
        uso=false;
    }

    public synchronized void platoComida(){
        try {
          System.out.println(Thread.currentThread().getName()+": alimentandose");
          uso=true;
          Thread.sleep(1000);  
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
