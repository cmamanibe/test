package TP5.Ejercicio5;

public class ControlTren implements Runnable {
    Tren trenTuristico;
    public ControlTren(Tren t){
        trenTuristico=t;
    }
    public void run(){
        System.out.println("++++Inicia el control de abordaje");
        while(true){
            trenTuristico.permitirAbordaje();
            trenTuristico.permitirDescenso();
        }
    }
}
