package EntradaSalidaNIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClasePath {
     //Interfaz Path representa una ruta o fichero

    public static void main(String[] args) {

        //Formas de implementar
        Path pth = Path.of("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\Path\\pruebaPath.txt");
        Path pth2 = Paths.get("C:\\Users\\psaezper\\Desktop\\Certificación Java Udemy\\Archivos ejercicios\\pruebaPath2.txt");
        //OBTENER NOMBRE ARCHIVO
        System.out.println(pth.getFileName());
        //OBTENER RUTA COMPLETA
        System.out.println(pth.toAbsolutePath());
        //OBTENER PATH NORMALIZADO
        System.out.println(pth.normalize());
        System.out.println(pth2.normalize().toAbsolutePath());//Devuelve la ruta absoulta normalizada
        //OBTENER RUTA RELATIVA RESPECTO OTRO PATH
        System.out.println(pth.relativize(pth2)); //ruta relativa desde pth a pth2
        System.out.println(pth2.resolve(pth));
        System.out.println(pth.getNameCount()); //Devuelve número de elementos del Path
        System.out.println(pth.getName(0));// Devuelve la parte del Path que ocupa la posición
        // indicada(no incluye raiz)
    }
}

