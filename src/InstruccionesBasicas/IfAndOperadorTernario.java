package InstruccionesBasicas;

public class IfAndOperadorTernario {
    public static void main(String[] args) {
        int x = 5;

        //IF
        if(x<20) System.out.println("una sentencia"); //Si es una linea se pueden omitir las llaves

        if(x<3){
            System.out.println("dos sentencias : primera");
            System.out.println("segunda");
        }else System.out.println("falso");

        //if(x) System.out.println("error");  // error de compilación la condición debe ser boolean

        //OPERADOR TERNARIO
        int y = (x<10)?x+x:0;
        System.out.println(y);
    }



}
