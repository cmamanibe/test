package TP3Ejercicio3;

public class Main {
    
    public static void main(String[] args) {
        Hamster c=new Hamster();
        Thread[] grupo=new Thread[3];
        System.out.println("Iniciar main hamster");
        for (int i = 0; i < grupo.length; i++) {
            grupo[i]=new Thread(c, "hamster_"+i);
            grupo[i].start();
        }

    }
}
