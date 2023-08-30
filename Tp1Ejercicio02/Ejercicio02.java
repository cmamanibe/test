package Tp1Ejercicio02;

import java.util.Calendar;
//import java.util.Date;


public class Ejercicio02 {
    public static double calcularAlquiler(int horas, int metros,int costoBase){
        return (horas%(20*metros)+costoBase);
    }
    public static void main(String[] args){
        int valorAlquiler=250;
        Calendar cal= Calendar.getInstance();
        cal.set(2020,1,1);
        Aeropuerto aero= new Aeropuerto();
        Avion nave1=new Avion("ABC", 20, cal.getTime() );
        Cliente cl=new Cliente("Cesar",12345);
        double x;
        x = calcularAlquiler(72,nave1.getLargo(),valorAlquiler);
        aero.alquileres[1].costoAlquiler=x;
        aero.alquileres[1].dCliente=cl;
        aero.alquileres[1].dAvion=nave1;
        aero.alquileres[1].f_Inicio=cal.getTime();
        cal.add(3,72);
        aero.alquileres[1].f_Fin=cal.getTime();

        System.out.println("costo alquiler: "+ aero.alquileres[1].costoAlquiler);
        System.out.println("Inicio del alquiler: "+ aero.alquileres[1].f_Inicio);
        System.out.println("Fin del alquiler: "+ aero.alquileres[1].f_Fin);
        System.out.println("Matricula Avion: "+ aero.alquileres[1].dAvion.Matricula);
        System.out.println("Cliente: "+ aero.alquileres[1].dCliente.getName());
        System.out.println("DNI: "+ aero.alquileres[1].dCliente.getDNI());
        System.out.println("Posicion: "+ aero.alquileres[1].numero_Posicion);
    }
}
