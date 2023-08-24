package Tp1Ejercicio02;
public class Cliente{
    public String nombre;
    public int dni;
    public String getName(){return nombre;}
    public int getDNI(){ return dni;}
    public void setName(String Nombre_Cliente){this.nombre= Nombre_Cliente;}
    public void setDNI(int Numero_DNI){this.dni= Numero_DNI;}
   
    public Cliente(){    
        
    }

   public Cliente(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
}
