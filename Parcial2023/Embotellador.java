package Parcial2023;
import java.util.concurrent.ThreadLocalRandom;

public class Embotellador implements Runnable{
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    private String tipoEmb;
    FabricaRC frc;

    public Embotellador(FabricaRC fabrica){
    String[] listaProd={"Vino","Agua"};
    tipoEmb=listaProd[ThreadLocalRandom.current().nextInt(0,2)];
    frc=fabrica;
    }
    public void run(){
        System.out.println(blue+"------Inicia Embotellador _"+tipoEmb+" -----"+reset);
        while(true){
            this.preparaBotella();
            frc.colocarenCaja(tipoEmb);
        }
    }
    public void preparaBotella(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
