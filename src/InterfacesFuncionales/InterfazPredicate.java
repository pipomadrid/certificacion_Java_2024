package InterfacesFuncionales;

import java.util.ArrayList;
import java.util.List;

public class InterfazPredicate {
        //LA INTERFAZ PREDICATE TIENE EL MÉTODO TEST QUE OBTIENE UN OBJETO Y LO COMPRUEBA ->boolean test(T t)
        // SE PUEDE USAR PARA FILTRAR COMO EN EL MÉTODO REMOVEIF


    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("uno");miLista.add("dos");miLista.add("tres");

        miLista.removeIf(n->n=="uno");//El método removeIf necesita que le pasemos una implementación de Predicate

        for(String s:miLista){
            System.out.println(s);
        }

    }

}
