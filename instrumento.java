import java.util.*
public class Instrumento {
    public void tocar() {
        System.out.println("Instrumento.tocar()"");
    }
    public String tipo(){
        return "iInstrumento";
    }

    public void afinar(){

    }
}

class Guitarra extends Instrumento{
    public void tocar(){
        system.out.println("Guitarra.tocar()")
    }
    public String tipo(){ return "Guitarra";}
    public void afinar(){}
}
class Piano extends Instrumento{
    public void tocar(){
        system.out.println("Piano.tocar()");}
        
        public string tipo(){return "Pano";}
        public void afinar(){}
    }
    class Saxofon extends Instrumento{
        public void tocar(){
            System.out.println("Saxofon.tocar()");
        }
        public String tipo(){return "Saxofon";}
        public void afinar(){}
    }
