package TP2Ejercicio7;

public class Cajero {
    private String nombre;

    public Cajero(String nombreCajero){
        this.nombre=nombreCajero;
    }

    public void procesarCompra(Cliente cliente, long timeStamp){
        System.out.println("El cajero "+this.nombre +" COMIENZA A PROCESARR LA COMPRA DEL CLIENTE "
        +cliente.getNombre()+" EN EL TIEMPO:"+(System.currentTimeMillis()-timeStamp)/1000+"seg");

        for(int i=0; i<cliente.getCarroCompra().length;i++){
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto "+ (i+1)+"-> Tiempo: "+
            (System.currentTimeMillis()-timeStamp)/1000+"seg");
        }
        System.out.println("El cajero "+this.nombre+" HA TERMINADO DE PROCESAR "+
        cliente.getNombre()+" EN EL TIEMPO: "+ (System.currentTimeMillis()-timeStamp)/1000+"seg");
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
