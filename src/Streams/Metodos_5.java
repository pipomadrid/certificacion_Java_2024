package Streams;


import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Metodos_5{

    public static void main(String[] args) {
        //REDUCIÓN A COLECCIÓN
        Stream<Integer> str = Stream.of(20,5,8,6,5,3,3,5);
        List<Integer> lst = str.distinct().collect(Collectors.toList()); //Metodo final
        for(Integer i:lst){
            System.out.print((i) + ",");
        }
        System.out.println(" ");

        //AGRUPACION
        //Devuelve un map de listas
        Stream<Personas> str2 = Stream.of(new Personas("Pedro",23),new Personas("Juan",32)
        ,new Personas("Ana",56),new Personas("Antonio",23));

        Map <Integer, List<Personas>> personas = str2.collect(Collectors.groupingBy(p->p.getEdad()));
        personas.forEach((k,v)-> System.out.println(k + " " + v));

        //PARTICIÓN
        Stream<Personas> str3 = Stream.of(new Personas("Pedro",23),new Personas("Juan",17)
                ,new Personas("Ana",15),new Personas("Antonio",23));
        //Los valores que cumplan la condición edad >18 se agrparán con la Clave true y los que no con False
        Map <Boolean,List<Personas>> per = str3.collect(Collectors.partitioningBy(p->p.getEdad()>18));
        per.forEach((k,v)-> System.out.println(k + " " + v));

        //OTROS METODOS DE INTERES
        Stream<Personas> str4 = Stream.of(new Personas("Pedro",23),new Personas("Juan",17)
                ,new Personas("Ana",15),new Personas("Antonio",23));

        // JOINING Devulve los nombres separados por comas
        //System.out.println(str4.map(p->p.getNombre()).collect(Collectors.joining(",")));

        // AVERAGE Devuelve la media de las edades
        //System.out.println(str4.collect(Collectors.averagingDouble(p->p.getEdad())));

        // SUMMING Devuelve la suma de las edades
        System.out.println(str4.collect(Collectors.summingInt(p->p.getEdad())));
    }
}
