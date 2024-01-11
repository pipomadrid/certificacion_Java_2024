package InstruccionesBasicas;

public class InstruccionSwitch {
    public static void main(String[] args) {

        //los valores deben ser literales, constantes entera o convertibles implicitamente en int

        int a = 11; // error no es una constante
        final int  b = 12; // correcto en int y final

        int x = 7;
        switch (x){
            case 1:
                System.out.println("insuficiente");
                break;
            case 2:
                System.out.println("insuficiente");
                break;
            case 3:
                System.out.println("insuficiente");
                break;
            case 4,5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7,8:
                System.out.println("notable");
                // al no poner el break sigue con el siguiente case
            case 9,10,b:
                System.out.println("Sobresaliente");
                break;
            case '@':
                System.out.println("Convertible implicitamente en int");
                break;
            default:
                System.out.println("nota no valida");

        }

        //SWITCH CON STRINGS
        String str1 = "hola";
        final String str2 = "gracias";
        switch (str1) {
            case "adios":
                System.out.println("despedida");
                break;
            case "hola":
                System.out.println("saludo");
                break;
            case str2:
                System.out.println("agradecimiento");
                break;
            default:
                System.out.println("otra expresión");
        }
        //EXPRESIONES
        //Se peude usar Switch para devolver el resultado de una expresión

       int nota = 6;
        String resultado = switch(nota){
           case 1,2,3,4 -> "suspenso";
            case 5,6 -> "aprobado";
            case 7,8 ->"Notable";
           case 9,10 ->"Sobresaliente";
           default -> "No válido";
        };
        System.out.println(resultado);

    }


}
