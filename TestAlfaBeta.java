public class TestAlfaBeta{
    public static void main(String[] args){
        HiloAlfaBeta alfa= new HiloAlfaBeta("Hilo Alfa", 3);
        HiloAlfaBeta beta= new HiloAlfaBeta("Hilo Beta", 4);

        alfa.start();
        beta.start();

        System.out.println("probando hilos");
    }
}