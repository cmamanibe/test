package TP3Ejercicio5;

public class Auto extends Vehiculo implements Runnable{
    private String patente;
    private int capacidad_Combustible;
    private int combustibleActual;
    private int nivelReserva;
    private Surtidor s;
    String black="\033[30m"; 
String red="\033[31m"; 
String green="\033[32m"; 
String yellow="\033[33m"; 
String blue="\033[34m"; 
String purple="\033[35m"; 
String cyan="\033[36m"; 
String white="\033[37m";
String reset="\u001B[0m";
    
    public Auto(String p, String mark, String mod, long kilo, Surtidor y,int xlts){
        super(mark, mod, kilo);
        patente=p;
        capacidad_Combustible=xlts;
        combustibleActual=xlts;
        nivelReserva=10;
        this.s=y;
    }

    public void verAuto(){
        System.out.println("Dominio: "+patente);
        System.out.println("Modelo:"+this.getModelo());
        System.out.println("Kilometraje: "+this.getKm());

    }

    public boolean recargarCombustible(){
        return (combustibleActual<=nivelReserva);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
        while(true){
            System.out.println(Thread.currentThread().getName()+": recorrio "+this.getKm()+" km.");
            if (combustibleActual<12){
                
                 System.out.println(blue+Thread.currentThread().getName()+": tiene "+combustibleActual+ " lts de los "+capacidad_Combustible+" lts de capacidad"+reset);
                 this.s.cargarCombustible(capacidad_Combustible-combustibleActual);
                 combustibleActual=capacidad_Combustible;
            }else{
                this.setKm(this.getKm()+100);
            combustibleActual=combustibleActual-12;
            if (recargarCombustible()){
                System.out.println(blue+Thread.currentThread().getName()+": tiene "+combustibleActual+ " lts de los "+capacidad_Combustible+" lts de capacidad "+reset);
                this.s.cargarCombustible(capacidad_Combustible-combustibleActual);
                combustibleActual=capacidad_Combustible;
            }
        }

        }
    }
   
}
