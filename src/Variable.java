public class Variable {

    int atrInt;  // variable atributo, se inicicializa por defecto a 0
    double atrDouble;  // variable atributo, se inicicializa por defecto a 0.0
    boolean atrBoolean; // variable atributo, se inicicializa por defecto a false
    char atrChar; // variable atributo, se inicicializa por defecto a ‘\u0000’ (carácter nulo)
    public static void main(String[] args) {
        int myInt;  // Variable local no se incializa por defecto
        int myInt2 = 2;
        int myInt3,myInt4,myInt5 = 5;
        myInt3 = 3;
        myInt4 = 4;
        String myStr1_$ = "Caracteres permitidos: Letras, números, $ y _";
        //String 1myString;  Error , no puede comenzar por número
        // int try = 5;   Error no se pueden usar palabras reservadas
        int num = 2_345;
        double dou = 45.6_9;
        // int num2 = _2345;// no permitido
        // int num2 = 2345_;// no permitido
        // double dou2 = 45._69; // no permititdo

        char c = 'a';
        int letra = c;
        System.out.println(c);

        Variable myVar = new Variable();
        System.out.println(myVar.atrInt);
        System.out.println(myVar.atrDouble);
        System.out.println(myVar.atrBoolean);
        System.out.println(myVar.atrChar);
        // System.out.println(myInt); Error , la variable no se ha inicializado
        System.out.println(myInt2);
        System.out.println(myInt3);
        System.out.println(myInt4);
        System.out.println(myInt5);
        System.out.println(myStr1_$);
        String cad = """
                A
                B
                C \s
                """;

        System.out.println(cad);
        System.out.println(cad.length());
        System.out.println(cad.indent(1));

        String st1 = " hola \n";
        String st2 = " adios \n";
        String st3 = (st1 + st2).stripIndent();
        System.out.println(st3);
        System.out.println(st3.length());

        String st4 = " hola \n hola \n ";
        System.out.println(st4.stripIndent());
        System.out.println(st4.stripIndent().length());
    }
}
