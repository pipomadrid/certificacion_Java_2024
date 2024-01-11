package Clases;

public class ClasesAbstractas extends Abstracta1 {
    @Override
    public int calculo() {
        return 0;
    }
    @Override
    public int suma(int x, int y){  // Sobreescribe el método estandar de la clase abstracta
        return 23;
    }
    //@Override
    /*public int resta(int x, int y){  // Error de compilación, no se puede sobreescribir un método final
        return 23;
    }*/
    public static void main(String[] args) {
        //Clases.Abstracta1 abs1 = new Clases.Abstracta1(); //error compilación, no se pueden crear objetos de una clase abstracta

        //POLIMORFISMO
        Abstracta1 ab = new ClasesAbstractas();
        System.out.println(ab.calculo());
        ab = new ClasesAbstracta2();
        System.out.println(ab.calculo());
    }
}
abstract class Abstracta1{
    int x;  //Puede tener atributos
    int y;
    public Abstracta1(){
        this(4,5);
    }
    public abstract int calculo(); // Método abstracto
    public Abstracta1(int x, int y){ //puede tener constructores
        this.x =  x;
        this.y = y;
    }
    public int suma(int num1,int num2){ //puede tener métodos estándares
        int suma = num1 +num2;
        return suma;
    }
    public final int resta(int num1,int num2){ // Método final , no se puede sobreescribir
        int resta = num1 +num2;
        return resta;
    }
}

class ClasesAbstracta2 extends  Abstracta1{

    @Override
    public int calculo() {
        return 50;
    }
}