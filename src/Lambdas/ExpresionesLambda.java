package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class ExpresionesLambda {

    //Implementan una interfaz funcional (Sólo un método abstracto), puede tener otros  static y Default
    //Con el lambda proprocionamos el código del método abstracto de esa interfaz funcional
    String a = "Método de clase";


    public static void main(String[] args) {


        Inter inter1 = (a,b)-> System.out.println(a+b);//Creamos un objeto de la interfaz con una
        // implementación del método de la interfaz
        Inter inter2 = (a,b)-> System.out.println(a-b);//Creamos otro objeto de la interfaz con otra
        // implementación distinta del metodo la interfaz
        inter1.metodo1(5,6);// llamamos al método implementado
        inter2.metodo1(5,6);// llamamos al método implementado

        Inter2 inter3 = (a,b)-> { //al llevar mas de una isntrucción debe llevar llaves
            int x;
            x = a+b;
            return x;
        };
        Inter2 inter4 = (a,b)-> a-b;// Una instrucción no necesita ni llaves ni return

        int mivar = inter3.metodo2(3,4);
        System.out.println(mivar);

        int mivar2= inter4.metodo2(7,88);
        System.out.println(mivar2);

        List<String> textos = new ArrayList<>();
        textos.add("mi texto1");
        textos.add("mi texto mas largo");
        textos.sort((a,b) -> a.length()-b.length());
        for(String s:textos){
            System.out.println(s);
        }
    }
}
interface Inter {

    void metodo1 (int a, int b);
}
interface Inter2 {

    int metodo2 (int a, int b);
}