
public class Musica{
    //No importa el tipo de instrumento,
    // seguira funcionando debido a polimorfismo:
    static void afinar(Instrumento i){
        // ...
        i.tocar();
    }
    static void afinarTodo( Instrumento[] e){
        for (int i=0;i<e.length;i++)
        afinar(e[i]);
    }
    public static void main(String[] args){
        Instrumento[] orquesta=new Instrumento[5];
        int i=0;
        //Up-casting al asignarse el Arreglo
        orquesta[i++]=new Guitarra();
        orquesta[i++]=new Piano();
        orquesta[i++]=new Saxofon();
        orquesta[i++]=new Guzla();
        orquesta[i++]=new Ukelele();
        System.out.println("hola mundo");
    }
}//clase musica