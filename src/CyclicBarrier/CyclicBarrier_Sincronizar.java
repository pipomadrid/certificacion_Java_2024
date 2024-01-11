package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

//sincroniza la ejecución de Thread
//Un conjunto de hilos se esperan en este punto y cuando llegan se desbloquean y continúan
//Es el equivalente a hacer muchas llamadas a Join
public class CyclicBarrier_Sincronizar {
    public static void main(String[] args) {
        int numeroHilos = 100;
        final CyclicBarrier barreraInicio = new CyclicBarrier(numeroHilos + 1);
        final CyclicBarrier barreraFin = new CyclicBarrier(numeroHilos + 1);

        for (int i = 0; i < numeroHilos; i++) {
            Thread hilo = new Thread(() -> {
                try {
                    //Al finalizar el For han llegado 100 hilos pero falta uno(el principal)
                    //Por lo que se esta tarea se queda bloqueada hasta que el hilo principal
                    //alcance la barrera
                    barreraInicio.await();
                    System.out.println("hilo ejecutandose");
                    barreraFin.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            hilo.start();
        }

        try {
            System.out.println("levanto barrera");
            barreraInicio.await();//se levanta barrera y se liberan los hilos
            barreraFin.await();//se levanta barrera y se liberan los hilos
            System.out.println("todo acabado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
