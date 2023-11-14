package Parcial2023;

import java.util.concurrent.Semaphore;

public class FabricaRC {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    Semaphore semTransp,semCajaVino,semCajaAgua,semVino,semAgua;
    int cantVino, cantAgua, cantCaja;
    int maxVino, maxAgua, maxCaja;

    public FabricaRC(){
        maxAgua=10;
        maxVino=10;
        maxCaja=100;
        semTransp=new Semaphore(0);
        semCajaAgua=new Semaphore(1);
        semCajaVino=new Semaphore(1);
        semVino=new Semaphore(maxVino);
        semAgua=new Semaphore(maxAgua);
        cantAgua=0;
        cantVino=0;
    }

    //Metodos EMBOTELLADOR
    public void colocarenCaja(String tipoBebida){
        switch (tipoBebida) {
            case "Vino":
                    try {
                        semVino.acquire();
                        cantVino++;
                        if(cantVino==maxVino){
                            System.out.println("Se completo una caja de Vino");
                            semCajaVino.acquire();
                            cantVino=0;
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                
                break;
        
            default:
                    try {
                        semAgua.acquire();
                        cantAgua++;
                        if(cantAgua==maxAgua){
                            System.out.println("Se completo una caja de Agua");
                            semCajaAgua.acquire();
                            cantAgua=0;
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                break;
        }
    }
    //Metodos EMPAQUETADOR
    public void empaquetar(){
        if(semCajaAgua.availablePermits()==0){cantCaja++;}
        if(semCajaVino.availablePermits()==0){cantCaja++;}
    }
    public void reponerCaja(){
        if(semCajaAgua.availablePermits()==0){
            semCajaAgua.release();
            semAgua.release(maxAgua);}
        if(semCajaVino.availablePermits()==0){
            semCajaVino.release();;
            semVino.release(maxVino);
        }        
    }
    public void guardaAlmacen(){
        if(cantCaja==maxCaja){
            semTransp.release();
            cantCaja=0;
        }
    }

    //Metodos Transportador
    public void controlAlmacenlleno(){
        try {
            semTransp.acquire();
            System.out.println(green+"Inicia reparto"+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void saleAReparto(){
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
