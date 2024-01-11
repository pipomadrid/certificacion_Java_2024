package Colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tablas {

    //IMPLEMENTAN INTERFAZ MAP
    //NO TIENEN ORDEN
    //TIENEN OBJETOS GENÉRICOS CLAVE VALOR
    //CLASE PRINCIPAL HASHMAP
    public static void main(String[] args) {
        //Formas de crear Colecciones.Tablas
        Map<Integer, String> miMapa = new HashMap<>(); // como instancia de hashMap
        Map<Integer, String> miMapa2 = Map.ofEntries(Map.entry(123, "Luis"), Map.entry(124, "Pedro"));
        //A través del método factoría de Map,INMUTABLE, NO ADMITE NULL
        Map<Integer, String> copia = Map.copyOf(miMapa2);//INMUTABLE, NO ADMITE NULL

        miMapa.put(1,"primero");
        miMapa.put(2,"segundo");
        miMapa.putIfAbsent(1,"error"); // No tendría que sobrescribir ya que la clave ya existe
        miMapa.putIfAbsent(3,"tercero"); // si se crea ya que no existe la clave
        System.out.println(miMapa.get(1));
        System.out.println(miMapa.get(3));
        System.out.println(miMapa.size()); //imprime tamaño de la colección en int
        miMapa.remove(3); //elimina el objeto con clave 3
        System.out.println(miMapa.containsKey(3)); // indica si existe la clave
        System.out.println(miMapa.containsValue("segundo")); //indica si existe el valor

        //RECORRER TABLA

        // Crear objeto tipo collection
        Collection <String> miVal = miMapa.values(); // El método value devuelve una colección con los valores de la tabla
        for(String k:miVal){
            System.out.println(k);
        }
        Collection <Integer> miClave = miMapa.keySet(); // El método KeySet devuelve las claves de la colección
        for(Integer n:miClave){
            System.out.println(n);
        }
        //TREEMAP
        //Similar a HashMap pero ordenados por la clave
        TreeMap <Integer,String> miTree = new TreeMap<>();
        miTree.put(200,"Doscientos");
        miTree.put(100,"cien");
        miTree.put(300,"Trescientos");
        for(String s:miTree.values()){
            System.out.println(s);
        }
    }

}
