package Multitarea;


//Permite la ejecución de procesos simultáneos
//dos posibilidades : Extender de clase Thread o impelmentar interfaz Runnable

//EXTENDER DE THREAD
public class ClaseThread extends Thread{

    String numeroHilo;
    public ClaseThread(String numeroHilo){
        this.numeroHilo= numeroHilo;
    }
    @Override
    public void run(){
        System.out.println("Ejecutando hilo de claseThread n:" + numeroHilo);
    }

    public static void main(String[] args) {
        //ClaseThread
        ClaseThread cth = new ClaseThread("1");
        ClaseThread cth2 = new ClaseThread("2");
        ClaseThread cth3 = new ClaseThread("3");
        //Los hilos se ejecutan concurrentemente
        cth.start();
        cth2.start();
        cth3.start();
        //Tarea
        //En este caso hay que crear instancias de Thread y pasarle el runnable
        Tarea tr = new Tarea("1");
        Tarea tr2 = new Tarea("2");
        Thread t1 = new Thread(tr);
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();


    }

}

//CLASE IMPLEMENTA RUNNABLE
class Tarea implements Runnable{
    String numeroHilo;
    public Tarea(String numeroHilo){
        this.numeroHilo= numeroHilo;
    }
    @Override
    public void run() {
        System.out.println("Ejecutando hilo de Tarea n:" + numeroHilo);
    }
}

