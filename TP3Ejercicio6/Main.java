package TP3Ejercicio6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Datos datos=new Datos(15);
        Random rnd=new Random();
        System.out.println("Carga el arreglo");
        for (int i = 0; i < 10; i++) {
            datos.completar(i,rnd.nextInt(10));
            System.out.print(datos.verValor(i)+",");
        }
      Sumador[] s=new Sumador[3];
      Thread[] t=new Thread[3];
      
      for (int j = 0; j < 2; j++) {
        s[j]=new Sumador(datos);
        t[j]=new Thread(s[j],"sumador_"+j);
        t[j].start();
        }
      
    }
}
