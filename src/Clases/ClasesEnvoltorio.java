package Clases;

import static java.lang.Integer.valueOf;

public class ClasesEnvoltorio {


    public static void main(String[] args) {
        // Encapsulan tipos primitivos como objetos
        Integer num = new Integer(200);
        Double db = new Double(30.4);

        // Formas de convertir String a Integer

        int p = Integer.parseInt("2345");  //Convierte String en Integer
        Integer num2 = Integer.valueOf(p);   //Convierte int en Integer

        //Autoboxing
        //Se puede asignar directamente el tipo primitivo a la variable objeto
        Integer ent = 200;
        //Unboxing:
        // Se puede recuperar el tipo primitivo asignando directamente la variable objeto a la variable primitiva:
        int x  = ent; // unboxing
        Integer k = 30; // autoboxing
        k++; // unboxing, suma 1 y hace autoboxing

        //Inmutablidad
        // Las clases envoltorio son inmutables, no se peuden modificar
        Integer ent2 = 200;
        ent2 = ent2 +1 ; // Crea un nuevo objeto, unboxing, suma 1 y hace autoboxing
    }
}
