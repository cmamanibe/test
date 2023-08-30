package TP1Excepciones;
import java.io.*;
public class Ejercicio7d {
        
    public static void main(String[] args){
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }

    private static int metodo() {
        int valor=0;
        try{
            valor=valor +1;
            valor=valor + Integer.parseInt("W");
            valor=valor + 1;
            System.out.println("valor al final del try: "+valor);
            throw new IOException();
        } catch (IOException e) {
            // TODO: handle exception
            valor=valor + Integer.parseInt("42");
            System.out.println("valor al final del catch: "+valor);
        } finally{
            valor=valor + 1;
            System.out.println("valor al final de finally: "+ valor);
        }
        valor=valor +1;
        System.out.println("valor antes del return: "+ valor);
        return valor;
    }
}
/*valor al final de finally: 2
Excepcion en metodo()
java.lang.NumberFormatException: For input string: "W"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at TP1Excepciones.Ejercicio7d.metodo(Ejercicio7d.java:19)
        at TP1Excepciones.Ejercicio7d.main(Ejercicio7d.java:7) */