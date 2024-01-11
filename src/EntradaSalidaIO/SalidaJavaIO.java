package EntradaSalidaIO;

import java.io.*;
import java.util.Scanner;

public class SalidaJavaIO {

    public static void main(String[] args) {
        //LECTURA POR TECLADO
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();//captura toda la linea
        System.out.println("Bienvenido " + nombre);
        //BUFFEREFREADER
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bre = new BufferedReader(reader)){
            System.out.println("Introduce tu edad");
            int edad= Integer.parseInt(bre.readLine());
            System.out.println("Edad = " + edad );
        }catch (IOException ex){
            System.out.println("Error al leer por consola");
        }

        //LECTURA DE FICHERO
        //BUFFEREDREADER
        String dir  ="C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\archivo1.txt";
        try(FileReader fr = new FileReader(dir);
            BufferedReader bre2 = new BufferedReader(fr)){
            String line;
            while((line = bre2.readLine())!=null){ //Mientras hay datos para leer
                System.out.println(line);
            }
        }catch (IOException ex){
            System.out.println("Error al leer archivo");
        }
        //FILEINPUTSTREAM - Lectura de ficheros binarios
        String dir2  ="C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\archivo1.txt";
        File file = new File(dir2);
        try(FileInputStream fis = new FileInputStream(file)){
          byte[] res = new byte[(int) file.length()];
            System.out.println(fis.read(res));
        }catch (IOException ex){
            System.out.println("Error al leer archivo");
        }

        //FILE Representa un fichero
        File dir3 = new File("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\archivo1.txt");
        System.out.println("¿Existe? :"+ dir3.exists()); // Nos indica si existe el archivo
        System.out.println("¿Es un fichero? :"+ dir3.isFile()); // Nos indica si es un fichero
        System.out.println("¿Es una carpeta? :"+ dir3.isDirectory()); // Nos indica si es una carpeta
        //System.out.println(" Es un fichero? :"+ dir3.delete()); //Elimina en archivo/carpeta y devuelve boolean
    }
}
