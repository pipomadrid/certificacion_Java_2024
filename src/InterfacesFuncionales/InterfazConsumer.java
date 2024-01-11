package InterfacesFuncionales;

import java.util.ArrayList;
import java.util.stream.Stream;

public class InterfazConsumer {

    //PROCESAMIENTO DE DATOS ->void accept(T t)
    //POR EJEMPLO CON EL MÉTODO FOREACH

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("hola");word.add("hola que tal");word.add("hola que tal estas");


        Stream<String> mystr = word.stream();
        mystr.forEach((n)-> System.out.println(n));
    }
}
