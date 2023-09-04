package TP2Ejercicio2;

class TesteoHilos{
        public static void main(String[] aStrings){
            Thread miHilo= new Miejecucion();
            miHilo.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("En el main");
    }
}
