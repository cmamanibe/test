package Hilo;

public class ProcesoUno implements Runnable{
    private Datos unDato;
    public ProcesoUno(Datos unD){
    unDato = unD;
    }
    public void run(){
    System.out.println("estoy en ProcesoUno");
    if (unDato.getDato() > 100)
     System.out.println(unDato.getDato());
    else
     System.out.println(unDato.getDato()-50);
    }
    }
