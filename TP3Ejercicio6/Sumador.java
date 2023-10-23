package TP3Ejercicio6;

public class Sumador implements Runnable{
    private Datos d;
    private int resultado;
    public Sumador(Datos datos){
        resultado=0;        
        d=datos;
    }
       
    public int resolver(int p1,int p2){
        return d.sumar2Posiciones(p1,p2);
    }
    public int result(){
        return resultado;
    }
    @Override
    public void run() {
        
       for (int i = 0; i < d.largoDato(); i+=2) {
        if (((d.largoDato()%2)==1)&&(d.largoDato()-1==i)){
            resultado=resultado+d.verValor(d.largoDato()-1);
        }else{
        resultado=resultado+ this.resolver(i, i+1);   
        }
        }
        System.out.println(Thread.currentThread().getName()+" resultado parcial es:"+resultado);
    } 
    
}
