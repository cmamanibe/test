package TP2Ejercicio3;

public class RunnableEjemplo implements Runnable {
   // String nombre;
    ///public RunnableEjemplo(){
      //  this.nombre=str;
    //}
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println(i+" "+ Thread.currentThread().getName());
    System.out.println("Termina thread " + Thread.currentThread().getName());
    };
   }
    
    public static void main(String[] args){
       RunnableEjemplo mJ= new RunnableEjemplo();
       RunnableEjemplo jM= new RunnableEjemplo();

       Thread mJose = new Thread(mJ,"Maria Jose");
       Thread jMaria= new Thread(jM,"Jose Maria");

       mJose.start();
       jMaria.start();
        
       System.out.println("Termina thread main");
    }
   
   
