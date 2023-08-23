package TP1Ejercicio03;

import java.util.Date;

public class Empleado extends Persona {
    public long salario;
    public String funcion;
    public String legajo;
    public int antiguedad;

    public Empleado(long tax, String function, String leg, int antig){
        super("",2, "",new Date(), 'f');

    }
}
