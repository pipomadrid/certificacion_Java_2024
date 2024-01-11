package OrdenarListasYarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InterfazComparator {

    //SI NO SE PUEDE IMPLEMENTAR COMPARABLE UN NUESTRA CLASE PODEMOS USAR COMPARATOR
    //CREANDO OTRA CLASE APARTE QUE LA IMPLEMENTE
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("Bruno Saez");
        lista.add("Pedro");
        lista.add("Marina");
        lista.add("Sara");
        for(String s:lista){
            System.out.println(s);
        }
        lista.sort((new Criterio()));//ordena de menor a mayor

        System.out.println("Lista ordenada");
        for(String s:lista){
            System.out.println(s);
        }


        //BUSQUEDA BINARIA
        int [] miar = {1,2,3,4,5};
        System.out.println(miar[1]);
        System.out.println(Arrays.binarySearch(miar, 5)); //Devuelve la posición del valor dentro del array,
        // debe estar ordenado
        System.out.println(Arrays.binarySearch(miar, 0));// Devuelve -1. Si no lo encuentra, devuelve la posición en la que debería
        //estar según el orden natural del Array menos uno

    }

}

class Criterio implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length(); //Devuelve el resultado de la resta,si es >0 el o1 es mayor, si =0 iguales
        //si < 0 o2 es mayor
    }
}
