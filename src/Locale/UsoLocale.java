package Locale;


import java.util.Locale;
import java.util.ResourceBundle;

public class UsoLocale {

    public static void main(String[] args) {

        //El archivo properties debe estar en la raiz del proyecto
        //Si no se indica pais o no existe el elegido toma el archivo sin pais(mensajes.properties)

        ResourceBundle rs = ResourceBundle.getBundle("mensajes");//Coge el archivo sin pais
        System.out.println(" " + rs.getString("dato1"));
        System.out.println(" " + rs.getString("dato2"));

        //Podemos establecer un idioma por defecto para que se use en vez del predeterminado
        Locale.setDefault(Locale.ENGLISH);
        ResourceBundle rs2 = ResourceBundle.getBundle("mensajes");//Usa el de extensión _en
        // ya que hemos puesto el Inglés por defecto
        System.out.println(" " + rs2.getString("dato1"));
        System.out.println(" " + rs2.getString("dato2"));

        ResourceBundle rs3 = ResourceBundle.getBundle("mensajes",Locale.FRANCE);//Usa el de extensión _en
        System.out.println(" " + rs3.getString("dato1"));
        System.out.println(" " + rs3.getString("dato2"));
    }


}
