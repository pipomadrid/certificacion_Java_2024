package OrdenarListasYarrays;



import java.util.Arrays;

public class ComparacionArrays {

    public static void main(String[] args) {

        // SE REALIZA COMPARACIÓN LEXICOGRÁFICA
        int [] a = {1,2,3};
        int [] b = {1,2,6};
        System.out.println(Arrays.compare(a,b));//Devuelve -1 si array1 es menor que array2
        //Compara primero la posición 0(ambos son 1), la posición 1(ambos valores son 2),
        // la posición 2(el array a2 tiene un valor mayor por lo que es mayor que el array a1)
        int[] c ={1,2,3,4};
        System.out.println(Arrays.compare(a,c));// -1. c es mayor porque tiene todos los valores iguales pero
        //tiene una posición más

        int [] d = {1,2,1,3};
        System.out.println(Arrays.compare(a,d));//Devuelve 1. d tiene más posiciones pero a tiene una valor mayor en
        //la posición 2

        //DIFERENCIAS
        System.out.println(Arrays.mismatch(a,b));//Devuelve la posición de la primera diferencia.2
        System.out.println(Arrays.mismatch(a,c));//3
    }
}
