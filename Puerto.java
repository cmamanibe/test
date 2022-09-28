import java.util.*;
class cliente{
    public String nombre;
    public int dni;
}
class barco{
    public String Matricula;
    public int eslora;
    public int Año_Fabricacion;
    public int dni_propietario;
    public barco(String patente, int largo, int fabricacion, int propietario){
        Matricula=patente;
        eslora=largo;
        Año_Fabricacion=fabricacion;
        dni_propietario=propietario;
    }
}

class velero extends barco{
    public int nro_mastil;
    public barco(String patente, int largo, int fabricacion, int propietario, int cantidad_mastil){
        Matricula=patente;
        eslora=largo;
        Año_Fabricacion=fabricacion;
        dni_propietario=propietario;
        nro_mastil=cantidad_mastil;
    }
    public int getMastil(){
        return nro_mastil;
    }
}

class deportivos extends barco{
    public int Pot_CV;
}

class yate extends barco{
    public int Pot_CV;
    public int nro_camarote;
}

class alquiler{
    public Date f_inicial=new Date();
    public Date f_final=new Date();
    public int nro_amarre;
    public  long valor_Alquiler;
    public alquiler(Date fecha_inicial, Date fecha_final, int amarre){
        f_inicial=fecha_inicial;
        f_final=fecha_final;
        nro_amarre=amarre;
    }
    public void calcularAlquiler(int largo){
        valor_Alquiler=(f_final.getTime()-f_inicial.getTime())*10*largo;
    }

}
public class Puerto {
    
}
