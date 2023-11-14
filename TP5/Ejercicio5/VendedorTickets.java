package TP5.Ejercicio5;

public class VendedorTickets implements Runnable {
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    Tren trenTuristico;
    public VendedorTickets(Tren t){
        trenTuristico=t;
    }
    public void descansar(){
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
   }
    public void run(){
        int numeroBoleto=1;
        System.out.println(yellow+"---- Inicia venta de Tickets------"+reset);
        while(true){
            trenTuristico.venderBoleto();
            System.out.println(purple+"---- Se Vendio boleto "+numeroBoleto+" "+reset);
            numeroBoleto++;
            if(trenTuristico.inicioRecorrido()) this.descansar();
        }
    }
}
