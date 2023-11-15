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

    public static void main(String[] args) {
        Generador g=new Generador();
        int k=10;
        for (int i = 0; i < k; i++) {
            
        }
    }
}
