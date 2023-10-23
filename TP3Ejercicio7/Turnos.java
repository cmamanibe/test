package TP3Ejercicio7;

public class Turnos {
    private char c;
    public Turnos(){
    }
    public Turnos(char caracter){
        c=caracter;
    }
    public synchronized char turnoDe(){
        return c;
    }
    public synchronized void cambiarTurno(){
        switch (c) {
            case 'A':
                c='B';
                break;
            case 'B':
                c='C';
                break;
            case 'C':
                c='A';
                break;
        }

    }
}
