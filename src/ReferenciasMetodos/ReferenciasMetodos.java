package ReferenciasMetodos;

import Streams.Personas;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenciasMetodos {

    public static void main(String[] args) {

        //Sustituyen a expresiones lambda cuya isntrucción es una llamada a método
        //los parámetros y el objeto al que aplican deben poderse deducir por el contexto

        //Sintaxis Clase/objeto::nombre metodo
        Stream<String> str = Stream.of("casa","pelota","jarrón");
        str.sorted((a,b) ->a.length()-b.length()).forEach(System.out::println);

        Stream<Personas> str4 = Stream.of(new Personas("Pedro",23),new Personas("Juan",17)
                ,new Personas("Ana",15),new Personas("Antonio",12));
        Map<Integer,String> tabla = str4.collect(Collectors.toMap(Personas::getEdad,Personas::getNombre));
        tabla.forEach((a,b)-> System.out.println("Nombre: " + b+ ", edad: " + a));
    }
}
