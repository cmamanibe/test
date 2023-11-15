package Parcial2023;

public class Generador {
    public Atomo[] atom=new Atomo[100];
    public MonitorAgua ma;

    public Generador(){
        Thread[] listAtomo=new Thread[100];
        ma=new MonitorAgua();
        for (int i = 0; i < listAtomo.length; i++) {
            atom[i]=new Atomo(ma);
            listAtomo[i]=new Thread(atom[i],"Atomo_"+atom[i].tipoAtomo()+"_"+i);
            listAtomo[i].start();
        }
    }
    public int cantidadAgua(){
        return ma.cantidadAgua();
    }
    public void vaciar(){
        ma.vaciar();
    }

    public static void main(String[] args) {
        Generador g=new Generador();
        int cantidadRecipiente=1;
        int maxRecipiente=10;
        int k=10;
        int i=0;
        while (cantidadRecipiente<maxRecipiente){
            while (i < k) {
            i=g.cantidadAgua();
            }
            g.vaciar();
            cantidadRecipiente++;
            System.out.println("se lleno "+cantidadRecipiente+" recipientes");
        }
    }
}
