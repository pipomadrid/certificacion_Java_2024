package InterfacesFuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class InterfazFunction {

    //LA INTERFAZ FUNCTION TIENE EL MÉTODO APPLY QUE REALIZA UN OPERACIÓN Y DEVUELVE UN RESULTADO
    //R apply(T t)
    //SE USA PARA TRANSFORMAR DATOS.POR EJEMPLO CON EL METODO MAP DE STREAMS

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("hola");word.add("hola que tal");word.add("hola que tal estas");

        Stream <String> miStr =word.stream(); //Creamos un Stream a partir de una lista
        Stream  mistr2;
        mistr2 = miStr.map(a->a.length());// El método map crea otro Stream con las longitudes de los Strings del
        // anterior
        mistr2.forEach(n -> System.out.println(n));

        List<Integer> nums = List.of(10,4,21,3,17,8,20,11);
        System.out.println("Ejercicio");
        nums.stream().filter(n->n%2==0).sorted((a,b)->b-a).forEach(System.out::println);
    }
}
