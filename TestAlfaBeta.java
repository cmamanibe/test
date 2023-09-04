public class TestAlfaBeta{
    public static void main(String[] args){
       // System.out.print("\033[H\033[2J");  
       // System.out.flush();  

        HiloAlfaBeta alfa= new HiloAlfaBeta("Hilo Alfa", 3);
        HiloAlfaBeta beta= new HiloAlfaBeta("Hilo Beta", 4);

        alfa.start();
        beta.start();

        System.out.println("probando hilos");
    }
}