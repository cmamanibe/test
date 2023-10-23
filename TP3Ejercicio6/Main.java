package TP3Ejercicio6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Datos datos=new Datos(500);
        Random rnd=new Random();
        System.out.println("Carga el arreglo");
        for (int i = 0; i < 500; i++) {
            datos.completar(i,rnd.nextInt(10));
            System.out.print(datos.verValor(i)+",");
        }
        System.out.println("-----");
      Sumador[] s=new Sumador[100];
      Thread[] t=new Thread[100];
      int divisor=datos.largoDato()/100;
      for (int j = 0; j < 100; j++) {
        s[j]=new Sumador(datos.subDatos(j*divisor, divisor));
        t[j]=new Thread(s[j],"sumador_"+j);
        t[j].start();
        }
        try {
            int total=0;
            for (int i = 0; i < t.length; i++) {
                t[i].join();
                total+=s[i].result();
            }
            System.out.println("El resultado de los hilos son:"+total);
        } catch (Exception e) {
            // TODO: handle exception
        }
      
    }
}
