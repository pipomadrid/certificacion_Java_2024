public class MetodosYSobrecarga {

    public int sumar(int a, int b ){
        int s =  a + b ;
        return s;
    }
    public double sumar(double c,double d){ //Sobracarga de método sumar
        double s = c + d;
        return s;
    }
    public void mensaje(String frase){
        System.out.println(frase);
    }

    public void aumentar(int e){
        e++;
    }
    public void concatenar( StringBuilder str){
        str.append(" frase");
    }
    public void concatenar(String str){
        str += "frase";
    }

    public static void main(String[] args) {
        MetodosYSobrecarga met = new MetodosYSobrecarga();
        int suma = met.sumar(5,6);
        System.out.println(suma);
        met.mensaje("no devuelve nada");

        double suma2 = met.sumar(5.5,6.6);
        System.out.println(suma2);

        int e = 6;
        met.aumentar(6); //se pasa una copia de e, no se modifica el original
        System.out.println(e);

        StringBuilder f = new StringBuilder("hola");
        met.concatenar(f); //le pasamos la referencia del objeto, modifica f ya que apuntan al mismo objeto
        System.out.println(f);

        String g = "hola";
        met.concatenar(g);//los String son inmutables al concatenar se crea un nuevo objeto, pero g no cambia
        System.out.println(g);
    }

}
