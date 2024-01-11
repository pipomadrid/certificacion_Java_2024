package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreacionStreams {
    public static void main(String[] args) {
        //A partir de Colección
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);nums.add(100);nums.add(8);
        Stream<Integer> st = nums.stream();

        //A partir de un array
        String[] cads = {"a","xy","jk","mv"};
        Stream <String> st2 = Arrays.stream(cads);

        //A partir de serie discreta de datos
        Stream<Double> st3 = Stream.of(2.4 ,7.4 ,9.1);

        //A  partir de un rango
        IntStream stint = IntStream.range(1,10); // recorre del 1 al 9
        IntStream stint2 = IntStream.rangeClosed(1,10); // recorre del 1 al 10


    }
}
