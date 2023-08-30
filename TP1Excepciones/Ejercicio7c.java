package TP1Excepciones;

public class Ejercicio7c {
    
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
            
        } catch (NumberFormatException e) {
            // TODO: handle exception
            valor=valor + Integer.parseInt("O");
            System.out.println("valor al final del catch: "+valor);
        } finally{
            valor=valor + 1;
            System.out.println("valor al final de finally: "+ valor);
        }
        return valor;
    }
}
/*valor al final de finally: 2
Excepcion en metodo()
java.lang.NumberFormatException: For input string: "O"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at TP1Excepciones.Ejercicio7c.metodo(Ejercicio7c.java:25)
        at TP1Excepciones.Ejercicio7c.main(Ejercicio7c.java:7) */