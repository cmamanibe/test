package TP3Ejercicio7;

public class ImprimirLetra implements Runnable {
    private char c;
    private int cantidad;
    private Turnos turno;
    public ImprimirLetra(char caracter, int cantVeces){
        c=caracter;
        cantidad=cantVeces;
        turno=new Turnos(c);
    }
    public synchronized void run(){
        while (true){
            if(turno.turnoDe()==c){
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(c);
                }
                turno.cambiarTurno();
            }
            
        }
    }
}
