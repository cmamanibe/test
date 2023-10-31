package TP4.Ejercicio1.ejercicio4;

public class GestorImpresoras {
    int n=3;
    Impresora[] maquinas=new Impresora[n];
       
    public GestorImpresoras(){
        for (int i = 0; i < maquinas.length; i++) {
            maquinas[i]=new Impresora();
        }
    }

    public void asignarImpresora(Clientes c){
        
    }
}
