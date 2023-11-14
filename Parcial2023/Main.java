package Parcial2023;

public class Main {
    public static void main(String[] args) {
        FabricaRC frc=new FabricaRC();
        Embotellador[] listaEmbotelladores=new Embotellador[10];
        Empaquetador emp=new Empaquetador(frc);
        Transportador trans=new Transportador(frc);

        Thread[] hiloEmbotelladores=new Thread[10];
        Thread empaquetador=new Thread(emp, "Empaquetador");
        Thread transportador=new Thread(trans, "Transportador");

        for (int i = 0; i < hiloEmbotelladores.length; i++) {
            listaEmbotelladores[i]=new Embotellador(frc);
            hiloEmbotelladores[i]=new Thread(listaEmbotelladores[i], "Embotellador_"+i);
            hiloEmbotelladores[i].start();
        }
        empaquetador.start();
        transportador.start();
    }
}
