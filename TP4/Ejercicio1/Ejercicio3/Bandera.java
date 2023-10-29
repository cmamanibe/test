package TP4.Ejercicio1.Ejercicio3;

public class Bandera {
    private int estado;
    public Bandera(){
        estado=1;
    }
    public synchronized int getBandera(){
        return estado;
    }

    public synchronized void cambiarBandera(){
        switch (estado) {
            case 3:
                estado=2;
                break;
            
            case 2:
                estado=1;
                break;

            default:
                estado=3;
                break;
        }
    }
}
