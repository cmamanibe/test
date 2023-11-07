package TP4.Ejercicio1.Ejercicio7;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Confiteria {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";

    private String[] menu={"Cafe","Pollo","Papas"};
    Semaphore semEmpleado=new Semaphore(0);
    Semaphore semMozo=new  Semaphore(1);
    public Confiteria(){

    }

//Metodos mozo tomar pedido y servir empleado
public void tomarPedido(){
    try {
        System.out.println(yellow+" Toma un pedido el mozo "+reset);
        semEmpleado.acquire();
    } catch (Exception e) {
        // TODO: handle exception
    }
}
public void servirEmpleado(){
    semMozo.release();
}

//Metodo empleado solicitar menu y liberar silla
public void pedirMenu(){
    try {
        semMozo.acquire();
        Thread.sleep(1000);
        System.out.println(green+"Selecciona menu "+menu[ThreadLocalRandom.current().nextInt(0,2)]+reset);
    } catch (Exception e) {
        // TODO: handle exception
    }
}
public void liberarSilla(){
    System.out.println(red+"Finalizo comida el empleado"+reset);
    semEmpleado.release();
}

public static void main(String[] args) {
    Confiteria resto=new Confiteria();
    Mozo mesero=new Mozo(resto);
    Thread hilomesero=new Thread(mesero,"MOZO");

    Empleado[] emp=new Empleado[3];
    Thread[] hilosEmpleados=new Thread[3];

    for (int i = 0; i < hilosEmpleados.length; i++) {
        emp[i]=new Empleado(resto);
        hilosEmpleados[i]=new Thread(emp[i],"Empleado_"+i);

        hilosEmpleados[i].start();
    }
    hilomesero.start();
}
}
