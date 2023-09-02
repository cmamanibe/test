package TP1Excepciones;

import java.lang.reflect.Array;
import java.util.Random;

public class PruebaExcep {

    private static boolean menor_edad(int year) throws RuntimeException{
        try {
            if (year>18) {
                return year<18;
            }else{
            throw new RuntimeException(" Es menor de Edad");
            }
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw  e;
        }
    }

    private static boolean ruleta(int valor, int valor_ruleta) throws RuntimeException{
        try {
            if (valor==valor_ruleta) {
                return true;
            }else{
            throw new RuntimeException(" NO SALIO EN LA RULETA FAVORECIDO. VALOR RULETA: " + valor_ruleta);
            }
        } catch (RuntimeException e) {
            // TODO: handle exception
            throw  e;
        }
    }

    private static int acceso_por_indice(int[] v, int j) throws ArrayIndexOutOfBoundsException {
        try {
            if((0<=j)&&(j<v.length)){//verifica que el indice este dentro del rango
                return v[j];
            }else{
                throw new ArrayIndexOutOfBoundsException("El indice " + j + " no existe en el vector");
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // TODO: handle exception
            throw exc;
            /*Exception in thread "main" java.lang.RuntimeException: El indice 16 no existe en el vector
            at TP1Excepciones.Ejercicio6.acceso_por_indice(Ejercicio6.java:15)
            at TP1Excepciones.Ejercicio6.main(Ejercicio6.java:7)*/
            
            /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: El indice 16 no existe en el vector
            at TP1Excepciones.Ejercicio6.acceso_por_indice(Ejercicio6.java:15)      
            at TP1Excepciones.Ejercicio6.main(Ejercicio6.java:7) */
    
        }
        }
    public static void main(String[] args){
        Random vRuleta= new Random();
        int v[]=new int[5];
        //System.out.println(menor_edad(15));
        //System.out.println(ruleta(15,vRuleta.nextInt(100)));
        for (int i=0; i<v.length;i++){
            v[i]=vRuleta.nextInt(100);
        }
        for(int indice=0;indice<7;indice++){
            System.out.println(acceso_por_indice(v, indice));
        }
    }
    
}
