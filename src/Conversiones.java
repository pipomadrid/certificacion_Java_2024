public class Conversiones {


    public static void main(String[] args) {

        // Conversiones implicitas
        int x = 45;
        double n = x; // El destino debe ser mayor tamaño que origen
        //Excepciones
        byte b = 5 ;
        //char c = b; // No permirtido si el origen es numérico y el destino char

        float r = 3.4f;
        //long l = r; // tipo de destino es entero y origen decimal


        //Explícitas
        byte b2 = 5;
        char c2 = (char)b2; //Casting

        //Tipos objeto
        //La variable contiene una refencia al objeto
        //No se puede hacer conversiones de ningún tipo entre primitivos y objetos
        String s = new String("hola");
        //int n= (int)s; // Error de compilacíon


    }
}
