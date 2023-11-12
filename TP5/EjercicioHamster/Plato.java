package TP5.EjercicioHamster;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Plato {
        private ReentrantLock accesoComida;
        private Condition hayLugar;
        private int cantidad;
    private int comiendo;

    public Plato(int maximo){
        accesoComida=new ReentrantLock(true);
        hayLugar=accesoComida.newCondition();
        cantidad=maximo;
        comiendo=0;
    }
    public synchronized void comer(String nombre){
        try {
            while(comiendo>=cantidad){
                System.out.println(nombre+"debe esperar para comer");
                this.wait();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
System.out.println(nombre+" empezo a comer");
comiendo++;
try {
    Thread.sleep(ThreadLocalRandom.current().nextInt(1, 5)*1500);
} catch (Exception e) {
    // TODO: handle exception
}
System.out.println(nombre+" termino de comer");
comiendo--;
this.notify();
    }
    public synchronized void empezarAComer(String nombre){
        try {
            accesoComida.lock();
            while(comiendo>=cantidad){
                System.out.println(nombre+" debe esperar para comer");
                hayLugar.await();
            }
            System.out.println(nombre+" empieza a comer");
            comiendo++;
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            accesoComida.unlock();
        }
    }
    public synchronized void terminarDeComer(String nombre){
        accesoComida.lock();
        System.out.println(nombre+ " ---Termino de comer");
        comiendo--;
        hayLugar.signalAll();
        accesoComida.unlock();
    }
    
}
