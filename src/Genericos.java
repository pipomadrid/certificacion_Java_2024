import javax.swing.*;
import java.lang.reflect.GenericSignatureFormatError;

public class Genericos <T> { //Se puede operar con cualquier objeto de Java(no primitivos)

    private T dato;
    public Genericos(T dato){
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    //para definir un tipo genérico como parámetro se usa ?
    public void imprimir(Genericos <?> obj){
        System.out.println(obj);
    }


    public static void main(String[] args) {
        Genericos  <String> obj = new Genericos<>("Hola");
        Genericos  <Integer> obj2 = new Genericos<>(2);
        // Genericos2  <String> obj3 = new Genericos2<>();  //error debe extender de number
        System.out.println(obj.getDato());
        obj.imprimir(obj2); //Imprime el objeto

        MetodosGenericos obj4 = new MetodosGenericos();
        System.out.println(obj4.tipo("hola"));
        System.out.println(obj4.tipo(12));
    }
     //Se pueden definir restrcciones para que sólo se admitan genéricos de un subtipo

}
class Genericos2 <T extends Number>{

    public void imprimir(Genericos2 <?> obj){
        System.out.println(obj);
    }

}
class Genericos3 <T>{

    public void imprimir(Genericos3 <? super JButton> obj){ // Sólo objetos de tipo superclase de JButton
        System.out.println(obj);
    }

}
class MetodosGenericos{
    public <T> String tipo(T dato){ //<T> no es la devolución, indicamos que vamos a usar tipos genéricos
        return dato.getClass().getName();
    }

}