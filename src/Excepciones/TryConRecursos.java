package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class TryConRecursos {

    //Se usa para cerrar recursos de manera automática sin necesidad de usar el bloque Finally
    //ni los métodos close de lso objetos

    //Se pueden cerrar múltiples objetos

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("datos.txt"); BufferedReader bf=new BufferedReader(fr)){
            //...
            //...
            //Antes de salir del try se llama automáticamente a los métodos close y se cierran los objetos
        }catch (Exception e){

        }

       /* La creación del objeto se puede realizar antes del try, indicando después
        la variable entre los paréntesis del try.
        En Este caso la variable se tratará como constante efectiva:*/

        	/*
        	Connection con = DriverManager.getConnection();
        	try(con){
            	…
            	}

        	Connection  con = DriverManager.getConnection(..);
        	con = DriverManager.getConnection(..); // error de compilación
        	try(con){
            	…
            	}
            */

    }
}
