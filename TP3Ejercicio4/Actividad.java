package TP3Ejercicio4;

public class Actividad {
    public String nombre;
    public int disponible;
    public int max_disponible;
    public String[] reservas;

    public Actividad(int i, String n){
        disponible=i;
        max_disponible=i;
        nombre=n;
        reservas=new String[disponible];
    }

    private synchronized boolean reservaPrevia(){
        boolean encontrado=false;
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i]==Thread.currentThread().getName()){
                encontrado=true;
            }
        }
        return encontrado;
    }

    public synchronized void reservar(){
        if (disponible>0){
            if (!reservaPrevia()){
            reservas[disponible-1]=Thread.currentThread().getName();
            disponible--;
            System.out.println(Thread.currentThread().getName() + ": reservo 1 lugar en Actividad "+nombre);
            }
        }else{
            try {
                System.out.println("La actividad "+nombre+" se completo la reserva");
                System.out.println("-------------------------------------");
                Thread.sleep(5000);
                System.out.println("Finaliza las reservas de "+ nombre);
                for (int i = 0; i < reservas.length; i++) {
                    reservas[i]="";
                    disponible=max_disponible;
                }                
            }catch (Exception e) {
                
            }
        }
    }  
}

