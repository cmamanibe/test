package TP3Ejercicio3;

public class Rueda {

    public boolean uso;
    public Rueda(){   
        uso=false;
     }

    public synchronized void ejercitar(){
        try {
            System.out.println(Thread.currentThread().getName()+": ejercitandose");
            uso=true;
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
