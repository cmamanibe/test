package TP3Ejercicio2;

public class Criatura_Oscura implements Runnable {
    private Energia e;

    public Criatura_Oscura(Energia i){
        this.e=i;
    }

    public void run(){
        while(true){
            this.e.drenar();
            if (this.e.nivel<=0){
               try {
                Thread.sleep(1000);
                    System.out.println("se dreno completamente");
                    break;
               } catch (Exception e) {
               
               }
                    
                
            }
        }
    }
}
