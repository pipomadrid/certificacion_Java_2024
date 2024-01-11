package InterfacesFuncionales;

import java.util.ArrayList;

public class InterfazUnaryOperator {

    public static void main(String[] args) {
        //TRANSFORMACION DE DATOS-> T apply(T t)
        //EJEMPLO MÉTODO REPLACEALL

        ArrayList<String> word = new ArrayList<>();
        word.add("hola");word.add("hola que tal");word.add("hola que tal estas");

        word.replaceAll(n -> n + ". Adios ");

        for (String s :word){
            System.out.println(s);
        }
    }


}
