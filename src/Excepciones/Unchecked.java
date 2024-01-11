package Excepciones;

public class Unchecked {
    //Son excepciones
    //Los errores a diferencia de las excepciones no se pueden recuperar
            //ERRORES: falta espacio memoria, error JVM OutOFMemoryError,StackOverFlowError, InternalError…

    public static void main(String[] args) {
        //EXCEPCIONES
        int datos [] = new int [10];
        //System.out.println(datos[11]);// ArrayIndexOutOfBoundsException
        String st = null;
        //System.out.println(st.length()); //NullPointerException
        Object ob = new String("34");
        // Integer in = (Integer)ob; // ClassCastException  String no se puede convertir en Integer
        // int n = 5/0; //ArithmeticException
        try {
            Thread.sleep(-100); //IllegalArgumentException No puede ser negativo
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
