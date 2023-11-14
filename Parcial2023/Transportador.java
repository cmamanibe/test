package Parcial2023;

public class Transportador implements Runnable{
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    FabricaRC frc;

    public Transportador(FabricaRC fabrica){
        frc=fabrica;
    }

    public void run(){
        System.out.println(purple+"----- Inicia Transportador-----"+reset);
        while (true) {
            frc.controlAlmacenlleno();
            frc.saleAReparto();            
        }
    }
}
