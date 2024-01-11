
public class Constructores {
    // Sino declaramos un contructor  Java proporciona uno por defecto sin parámetros ni instrucciones
    int e;
    public Constructores(int b, int c){ // Si definimos uno el  compilador ya no crea el contructor por defecto
        e = b+c;
    }

    //SOBRECARGA
    public Constructores(int d){ //sobrecarga igual que métodos
        this(5,5); // podemos llamar a otro constructor, siempre primera isntrucción
        e+= d;
    }

    public static void main(String[] args) {
        Constructores ctr = new Constructores(3,4);
       // Contructores ctr = new Contructores(); // Error compilación, no hay contructor por defecto
        System.out.println(ctr.e);

        Constructores ctr2 = new Constructores(5);
        System.out.println(ctr2.e);
    }
}
