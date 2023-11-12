package TP5.EjercicioHamster;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

public class Rueda {
    private ReentrantLock llave=new ReentrantLock(true);
public void rodar(String nombre){
    try {
        llave.lock();
        System.out.println(nombre+" empieza a rodar");
        Thread.sleep((long) ThreadLocalRandom.current().nextInt(1,5)*1500);
    } catch (Exception e) {
        // TODO: handle exception
    }finally{
        llave.unlock();
    }
}    
}
