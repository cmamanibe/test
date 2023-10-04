package TP3Ejercicio3;

public class Hamaca {
    public boolean uso;

    public Hamaca(){
        uso=false;
    }

    public synchronized void hamacar(){
        try {
            System.out.println(Thread.currentThread().getName()+": hamacandose");
            uso=true;
            Thread.sleep(1000);
           
        } catch (Exception e) {
            
        }
    }
}
