package TP4.Ejercicio1.Ejercicio8;

import java.util.concurrent.ThreadLocalRandom;

public class Producto implements Runnable{
    private String[] tipos={"Mecanico","Electrico"};
    private String tipo;
    ControladorProd cp;

    public Producto(ControladorProd c){
        cp=c;
        tipo=tipos[ThreadLocalRandom.current().nextInt(0,1)];
    }
    public String getTipo(){
        return tipo;
    }

    public void run(){
            cp.sensorEntrada(this.getTipo());
            try {
            Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("Sale "+getTipo()+" "+ Thread.currentThread().getName());
            cp.sensorSalida(this.getTipo());

    }
}
