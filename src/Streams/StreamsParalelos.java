package Streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsParalelos {


    public static void main(String[] args) {


        //Usan multitarea, mas eficiente
        // Si las operacioens necesitan de un orden no devolverán el resultado esperado

        //CREACIÓN
        //a partir de una coleccción
        List<Integer> nums = List.of(2, 3, 4, 5, 6);
        Stream<Integer> pst = nums.parallelStream();

        //a partir de otro Stream
        Stream<Integer> str2 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> pst2 = str2.parallel();

        //USO
        // el usa es el mismo que con los secuenciales
        System.out.println("Total de numeros pares = " + pst.filter(n->n%2==0).count());

        //Esto no saldría ordenado
        pst2.sorted().forEach(System.out::println);

        //Podemos crear un Stream paralelo para realzar operaciones exigentes y volver al secuencial
        List<Integer> nums3 = List.of(20, 100, 80,25,39,1,7);
        Stream<Integer> pst3 = nums3.parallelStream();

        System.out.println("Numeros pares distintos ordenados:");
        pst3.
                distinct()
                .filter(n->n%2==0)
                .sorted()
                .sequential()
                .forEach(System.out::println);

        System.out.println("Prueba ejercicio: ");
        List<Integer> nums4 = List.of(20, 100, 80,25,39,1,7);
        Stream<Integer> pst4 = nums4.stream();
        pst4.parallel().peek(System.out::println).anyMatch(n->n>10);



    }




}
