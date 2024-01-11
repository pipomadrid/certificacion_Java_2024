package Colecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    //NO TIENEN TAMAÑO FIJO
    //TIENEN POSICIÓN SEGÚN ORDEN DE LLEGADA
    //CLASE PRINCIPAL ARRAYLIST

    public static void main(String[] args) {

        //Formas de crear Colecciones.Listas
        List<Integer> numeros = new ArrayList<>(); // instacia de ArrayList
        List<Integer> numeros2 = Arrays.asList(6,5,4,9); // Desde Array NO SE PUEDE MODIFICAR
        List<Integer> numeros3 = List.of(8,7,4,5,6);//Método factoria de List,NO SE PUEDE MODIFICAR NI ADMITE NULL
        List<Integer> copia = List.copyOf(numeros2);//NO SE PUEDE MODIFICAR NI ADMITE NULL

        numeros.add(2);// Añade a primera posición
        numeros.add(0,3); //mete 3 en primera posición y el anterior pasa a la siguiente
        numeros.set(1,5); //sustituye el elemento del indice indicado por el que proporcionamos

        //numeros2.add(3); //Error en tiempo de ejecución
        //numeros3.add(3); //Error en tiempo de ejecución
        //copia.add(3);  //Error en tiempo de ejecución

        for(int n:numeros){
            System.out.println(n);// 3, 5
        }
        System.out.println(numeros.size());// 2
        System.out.println(numeros.get(1));//5
        System.out.println(numeros.remove(numeros.get(1)));// elimina el 5 y devuelve true
        System.out.println(numeros.size());// 1
    }
}
