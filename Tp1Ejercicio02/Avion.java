package Tp1Ejercicio02;

import java.util.Date;
public class Avion {
    public String Matricula;
    public int Largo;
    public Date Year_Fabricacion=new Date();

    public void setMatricula(String numero_Matricula){ this.Matricula=numero_Matricula;}
    public void setLargo(int longitud){this.Largo=longitud;}
    public void setYear_Fabricacion(Date anio){ this.Year_Fabricacion= anio;}

    public String getMatricula(){ return Matricula;}
    public int getLargo(){return Largo;}
    public Date getYear_Fabricacion(){ return  Year_Fabricacion;}

    public Avion(){

    }
    public Avion(String Patente, int metros, Date anioFabricacion){
        this.Matricula=Patente;
        this.Largo=metros;
        this.Year_Fabricacion=anioFabricacion;
    }
}
