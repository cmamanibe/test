package TP4.Ejercicio1.ejercicio4;

public class Impresora {
    private String estado;
    public Impresora(){
        estado="Disponible";
    }
    public void setOcupada(){
        estado="Ocupada";
    }
    public void setDisponible(){
        estado="Disponible";
    }
    public String getEstado(){
        return estado;
    }
}