package InterfacesFuncionales;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class InterfazSupplier {

    //EXTRACCIÓN DE DATOS->T get()
    //POR EJEMPLO CON MÉTODO ESTÁTICO DE STREAM GENERATE

    public static void main(String[] args) {

        //Creamos un Stream de 5 numeros aleatorios y lo imprimimos por pantalla
        Stream.generate(() -> new Random().nextInt())
                .limit(5).forEach(System.out::println);

    }
}
