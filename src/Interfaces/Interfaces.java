package Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Interfaz1 obj = new ClaseImplements1();
        obj.girar(120);
        System.out.println(obj.k);
    }

}

interface Interfaz1{
int k = 10; //Aunque no se indique es public, final y static
static public final int f = 5;

void girar(int grados); //Aunque no se indique es public y abstract

public abstract int invertir();

}
interface Interfaz2{
    int num1 = 10; //Aunque no se indique es public, final y static

    void sumar(int grados); //Aunque no se indique es public y abstract

}
interface Interfaz3 extends Interfaz1,Interfaz2{ //Una interfaz puede heredar varias interfaces
    int num1 = 10; //Aunque no se indique es public, final y static

    void restar(int grados); //Aunque no se indique es public y abstract

}

class ClaseImplements1 implements Interfaz1,Interfaz2{ //Se permite la implemetnación múltiple de interafaces

    @Override
    public void girar(int grados) { //Hay que añadir public, el método no puede ser mas
        // restrictivo que el de la interfaz
        System.out.println("ha girado " + grados + " grados");
    }
    @Override
    public int invertir() {
        return 0;
    }

    @Override
    public void sumar(int grados) {

    }
}

class ClaseImplements2 implements Interfaz3{ // Como Interfaces.Interfaz3 hereda las otras interfaces debemos
    // implementar todos los métodos abstractos


    @Override
    public void girar(int grados) {

    }

    @Override
    public int invertir() {
        return 0;
    }

    @Override
    public void sumar(int grados) {

    }

    @Override
    public void restar(int grados) {

    }
}