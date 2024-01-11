package Interfaces;

public class Interfaces2 {

    public static void main(String[] args) {
        Interfaz5 obj = new ClaseImplements3(); // no puede acceder al método estático
        obj.girar();
        Interfaz5.estático();
    }
}

interface Interfaz4{

    default void girar(){ // Con default podemos añadir una implementación por defecto al método
        System.out.println("Giro normal");
    }
    default void mensaje(){
        System.out.println("Mensaje");
    }
}
interface Interfaz5{

    default void girar(){ // Con default podemos añadir una implementación por defecto al método
        System.out.println("Giro normal dos");
        privado();
    }

    static void estático(){
        System.out.println("Metodo Estático");
    }

    private void privado(){ //Sólo lo puede usar la interfaz, tambíen podría ser estático
        System.out.println("Método Privado");
    }
}

class ClaseImplements3 implements Interfaz4,Interfaz5{


    @Override
    public void girar() { // Tiene que implementar el método ya que las dos interfaces que
        // implementa tienen el mismo método default y no puede saber cual debe usar
        Interfaz5.super.girar();
    }
}