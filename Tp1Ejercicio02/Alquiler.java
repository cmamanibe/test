package Tp1Ejercicio02;
  
import java.util.*;
public class Alquiler {
    public Date f_Inicio=new Date();
    public Date f_Fin= new Date();
    public int numero_Posicion;
    public Cliente dCliente;
    public Avion dAvion;
   
    public Alquiler(){

    }
    public Alquiler(long tiempo,int posicion,Cliente elCliente,Avion elAvion){
        this.f_Fin.setTime(this.f_Inicio.getTime()+tiempo);
        this.numero_Posicion=posicion;
        this.dCliente=elCliente;
        this.dAvion=elAvion;

    }
}

    