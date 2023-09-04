package TP1Ejercicio03;

import java.util.Date;

public class Empleado extends Persona {
    public long salario;
    public String funcion;
    public String legajo;
    public int antiguedad;
    public Empleado(){}
    public Empleado(long tax, String function, String leg, int antig,String nombre, long doc,String dir,Date f,char s){
        super(nombre, doc, dir, f, s);
        this.salario=tax;
        this.funcion=function;
        this.legajo=leg;
        this.antiguedad=antig;
    }
}
