package TP3Ejercicio2;

public class Sanador implements  Runnable{
    private Energia e;

    public Sanador(Energia i){
        this.e=i;
    }

    public void run(){
        while(true){
            if (this.e.nivel<=0){
                try {
                 Thread.sleep(1000);
                     System.out.println("se dreno completamente");
                     break;
                } catch (Exception e) {
                
                }
                     
                 
             }else{
            this.e.revitalizar();
             }
        }
    }

}
