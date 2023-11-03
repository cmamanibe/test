package TP4.Ejercicio1.Ejercicio5;

public class GestorImpresoras {
    Impresora[] maquinasA;
    Impresora[] maquinasB;
    int totalEquiposA=3;
    int totalEquiposB=3;
    int impresoraDisponibleA=0;
    int impresoraDisponibleB=0;
    public GestorImpresoras(){
        maquinasA=new Impresora[totalEquiposA];
        maquinasB=new Impresora[totalEquiposB];
        for (int i = 0; i < maquinasA.length; i++) {
            maquinasA[i]=new Impresora(i,'A');
        }
        for (int i = 0; i < maquinasB.length; i++) {
            maquinasB[i]=new Impresora(i,'B');
        }
    }

    public void asignarImpresora(char tipoImpresora){
        int i;
        switch (tipoImpresora) {
            case 'A':
                i=impresoraDisponibleA;
                impresoraDisponibleA++;
                if (impresoraDisponibleA==totalEquiposA) {
                    impresoraDisponibleA=0;
                }        
                maquinasA[i].setOcupada();
                maquinasA[i].setDisponible();
                break;
            case 'B':
                i=impresoraDisponibleB;
                impresoraDisponibleB++;
                if (impresoraDisponibleB==totalEquiposB) {
                    impresoraDisponibleB=0;
                }        
                maquinasB[i].setOcupada();
                maquinasB[i].setDisponible();
                break;
            default:
                if (impresoraDisponibleA<totalEquiposA){
                i=impresoraDisponibleA;
                impresoraDisponibleA++;
                if (impresoraDisponibleA==totalEquiposA) {
                    impresoraDisponibleA=0;
                }        
                maquinasA[i].setOcupada();
                maquinasA[i].setDisponible();
                }else{
                i=impresoraDisponibleB;
                impresoraDisponibleB++;
                if (impresoraDisponibleB==totalEquiposB) {
                    impresoraDisponibleB=0;
                }        
                maquinasB[i].setOcupada();
                maquinasB[i].setDisponible();
                }
                break;
        }
    }
}
