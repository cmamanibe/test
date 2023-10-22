package TP3Ejercicio5;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private long km;

    public Vehiculo(String p_marca, String p_modelo, long p_kilometraje){
        marca=p_marca;
        modelo=p_modelo;
        km=p_kilometraje;
    }

    public long getKm(){
        return km;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }

    public void setKm(long x){
        km=x;
    }

}
