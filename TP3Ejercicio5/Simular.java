package TP3Ejercicio5;

public class Simular {
    
    public static void main(String[] args) {
        Surtidor x=new Surtidor();
        Thread[] transito=new Thread[5];
        System.out.println("Inicia recorrido vehiculos");
        for (int i = 0; i < transito.length; i++) {
            Auto a=new Auto("pat_"+i, "VW", "200"+i,(i+1)*10000, x, (i+1)*20);
            transito[i]=new Thread(a,"pat_"+i);
            transito[i].start();
        }

    }
}
