package Serializable;

import java.io.*;

public class PrincipalSerializacion {

    public static void main(String[] args) {
        String dir = "C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\Serialización_objeto_prueba";
        //Se crea un archivo con el objeto serializado
        try(FileOutputStream fos = new FileOutputStream(dir);
            ObjectOutputStream out = new ObjectOutputStream(fos)){
            out.writeObject(new PruebasSerialización("Juan",3,"23456H"));

        }catch (IOException ex){

        }
        //Lectura del fichero serializado
        try(FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream in = new ObjectInputStream(fis)){
            PruebasSerialización prueba1 = (PruebasSerialización)in.readObject();
            System.out.println(prueba1.getEdad());
            System.out.println(prueba1.getContraseña()); // No se serializa ya que lo hemos declarado como Transient

        }catch (IOException | ClassNotFoundException ex){

        }
    }
}
