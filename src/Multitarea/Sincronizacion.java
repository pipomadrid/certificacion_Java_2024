package Multitarea;

public class Sincronizacion {
    public static void main(String[] args) {
        Contador cont = new Contador();
        Thread th = new Thread(()-> {  //mediante un lambda implementamos metodo run de Runnable
           for (int i = 0; i < 10000; i++) {
               cont.sumar();
           }
       });
        Thread th2 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                cont.sumar();
            }
        });
        th.start();
        th2.start();
        try {
            th.join();//El hilo principal espera a que termine este  hilo
            th2.join();//El hilo principal espera a que termine este  hilo
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Si hemos sincronizado el método sumar deberá dar 20000, si no dará un número aleatorio
        System.out.println( "El contador es " + cont.getContador());
    }

}
class Contador  {

    private int contador = 0;

    public synchronized void sumar(){//Si no lo sincronizamos, los hilos se pueden meter a la vez y uno de ellos
        // puede no hacer la suma
       contador++;
    }
    public int getContador(){
        return contador;
    }
}