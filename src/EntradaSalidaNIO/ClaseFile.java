package EntradaSalidaNIO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ClaseFile {
    //Proporciona métodos estáticos para leer el contenido de un fichero

    public static void main(String[] args)  {
        Path pth = Path.of("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\Path\\pruebaPath.txt");

        //Lectura
       try{
           List < String > datos = Files.readAllLines(pth); //Devuelve lsita con cadenas del fichero, cada elemento
           //es una linea
           datos.forEach(s-> System.out.println(s));
       }catch (IOException ex){
           System.out.println("Error al leer archivo");
       }

       //Escritura
        try{
            Files.writeString(pth,"Escritura 1", Charset.forName("UTF-8"), StandardOpenOption.APPEND);
        }catch (IOException ex){
            System.out.println("Error al leer archivo");
        }
        //Escribe una lista de Strings en el archivo
        try{
            List <String> cadenas = List.of("lunes","martes","miércoles","jueves","viernes");
            Files.write(pth,cadenas, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
        }catch (IOException ex){
            System.out.println("Error al leer archivo");
        }
       //Copia
        Path pth2 = Path.of("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\Path\\copiapruebaPath.txt");
        try {
            Files.copy(pth, pth2, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException ex){
            ex.printStackTrace();
        }

        //Mover
        Path pth3 = Path.of("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios 2\\archivomovido.txt");
        //Mueve el archivo de un lugar a otro, tiene que estar vacío el directorio
        try {
            Files.move(pth2,pth3,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Eliminar
        try {
            Files.deleteIfExists(pth3);//Elimina si existe, si no no hace nada, si es directorio debe estar vacío
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Crear
        Path pth4 = Path.of("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios 2\\archivo creado.txt");
        try {
            Files.createFile(pth4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
