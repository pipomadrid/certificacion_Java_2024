package MultitareaNueva;
import java.util.concurrent.*;

//la interfaz EXECUTORS SERVICE proporciona metodos para lanzar y ejecutar tareas concurrentes
// a través de un pool de hilos
public class InterfazExecutorsService {

    public static void main(String[] args) {
        //Para crear un Executor Service lo podemos hacer a través de estos métodos
         ExecutorService ex = Executors.newCachedThreadPool();// Crea numero variable de Threads
         //Lanza la tarea y la pone en ejecución concurrente, devuelve un objeto Future
         ex.submit(()-> System.out.println("Primera tarea cached"));
         //para lanzar se puede usar también execute, no devuelve nada
         ex.execute(()-> System.out.println("Segunda tarea cached"));
         ex.shutdown(); //No admite mas tareas

        //Se crea un pool fijo de tres hilos que ejecutaran las tareas,
        // al ser cuatro tareas y tener 3 hilos el primer hilo que acabe su tarea ejecutará tb la última tarea
        ExecutorService ex2 = Executors.newFixedThreadPool(3);
        ex2.submit(()-> System.out.println("Primera tarea fixed"));
        ex2.submit(()-> System.out.println("Segunda tarea fixed"));
        ex2.submit(()-> System.out.println("tercera tarea fixed"));
        ex2.submit(()-> System.out.println("cuarta tarea fixed"));
        ex2.shutdown();

        //Usa un hilo único
        ExecutorService ex3 = Executors.newSingleThreadExecutor();
        ex3.execute(()-> System.out.println("Primera tarea single thread"));
        ex3.execute(()-> System.out.println("Segunda tarea single thread"));
        ex3.shutdown();

        //Permite ejecutar las tareas de forma periódica
        ScheduledExecutorService ex4 = Executors.newScheduledThreadPool(1);
        Runnable tarea = ()-> System.out.println("Primera tarea scheduled");
        //Se ejecuta a los 5 segundos
        ex4.schedule(tarea,5, TimeUnit.SECONDS);
        //Se ejecuta a los 10 segundos
        ex4.schedule(()-> System.out.println("Segunda tarea scheduled"),10,TimeUnit.SECONDS);
        ex4.shutdown();

        //En los anteriores ejemplos hemos usado un Runnable pero podemos también usar un Callable
        ExecutorService ex5 = Executors.newCachedThreadPool();
        Callable <Integer> callb = ()->{
            int suma =0;
            for(int i=0;i<10000000;i++){
                suma+=1;
            }
            Thread.sleep(2000);
            return suma;
        };
        //Capturamos el resultado en un objeto Future
        Future<Integer> ft= ex5.submit(callb);
        //Mientras no haya terminado la ejecución del hilo se mostrará el mensaje
        while(!ft.isDone()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("esperando a que termine la tarea");
        }

        //Una vez hemos obtenido el Future imprimimos el mensaje con su valor
        try {
            System.out.println("El resultado de la suma es " + ft.get());
        } catch (InterruptedException|ExecutionException e) {
            throw new RuntimeException(e);
        }

        ex5.shutdown();
    }

}
