package TP3Ejercicio5;

public class Surtidor {
    public long capacidadSurtidor;

    public Surtidor(){
        capacidadSurtidor=10000;
    }

    public synchronized void cargarCombustible(int litros){
        try {
            capacidadSurtidor=capacidadSurtidor-litros;
            
            System.out.println("\033[31m"+Thread.currentThread().getName()+": Carga "+litros+" lts. Quedan "+capacidadSurtidor+" en el surtidor.....\u001B[0m");
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
