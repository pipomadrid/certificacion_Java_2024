package Serializable;

import java.io.Serializable;

public class PruebasSerialización implements Serializable { //La interfaz no define métodos por
    // lo que no ha nada que implementar
    private String nombre;
     private int  edad;
    transient private String  contraseña; // No se serializa
    public PruebasSerialización(String nombre, int edad,String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.contraseña= contraseña;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
