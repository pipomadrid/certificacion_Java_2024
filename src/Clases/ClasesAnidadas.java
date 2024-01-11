package Clases;

public class ClasesAnidadas {

    int num1=9;
    int num2=3;
    static String frase = "Hola";

    public static void main(String[] args) {
        ClasesAnidadas obj = new ClasesAnidadas();
        ClasesAnidadas.interna inter = obj.new interna(); //Para instanciar clase interna necesitamos crear
        // objeto de la externa
        ClasesAnidadas.estaticaInterna inter2 = new ClasesAnidadas.estaticaInterna();
        obj.metodo();

    }

    //CLASE ESTANDAR Se define dentro de otra clase
    class interna{
       public int suma(){
           int suma  = num1 + num2; //podemos acceder a los miembros de la clase externa
           return suma;
       }

    }
    //CLASE ESTÁTICA
    static class estaticaInterna{ //Sólo puede acceder a los miembros estáticos de la clase externa

        /*public int resta(){ //Error de compilación,los atributos de la externa deben ser estáticos
            int suma  = num1 + num2; //podemos acceder a los miembros de la clase externa
            return suma;
        }*/
        public void imprimirMensaje(){
            System.out.println(frase); //frase lo podemos usar porque es estático
        }
    }

    //CLASE LOCAL A METODO
    void metodo(){
        System.out.println("comienzo método prueba clase local a método");
        class Interna2{
            public void imprimir() {
                System.out.println("Me´todo imprimir clase local");
            }
        }
        Interna2 interna  = new Interna2(); //Sólo se puede instanciar dentro del método
        interna.imprimir();

    }
    //CLASE ANÓNIMA
    //No tienen nombre de clase, se definen al vuelo
    Runnable rb = new Runnable() {
        @Override
        public void run() {
            //Código del método
        }
    };
}
