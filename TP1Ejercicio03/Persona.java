package TP1Ejercicio03;

import java.util.*;
public class Persona {
    public String nombreApellido;
    public long dni;
    public String direccion;
    public Date f_Nacimiento;
    public char sexo;
    
    public Persona(){

    }
    public Persona(String name, long documento, String dire, Date f_Nac, char sex){
        this.nombreApellido=name;
        this.dni=documento;
        this.direccion=dire;
        this.f_Nacimiento=f_Nac;
        if ((sex=='f')||(sex=='m')){
        this.sexo=sex;
        }
    }
}
