package TP3Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Energia e=new Energia();
        Criatura_Oscura CO=new Criatura_Oscura(e);
        Sanador S=new Sanador(e);
        Thread c=new Thread(CO, "Criatura");
        Thread sanador=new Thread(S,"Sanador");
        System.out.println("Inicia interacción");
        c.start();
        sanador.start();

    }
}
