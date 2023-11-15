package Parcial2023;

public class MonitorAgua {
    private int atomoO;
    private int atomoH;
    private int cantAgua;
    
    public MonitorAgua(){
        atomoH=0;
        atomoO=0;
        cantAgua=0;
    }

    public synchronized boolean hacerAgua(){
        try {
            while((atomoO<1)&&(atomoH<2)){
                this.wait();
            }
            if ((atomoO>0)&&(atomoH>2)){
                atomoH=atomoH-2;
                atomoO--;
                cantAgua++;
                this.notify();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("una molecula de agua");
        return true;
    }
    public synchronized int cantidadAgua(){
        return cantAgua;
    }
    public synchronized void vaciar(){
        cantAgua=0;
    }
    public synchronized void oListo(){
        atomoO++;
    }
    public synchronized void hListo(){
        atomoH++;
    }
}
