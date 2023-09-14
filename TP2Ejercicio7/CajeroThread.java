package TP2Ejercicio7;

public class CajeroThread extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeroThread(String nombreCajero, Cliente c,long init){
        this.nombre=nombreCajero;
        this.cliente=c;
        this.initialTime=init;
    }

    public void run(){
        System.out.println("El cajero "+this.nombre +" COMIENZA A PROCESARR LA COMPRA DEL CLIENTE "
        +this.cliente.getNombre()+" EN EL TIEMPO:"+(System.currentTimeMillis()-this.initialTime)/1000+"seg");

        for(int i=0; i<this.cliente.getCarroCompra().length;i++){
            this.esperarXsegundos(this.cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto "+ (i+1)+"-> Tiempo: "+
            (System.currentTimeMillis()-this.initialTime)/1000+"seg");
        }
        System.out.println("El cajero "+this.nombre+" HA TERMINADO DE PROCESAR "+
        this.cliente.getNombre()+" EN EL TIEMPO: "+ (System.currentTimeMillis()-this.initialTime)/1000+"seg");
    }

    private void esperarXsegundos(int i) {
        try {
            long espera=i*1000;
            Thread.sleep(espera);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
