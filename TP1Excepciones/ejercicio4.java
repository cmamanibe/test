package TP1Excepciones;

public class ejercicio4 {

    public static void main(String[] args){
        String  [] array_string=new String[25];
        System.out.println(array_string[3].length());
        /*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "array_string[3]" is null
        at TP1Excepciones.ejercicio4.main(ejercicio4.java:7) */
    }
}
