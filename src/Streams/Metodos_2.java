package Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Metodos_2 {

    public static void main(String[] args) {

        //FILTRADO filter()
        Stream<Integer> str = Stream.of(2,3,4,5,6,7,7,7);
        Stream<Integer> str2 = Stream.of(2,3,4,5,6,7,7,7);
        str.filter(n->n%2==0).forEach(System.out::println);// Intermedio Devuelve Stream con pares
        System.out.println(str2.distinct().filter(n->n>4).count());//Imprime la cantidad de
        // numeros únicos mayores de 4

        //BUSQUEDA findfirst() o findAny()
        Stream<Integer> str3 = Stream.of(2,3,4,5,6,7,7,7);
        Stream<Integer> str4 = Stream.of(3,5,7,7,7);
        //Clase Optional<T> encapsula los resultados de una operacion de un Stream. Podemos usar los métodos
        // T get() Devulve el valor encapsulado, si no hay lanza excepción
        // TorElse(T other) -> Devuelve valor encapsulado y si no existe el valor pasado por parámetro
        // boolean isPresent() ->Comprobamos si tiene valor o no
        // ifPresent(Consumer) -> Si tiene valor lanza la expresión Lambda

        //Optional con valor
        Optional<Integer> op = str3.filter(n -> n%2==0).findFirst(); //Final
        if(op.isPresent()) System.out.println("El primer par es " + op.get());
        op.ifPresent(System.out::println);

        //Optional sin valor
        Optional<Integer> op2 = str4.filter(n -> n%2==0).findFirst(); //Final
        if(op2.isPresent()) System.out.println("El primer par es " + op2.get());//no se cumple, no imprime nada
        op2.ifPresent(System.out::println);//no se cumple, no imprime nada
        System.out.println(op2.orElse(5));//Al estar op2 vacío imprime lo que le pasamos

        //OBTENER EXTREMOS max()
        Stream<Integer> str5 = Stream.of(2,3,4,5,6,7,7,7);
        Optional<Integer> op3 = str5.max((a,b)->a-b); //Final
        System.out.println("Mayor " + op3.get());
    }
}
