public class ConstructoresHerencia {
    //Todas las clases llevan por defecto un constructor sin parámetros pero no se crea si ya hemos
    // creado uno con parámetros
    int a;
    public ConstructoresHerencia(int a){
        super();// lleva implicito la llamada a super(), se puede omitir, al no heredar
        // de ninguna clase se llama al super de Object
        this.a = a;
    }



}
class Clase2 extends ConstructoresHerencia{
    public Clase2() {
        //super(); //Error compilación , para llamar al constructor de la superclase tenemos que utilizar el super un parámetro
        //ya que la superclase ya no tiene el contructor por defecto
        super(6); // Correcto, llamamos al único constructor de la superclase

    }
}

class Clase3 extends ConstructoresHerencia{
    int b = 7;
    public Clase3(int b){
        super(b); // llamada a constructor de ConstructoresHerencia
        this.b = b;
    }
    public Clase3() {
        //No hay llamada a super por que usamos el This
        this(6); // llamamos al constructor con parámetros, sólo puede ir la primera línea, igual que super

    }


}