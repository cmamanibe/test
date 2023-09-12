package TP2Ejercicio7;

public class Cliente {
    private String nombre;
    private int[] carroCompra;

    public Cliente(String nombreCliente, int[] tiempoProcesaProducto){
    this.nombre=nombreCliente;
    this.carroCompra=tiempoProcesaProducto;
}

    public String getNombre(){
        return nombre;
    }

    public int[] getCarroCompra(){
        return carroCompra;
    }
}
