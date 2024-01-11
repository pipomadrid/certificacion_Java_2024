package InstruccionesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Operadores {


    public static void main(String[] args) {

        //ARITMÉTICOS
        int a = 13;
        a++; // equivale a    a = (int)(a+1)
        System.out.println(a);

        int b = 5 ,c;
        c = ++b;  // suma primero y luego asigna el valor a c
        System.out.println(c);

        int d = 5 ,e;
        e = d++;  // asigna el valor a "e" primero y después suma 1 a d
        System.out.println(e);

        //ASIGNACIÓN

        int f = 3; // asignación
        f+=10; // igual a f= f+10
        System.out.println(f);

        byte g = 10;
        g+=5; // igual a g=(byte)(g+5)
        System.out.println(g);
        // g = g +5; error de compilación , no hay conversión a byte

        //CONDICIONAL
        int h = 3;
        double i = 9.5;
        boolean j = false;
        if(h<i) System.out.println("verdadero");
        // if(a<j);// error de compilación, deben ser de tipos compatibles

        //LOGICOS
        int k = 3;
        int l = 9;
        int m = 0;
        if(k>m && k<l) System.out.println("verdadero");// verdadero
        if(!(m==0)) System.out.println("verdadero");// falso
        //&& y || funcionan en modo cortocircuito
        boolean n = (k<m && k<++l); // l no se modifica ya que al no cumplirse la primera condición no pasa a la siguiente
        System.out.println(n);
        System.out.println(l);

        //NEW
        ArrayList lista = new ArrayList();
        //INSTANCE OF
        String s = "hola";
        System.out.println(s instanceof String); // dice si un objeto es de un tipo

        //A partir de Java 16 se pueden usar para asignar el objeto a una variable del tipo
        Object obj = new String("cadena");
        if(obj instanceof String str) System.out.println("Longitud " + str.length());

    }

}
