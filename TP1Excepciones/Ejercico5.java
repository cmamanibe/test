package TP1Excepciones;

public class Ejercico5 {
    public static void main(String[] args){
String aux="Hola";
int aux2=Integer.parseInt(aux);
/*Exception in thread "main" java.lang.NumberFormatException: For input string: "Hola"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at TP1Excepciones.Ejercico5.main(Ejercico5.java:6) */
System.out.println(aux2);
    }
}
