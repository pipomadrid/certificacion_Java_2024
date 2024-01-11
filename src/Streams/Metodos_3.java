package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Metodos_3 {
    public static void main(String[] args) {
         //TRANSFORMACION map()
        Stream<String> st = Stream.of("Juan", "Maria", "Ana");
        Stream <String> st2 = st.map(n->n.toUpperCase()); //Intermedio, devuelve otro Stream modificado
        st2.forEach(System.out::println);

        Stream<String> st3 = Stream.of("Juan", "Maria", "Ana");
        IntStream st4 = st3.mapToInt(n->n.length());// Intermedio Imprime la longitud de cada String
        st4.forEach(System.out::println);

        //TRANSFORMACIÓN Y APLANAMIENTO flatmap()
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);

        List<List<Integer>> listOfListOfInts = Arrays.asList(a, b, c); //Creamos una lista de listas

        System.out.println("Before flattening: " + listOfListOfInts);

        List<Integer> listofInts = listOfListOfInts.stream()
                .flatMap(list -> list.stream()) // Metodo intermedio, devuelve Stream aplanado
                .collect(Collectors.toList());// Convertimos el Stream en Lista

        System.out.println("After flattening  : " + listofInts);

    }
}
