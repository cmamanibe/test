package Tp1Ejercicio02;

public class Aeropuerto{
    public Alquiler[] alquileres= new Alquiler[5];
    public int cantidadAlquiler;

    public Aeropuerto(){
        cantidadAlquiler=5;
        for(int i=1;i<cantidadAlquiler;i++){
            alquileres[i]= new Alquiler();
        }
    }
}