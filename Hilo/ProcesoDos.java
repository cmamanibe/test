package Hilo;

public class ProcesoDos implements Runnable{
    private Datos unDato;
    public ProcesoDos(Datos unD){
    unDato = unD;
    }
    public void run(){
    System.out.println("estoy en ProcesoDos");
    unDato.setDato(unDato.getDato()+10);
    }
    }
