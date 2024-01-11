package Atomic;
//Se usan el entorno multitarea
//Son thread Safe
//Usan internamente variables volatile(Acceso directo a memoria) para garantizar la integridad de los datos
//Son muy adecuadas para usarse como contador global

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ClasesAtomic {

    //AtomicBoolean, AtomicInteger y AtomicLong
    //AtomicBoolean se usa como Flag


    public static void main(String[] args) {


        ExecutorService ex = Executors.newFixedThreadPool(3);
        AtomicInteger ai = new AtomicInteger();
        for (int i = 1; i <= 3; i++) {
            ex.submit(()-> System.out.println(ai.incrementAndGet()+" "));
        }
        ex.shutdown();
    }
}
