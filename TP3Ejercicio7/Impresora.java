package TP3Ejercicio7;

public class Impresora {
    public static void main(String[] args) {
        ImprimirLetra iletraA=new ImprimirLetra('A',4);
        ImprimirLetra iletraB=new ImprimirLetra('B',2);
        ImprimirLetra iletraC=new ImprimirLetra('C',5);
        Thread impLetraA=new Thread(iletraA,"Imprime A");
        Thread impLetraB=new Thread(iletraB,"Imprime B");
        Thread impLetraC=new Thread(iletraC,"Imprime C");
        impLetraA.start();
        impLetraB.start();
        impLetraC.start();
    }
}
