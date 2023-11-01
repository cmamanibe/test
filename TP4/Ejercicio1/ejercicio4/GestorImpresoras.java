package TP4.Ejercicio1.ejercicio4;

public class GestorImpresoras {
    Impresora[] maquinas;
    int totalEquipos=3;
    int impresoraDisponible=0;
    public GestorImpresoras(){

        maquinas=new Impresora[totalEquipos];
        for (int i = 0; i < maquinas.length; i++) {
            maquinas[i]=new Impresora(i);
        }
    }

    public void asignarImpresora(){
        int i=impresoraDisponible;
        impresoraDisponible++;
        if (impresoraDisponible==totalEquipos) {
            impresoraDisponible=0;
        }
        maquinas[i].setOcupada();
        maquinas[i].setDisponible();
    }
}
