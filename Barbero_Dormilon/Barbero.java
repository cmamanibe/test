package Barbero_Dormilon;

public class Barbero extends Thread {

    private Sillon s=new Sillon();
    
    public Barbero(){
        
    }
    
    public void run(){
        while(true){
            this.s.esperarCliente();
            this.atenderCliente();
    }
}
    
    public void atenderCliente(){
        System.out.println("El barbero esta atendiendo al cliente_");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        this.s.liberarSillon();
    }


    public static void main(String[] args){
        
        Barbero b=new Barbero();
        Cliente[] c=new Cliente[5];
        
        for(int i=0;i<5;i++){
                c[i]=new Cliente();
                c[i].start();
            }
        while(true){
            b.start();
        }


    }
}
