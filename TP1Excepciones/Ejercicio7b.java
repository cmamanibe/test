package TP1Excepciones;

public class Ejercicio7b {

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
            valor=valor + Integer.parseInt("42");
            System.out.println("valor al final del catch: "+valor);
        } finally{
            valor=valor + 1;
            System.out.println("valor al final de finally: "+ valor);
        }
        return valor;
    }
}
/*valor al final del catch: 43
valor al final de finally: 44
44 */