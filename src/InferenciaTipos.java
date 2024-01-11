import java.sql.Array;
import java.util.ArrayList;

public class InferenciaTipos {

   // var  atributo = "hola"; // Error, variable atributo

    public static void main(String[] args) {
        //Declarar variables sin indicar tipo

        var num = 23;
        var datos = "hola";
        var miArray = new ArrayList<Integer>();

        //Sólo se puede usar con variables locales
        //No se peude asiganr null
         // var num2 = null; //ERROR
        //No se peude usar declaraciones múltiples
        // var a, c;  //ERROR
        //En Arrays no peude usarse con anotación abreviada
        // var s = {5,6,7,8} //ERROR
        //Se puede usar en bucles for
        for ( var i = 0;i < 3;i++){
            System.out.println("Numero " + i);
        }
        int a = 3;
        int b = 6;
        int c = 9;
        if(a<c && b<c) {
            System.out.println(a);
            System.out.println(c);
        }
    }


}
