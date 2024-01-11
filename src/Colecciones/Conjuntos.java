package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    //SET
    //NO TIENEN POSICIÓN NI CLAVE, ELEMENTOS SON UNICOS
    //IMPLEMENTA INTERFAZ SET
    //PRINCIPAL CLASE HASHSET
    public static void main(String[] args) {
        //Creación de conjuntos
        Set<String> mySet = new HashSet<>(); // Mediante instancia de Hashset
        Set<String> mySet2 = Set.of("uno","dos","tres"); //INMUTABLE,no admite null
        Set<String> copia = Set.copyOf(mySet2);//INMUTABLE,no admite null

        System.out.println(mySet.add("Jorge")); // Añade un elemento, devuelve true si se ha realizado correctamente
        System.out.println(mySet.add("Juan"));
        System.out.println(mySet.add("Pedro"));
        System.out.println(mySet.add("Jorge")); //Devuelve false, ya existe "Jorge"
        System.out.println(mySet.remove("Juan"));// Elimina un elemento, devuelve true si se ha realizado correctamente
        System.out.println(mySet.size());
        System.out.println(mySet.contains("Jorge"));

        for(String s:mySet){
            System.out.println(s);
        }
    }
}
