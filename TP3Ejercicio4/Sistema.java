package TP3Ejercicio4;

import java.util.Random;

public class Sistema {
    Actividad[] area= new Actividad[3];
Random r=new Random(4);
    public Sistema(){
    area[0]=new Actividad(5, "Dinosaurios");
    area[1]=new Actividad(7, "Futurismo");
    area[2]=new Actividad(9, "Arte"); 
    }
    public Actividad seleccionar(){
        
        return area[r.nextInt(3)];
    }
    public void asignarReserva(Actividad a){
        a.reservar();
    }
    public static void main(String[] args) {

        Thread[] visitantes= new Thread[20];
        Sistema s=new Sistema();

        System.out.println("Inicia Parque Tematico");
            for (int i = 0; i < visitantes.length; i++) {
                    Visitante v=new Visitante(s);
                    visitantes[i]=new Thread(v, "Visitante_"+i);
                    visitantes[i].start();
                }
            }
}
