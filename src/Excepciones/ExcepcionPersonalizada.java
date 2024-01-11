package Excepciones;

//CREACIÓN EXCEPCIÓN PERSONALIZADA
//Debe extender de Exception

import java.util.Scanner;

public class ExcepcionPersonalizada extends Exception {

    public ExcepcionPersonalizada(String mensajeError){ //Le pasamos el mensaje personalizado
        super(mensajeError); //Este parámetro se le pasa al constructor de la superclase Exception
    }


    public static void main(String[] args)  {
        System.out.println("Escribe tu edad");
        CheckEdad ck = new CheckEdad();
        try {
            ck.chekEdad();
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Error");
            e.printStackTrace();//Imprime la traza de errores con el mensaje incluido
            e.getMessage();
        }


    }

}

class CheckEdad{
    Scanner sc = new Scanner(System.in);
    int edad = sc.nextInt();
    public boolean chekEdad() throws ExcepcionPersonalizada { //Método que propaga la excepción
        if (edad == 0) {
            throw new ExcepcionPersonalizada("La edad no puede ser " + edad);
        }
        return false;
    }


}
