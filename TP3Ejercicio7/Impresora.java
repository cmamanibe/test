package TP3Ejercicio7;

public class Impresora {
    public static void main(String[] args) {
        Turnos t=new Turnos('A');
        ImprimirLetra iletraA=new ImprimirLetra('A',4,t);
        ImprimirLetra iletraB=new ImprimirLetra('B',2,t);
        ImprimirLetra iletraC=new ImprimirLetra('C',5,t);
        Thread impLetraA=new Thread(iletraA,"Imprime A");
        Thread impLetraB=new Thread(iletraB,"Imprime B");
        Thread impLetraC=new Thread(iletraC,"Imprime C");
        impLetraA.start();
        impLetraB.start();
        impLetraC.start();
    }
}
