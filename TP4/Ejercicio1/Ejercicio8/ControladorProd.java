package TP4.Ejercicio1.Ejercicio8;

import java.util.concurrent.Semaphore;

public class ControladorProd {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    public int cantElectrico=8;
    public int cantMecanico=7;
    Semaphore semElectrico=new Semaphore(cantElectrico);
    Semaphore semMecanico=new Semaphore(cantMecanico);
    Semaphore semLineaElectrica=new Semaphore(1);
    Semaphore semLineaMecanica=new Semaphore(1);

    public ControladorProd(){

    }
    public void iniciaLinea(){
        try {
            semLineaElectrica.acquire();
            semLineaMecanica.acquire();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void cambiaLineas(){
        while (true) {
            System.out.println(red+"---- CAMBIA LINEAS -----"+reset);
            System.out.println(green+"Linea ensamblaje Electrica habilitadas: "+semLineaElectrica.availablePermits()+reset);
            System.out.println(blue+"Linea ensamblaje Mecanica habilitadas: "+semLineaMecanica.availablePermits()+reset);
            try{
            if(semLineaElectrica.availablePermits()==0){
                semLineaElectrica.release();
                semLineaMecanica.acquire();
            }else{
                semLineaElectrica.acquire();
                semLineaMecanica.release();
            }
            Thread.sleep(5000);
         }catch(Exception e){

         }
        }
    }
    public void sensorEntrada(String tipo){
        switch (tipo) {
            case "Mecanico":
                //llegaMecanico()
                try {
                    System.out.println("Llega producto Mecanico"+Thread.currentThread().getName());
                    semLineaMecanica.acquire();
                    semMecanico.acquire();
                    semLineaMecanica.release();
                    cambiaLineas();                                       
                } catch (Exception e) {
                }
                break;
            default:
                //llegaElectrico()
            try {   
                System.out.println("Llega producto Electrico"+Thread.currentThread().getName());
                    semLineaElectrica.acquire();
                    semElectrico.acquire();
                    semLineaElectrica.release();
                    cambiaLineas();                                       
                } catch (Exception e) {
                }
                break;
        }
    }
    public void sensorSalida(String tipo){
        switch (tipo) {
            case "Mecanico":
                
                try {
                    semMecanico.release();                                       
                } catch (Exception e) {
                }
                break;
            default:
                
                try {
                    semElectrico.release();                                     
                } catch (Exception e) {
                }
                break;
        }
    }

    public static void main(String[] args) {
        ControladorProd control=new ControladorProd();
        Producto[] producto=new Producto[16];
        Thread[] hilosProductos=new Thread[16];
       
        LineaEnsamblaje lineaElectrica=new LineaEnsamblaje(control);
        LineaEnsamblaje lineaMecanica=new LineaEnsamblaje(control);

        Thread lElectrica=new Thread(lineaElectrica,"L.Electrica");
        Thread lMecanica=new Thread(lineaMecanica,"L.Mecanica");

        for (int i = 0; i < producto.length; i++) {
            producto[i]=new Producto(control);
            hilosProductos[i]=new Thread(producto[i],"producto_"+i);

            hilosProductos[i].start();
        }
        lElectrica.start();
        lMecanica.start();
    }
}
