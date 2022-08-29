import java.util.*;
class cliente{
    public String nombre;
    public int dni;
}
class barco{
    public String Matricula;
    public int eslora;
    public int Año_Fabricacion;
}

class velero extends barco{
    public int nro_mastil;
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
    public void calcularAlquiler(int largo){
        valor_Alquiler=(f_final.getDay()-f_inicial.getDay())*10*largo;
    }
}
public class Puerto {
    
}
