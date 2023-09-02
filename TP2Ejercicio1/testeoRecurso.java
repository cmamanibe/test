package TP2Ejercicio1;

public class testeoRecurso{
    public static void main(String [] args){
        Cliente juan=new Cliente();
        juan.setName("Juan Lopez");
        Cliente ines=new Cliente();
        ines.setName("Ines Garcia");
        juan.start();
        ines.start();
        Recurso.uso();
    }
}
/* Soy Ines Garcia
 Soy Juan Lopez
en Recurso: SoyInes Garcia
en Recurso: SoyJuan Lopez */
/* Soy Ines Garcia
 Soy Juan Lopez
en Recurso: SoyJuan Lopez
en Recurso: SoyInes Garcia*/
/* Soy Juan Lopez
 Soy Ines Garcia
en Recurso: SoyInes Garcia
en Recurso: SoyJuan Lopez */