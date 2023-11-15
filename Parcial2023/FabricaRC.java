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

    public Semaphore semTransp,semCajaVino,semCajaAgua,semVino,semAgua;
    public int cantVino, cantAgua, cantCaja;
    public int maxVino, maxAgua, maxCaja;

    public FabricaRC(){
        maxAgua=5;
        maxVino=5;
        maxCaja=3;
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
                            System.out.println(blue+" Se completo una caja de Vino"+reset);
                            semCajaVino.acquire();
                            cantVino=0;
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                
                break;
        
            case "Agua":
                    try {
                        semAgua.acquire();
                        cantAgua++;
                        if(cantAgua==maxAgua){
                            System.out.println(blue+" Se completo una caja de Agua"+reset);
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
            System.out.println(yellow+" ////// Empaquetador repone CAJA AGUA /////"+reset);
            semCajaAgua.release();
            semAgua.release(maxAgua);}
        if(semCajaVino.availablePermits()==0){
            System.out.println(yellow+" ////// Empaquetador repone CAJA VINO /////"+reset);
            semCajaVino.release();;
            semVino.release(maxVino);
        }        
    }
    public void guardaAlmacen(){
        if(cantCaja==maxCaja){
            System.out.println(yellow+" /+/+/+/+/+/ Empaquetador GUARDA CAJA EN ALMACEN /+/+/+/+/"+reset);
            semTransp.release();
            cantCaja=0;
        }
    }

    //Metodos Transportador
    public void controlAlmacenlleno(){
        try {
            semTransp.acquire();
            System.out.println(green+"++++++ Inicia reparto ++++++"+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void saleAReparto(){
        try {
            Thread.sleep(1000);
            System.out.println(green+"++++ Transportador vuelve a Almacen ++++"+reset);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
