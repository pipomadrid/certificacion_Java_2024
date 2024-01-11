package Streams;



import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Metodos_1 {
    //Metodos intermedios devuelven Stream
    //Metodos finales , o void o devolver resultado de operación

    public static void main(String[] args) {
      Stream st = Stream.of(2, 5, 7, 3, 6, 2, 3);
      //CONTEO Y PROCESADO count()
        System.out.println("Conteo y procesado");
        System.out.println(st.count()); //Final, tras ejecutarse se cierra, el siguiente dará error de ejecución
        //st.forEach(System.out::println); //Final

        //EXTRACCIÓN DE DATOS distinct() , limit() , skip()
        System.out.println("Extracción de datos");
        Stream st2 = Stream.of(2, 5, 7, 3, 6, 2, 3);
        System.out.println(st2.distinct().count()); //Intermedio, devuelve la cantidad de numeros
        // no repetidos y los imprimimos

        Stream st3 = Stream.of(2, 5, 7, 3, 6, 2, 3);
        Stream st4 = st3.limit(3); //Intermedio, devuelve otro Stream con los 3 primeros elementos del anterior
        System.out.println("Limit");
        st4.forEach(System.out::println);

        Stream st5 = Stream.of(2, 5, 7, 3, 6, 2, 3);
        Stream st6 = st5.skip(4);//Intermedio, devuelve el Stream st3 saltándose los 4 primeros
        System.out.println("Skip");
        st6.forEach(System.out::println);

        //COMPROBACIONES anyMatch()
        IntStream st7 = IntStream.of(2, 5, 7, 3, 6, 2, 3);
        System.out.println("Alguno mayor que 5 :" + st7.anyMatch(n->n>5)); //Final

        // allMatch -> Devuelve true si todos cumplen la condición
        // noneMatch -> Devuelve true si ninguno cumple la condición

        //EJERCICIO
        System.out.println("Ejercicio");
        Stream <String> nombres = Stream.of("mario","ana","david","belen");
        System.out.println("Finaliza alguno con d : " + nombres.anyMatch(n->n.endsWith("d")));
    }


}
