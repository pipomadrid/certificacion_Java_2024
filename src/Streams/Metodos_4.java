package Streams;

import java.util.stream.Stream;

public class Metodos_4 {

    public static void main(String[] args) {
        //PROCESAMIENTO INTERMEDIO peek()
       Stream<Integer> nums = Stream.of(20,5,8,3,9);
       System.out.println("Total " + nums
               .filter(n->n%2==0)
               //metodo intermedio
               .peek(n-> System.out.println("par: " + n)) //aplica un consumer y devuelve un nuevo Stream modificado
               .count());//Si no ponemos un metódo final no se aplicará el peek

        //ORDENACION sorted()
        Stream <String> st = Stream.of("casa", "pelota" ,"lampara", "disco");
        //metodo intermedio
        st.sorted((a,b)-> a.length()-b.length()).forEach(System.out::println);

        //REDUCCIÓN reduce()
        Stream <Integer> nums2 = Stream.of(20,5,8,3,9);
        //metodo final
        System.out.println(nums2.reduce((a,b)-> a+b).get()); //reduce los elementos del Stream a un sólo valor,
        // en este caso la suma

        //Ejercicio, sumar 3 numeros pares mas pequeños
        Stream <Integer> nums3 = Stream.of(11,20,5,8,3,9,4,10,2);
        System.out.println(nums3
                .filter(n->n%2==0)
                .sorted()
                .limit(3)
                .reduce((a,b)->a+b)
                .get());

    }
}
