package Parcial2023;

public class Empaquetador implements Runnable{
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
    public Empaquetador(FabricaRC fabrica){
        frc=fabrica;
    }
    public void run(){
        System.out.println(yellow+"----- inicia Empaquetador----"+reset);
        int i=0;
        while(true){
            frc.empaquetar();
            frc.reponerCaja();
            frc.guardaAlmacen();
            i++;
            try {
                if (i==100) {
                    Thread.sleep(10000);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
