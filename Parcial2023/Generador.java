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
        int maxRecipiente=5;
        int k=5;
        int i=0;
        while (cantidadRecipiente<maxRecipiente){
            while (i < k) {
            g.ma.hacerAgua();
            i++;
            }
            g.vaciar();
            cantidadRecipiente++;
            System.out.println("Se lleno "+cantidadRecipiente+" recipientes");
        }
    }
}
