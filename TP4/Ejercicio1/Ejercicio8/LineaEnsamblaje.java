package TP4.Ejercicio1.Ejercicio8;

public class LineaEnsamblaje implements Runnable{
    ControladorProd cp;
    public LineaEnsamblaje(ControladorProd c){
        cp=c;
    }
    public void run(){
        while(true){
        cp.iniciaLinea();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
     }
    }
}
