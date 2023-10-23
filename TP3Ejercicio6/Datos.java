package TP3Ejercicio6;

import java.util.Arrays;

public class Datos {
    private int[] numero;
    public Datos(int largo){
        this.numero=new int[largo];
    }
    public synchronized void completar(int lugar, int valor){
        this.numero[lugar]=valor;
    }
    public int verValor(int pos){
        return this.numero[pos];
    }
    public int largoDato(){
        return this.numero.length;
    }
    public Datos subDatos(int inicio,int largo){
        int[] subSET=Arrays.copyOfRange(this.numero, inicio, inicio+largo);
        Datos x=new Datos(largo);
        for (int i = 0; i < subSET.length; i++) {
            x.completar(i, subSET[i]);
            System.out.print(subSET[i]+",");
        }
        System.out.println("-");
        return x;
    }
    public synchronized int sumar2Posiciones(int pos_1, int pos_2){
        return this.numero[pos_1]+ this.numero[pos_2];
    }
}
