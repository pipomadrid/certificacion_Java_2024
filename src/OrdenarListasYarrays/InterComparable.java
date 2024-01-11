package OrdenarListasYarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterComparable {

    public static void main(String[] args) {

        Persona per = new Persona("Angel",32);
        Persona per2 = new Persona("Bruno",23);
        Persona per3 = new Persona("Antonio",45);

        List<Persona> listPer = new ArrayList<>();
        listPer.add(new Persona("Angel",32));
        listPer.add(new Persona("Bruno",23));
        listPer.add(new Persona("Angel",45));

        System.out.println("Antes de ordenar: ");
        for(Persona p:listPer){
            System.out.println(p.getNombre() + " " + p.getEdad());
        }

        Collections.sort(listPer);
        System.out.println("Despues de ordenar: ");
        for(Persona p:listPer){
            System.out.println(p.getNombre() + " " + p.getEdad());
        }

    }
}

 class Persona implements Comparable<Persona>{//Este orden se define a través de la interfaz Comparable
    // que debe ser implementada por los objetos a ordenar, el método sort() de arrays y listas
    // usa este método para ordenar

    private String nombre;
    private int edad;

    Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona p) {
        if(this.nombre.compareTo(p.getNombre()) == 0){ //Primero compara el nombre, si son iguales se compara
            //la edad
            return ((Integer)this.edad).compareTo(p.edad);//Se compara edad, devuelve 1,0 o -1 y lo usa sort
        }else{
            return this.nombre.compareTo(p.getNombre());//Si no son iguales los nombres los
            // compara y devuelve 1 o -1
        }
    }
}
