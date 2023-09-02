package Hilo;
public class PingPong extends Thread{

        //private String cadena; // Lo que va a escribir.
        private int delay; // Tiempo entre escritura
        private Dato miDato;
        private int miCta=0;
    public PingPong(String cartel,int cantMs){
        super(cartel);
        ///cadena = cartel;
        delay = cantMs;
        };

    public PingPong(String cartel, int cantMs, Dato ddato){
            this(cartel, cantMs);
            this.miDato = ddato;
    }    
    public void run(){
        for (int i = 1; i< delay * 2; i++){
        //System.out.print(cadena + " run - "+ i +" - ");
        miCta++;
        this.miDato.contar();
        }
        System.out.println(miCta+" veces "+ this.getName());
    }; //fin método run()

public static void main(String[] args){
    Dato cuenta = new Dato();
 PingPong t1 =new PingPong("PING",(int) (Math.random() * 2300), cuenta);
 PingPong t2= new PingPong("PONG",(int) (Math.random() * 2000), cuenta);
 // Activación
 t1.start();
 t2.start();
 // Espera unos segundos
    try{
        Thread.sleep((long) Math.random() * 2000);
 }catch (InterruptedException e){

 };
 // Finaliza la ejecución de los threads
 System.out.println (Thread.currentThread() + " chau-chau.adios");
System.out.println (" dato " + cuenta.obtenerValor());
    }
} //fin clase PingPong 
/*Thread[main,5,main] chau-chau.adios
 dato 3014
263 veces PING
2751 veces PONG */
/* Thread[main,5,main] chau-chau.adios
4293 veces PING
 dato 8104
3811 veces PONG*/
/*Thread[main,5,main] chau-chau.adios
1925 veces PING
789 veces PONG
 dato 2714 */
 /*Thread[main,5,main] chau-chau.adios
3271 veces PONG
 dato 5242
1971 veces PING */