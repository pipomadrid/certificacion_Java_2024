package MultitareaNueva;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

//En estas nuevas clases se usa lock y unlock para sincronizar hilos
public class SynchronizationLock {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        PruebaSincro ps = new PruebaSincro();

        try {
            ex.execute(ps::sumaCont);
            ex.execute(ps::sumaCont);
            ex.execute(ps::sumaCont);
            ex.execute(ps::sumaCont);
            ex.execute(ps::sumaCont);
            ex.execute(ps::sumaCont);
        }finally {
            ex.shutdown();
        }

        //Hay que hacer un delay del Hilo principal para que muestre el resultado final de cont
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ps.getCont());

    }
}

class PruebaSincro{

    private  int cont=0;
    //Usamos ReentrantLock para implementar la interfaz lock,
    // debe ser compartida por todos los hilos y para que no se pueda modificar la hacemos privada y final
    private final ReentrantLock lc = new ReentrantLock();
    public  int getCont() {
        return cont;
    }

    public  void setCont(int cont) {
        this.cont = cont;
    }
    public void sumaCont(){
        System.out.println("Sumando");
        try {
            lc.lock();
            int tmp =getCont();
            tmp++;
            setCont(tmp);
        }finally {
            //Al final siempre desbloqueamos para que lo pueda usar el hilo siguiente
            lc.unlock();
        }


    }
}
