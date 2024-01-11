package Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ColasDobles {

    //DEQUE
    //SE AÑADEN ELEMENTOS POR AMBOS EXTREMOS
    //CLASE PRINCIPAL ARRAYDEQUE y LINKEDLIST

    public static void main(String[] args) {
        //Creación
        Deque<String> myDeq = new ArrayDeque<>();// Como instacia de ArrayDeque
        Deque<String> myDeq2 = new LinkedList<>(); //Como instancia de LinkedList

        System.out.println(myDeq.add("objeto1")); //Lo añade al final
        myDeq.push("objeto2");
        myDeq.push("objeto3");
        myDeq.push("objeto4");
        myDeq.push("objeto5");
        System.out.println("Se elimina " + myDeq.poll());//Elimina el primer dato de la cabecera y lo devuelve
        System.out.println("Se elimina " + myDeq.pollLast());//Elimina el último elemento y lo devuelve
        System.out.println("Se elimina " + myDeq.remove());//Elimina el  el primer dato de la cabecera y lo devuelve
        //myDeq.removeLast(); //Igual que remove() pero con el último elemento
        System.out.println(myDeq.peek());//Devuelven el elemento de la cabecera pero sin eliminarlo
        System.out.println(myDeq.element());//Devuelven el elemento de la cabecera pero sin eliminarlo
        System.out.println(myDeq.size());

        System.out.println("Contenido del array myDeq");
        for(String s: myDeq){
            System.out.println(s);
        }

    }
}
