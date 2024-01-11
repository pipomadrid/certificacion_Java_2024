package EntradaSalidaIO;

import java.io.*;

public class EntradaJavaIO {
 //Paquete tradicional de envio y recueperación de datos
    public static void main(String[] args) {
        //PRINTSTREAM
        // Escritura en consola
        System.out.println("Con espacio");
        System.out.print("Sin ");
        System.out.print("espacios");
        System.out.println();
        System.out.printf("%.2f%n",12.365488);// muestra dos decimales
        // % indica que se va a intriducir un valor
        //.2 la cantidad de decimales
        // f el tipo
        //%n introduce salto de linea
        System.out.println("prueba salto de linea anterior");

        //Escritura en archivo
        String dir = "C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\archivo1.txt";
        try(PrintStream out = new PrintStream(dir)){
            out.println("Mi primer linea");
        }catch (IOException ex){
            System.out.println("Error al escribir en archivo");
        }
        try(FileOutputStream fos = new FileOutputStream(dir,true);//Permite escritura modo append
            PrintStream out = new PrintStream(fos)){
            out.println("Mi segunda linea");
        }catch (IOException ex){
            System.out.println("Error al escribir segunda linea en archivo");
        }

        //FILEWRITER

        //Graba datos en modo sobreecritura, si no hay archivo lo crea
        String dir2 = "C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\archivo2.txt";
        try(FileWriter out = new FileWriter(dir2)){
            out.write("Mi primera linea con Filewriter");
        }catch (IOException ex){
            System.out.println("Error al escribir en archivo con FileWriter");
        }
        //modo append
        try(FileWriter out = new FileWriter(dir2,true)){

            out.write("\nMi segunda linea con Filewriter");
        }catch (IOException ex){
            System.out.println("Error al escribir en archivo con FileWriter");
        }
        //Con BufferedWriter para mejorar rendimiento
        try(FileWriter out = new FileWriter(dir2,true);
            BufferedWriter bos = new BufferedWriter(out)){
            bos.write("\nMi tercera linea con BufferedWriter");
            bos.newLine();
            bos.append("Mi cuarta linea con BufferedWriter");
        }catch (IOException ex){
            System.out.println("Error al escribir en archivo con FileWriter");
        }






    }


}
