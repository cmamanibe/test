import java.util.*;
 class Instrumento {
    public void tocar() {
        System.out.println("Instrumento.tocar()");
    }
    public String tipo(){
        return "iInstrumento";
    }

    public void afinar(){

    }
}

class Guitarra extends Instrumento{
    public void tocar(){
        System.out.println("Guitarra.tocar()");
    }
    public String tipo(){ return "Guitarra";}
    public void afinar(){}
}
class Piano extends Instrumento{
    public void tocar(){
        System.out.println("Piano.tocar()");}
        
        public String tipo(){return "Pano";}
        public void afinar(){}
    }
    class Saxofon extends Instrumento{
        public void tocar(){
            System.out.println("Saxofon.tocar()");
        }
        public String tipo(){return "Saxofon";}
        public void afinar(){}
    }
    // UN TIPO DEE GUITARRA
    class Guzla extends Guitarra{
        public void tocar(){
    System.out.println("Guzla.tocar()");
    }
    public void afinar(){
    System.out.println("Guzla.afinar()");
    }
    }
   // UN TIPO DEE GUITARRA
        class Ukelele extends Guitarra{
            public void tocar(){
                System.out.println("Ukelele.tocar()");
            }
            public String tipo(){
                return "Ukelele";
            }
                }