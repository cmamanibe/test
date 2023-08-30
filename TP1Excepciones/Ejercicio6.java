package TP1Excepciones;

public class Ejercicio6 {
    
    public static void main(String[] args){
        double [] v=new double[15];
        acceso_por_indice(v,16);
    }

    public static double acceso_por_indice(double[] v, int j) throws ArrayIndexOutOfBoundsException {
    try {
        if((0<=j)&&(j<=v.length)){//verifica que el indice este dentro del rango
            return v[j];
        }else{
            throw new ArrayIndexOutOfBoundsException("El indice " + j + " no existe en el vector");
        }
    } catch (RuntimeException exc) {
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
}
