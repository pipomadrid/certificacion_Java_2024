package Records;

//Clase para reducir código al crear JavaBeans
/*
Se generan automáticamente:
    Atributos de clase(son inmutables y finales)
    Constructor (si se defina un cosntructor se debe dar valor a los atributos)
    Setter y Getter
    implementa toString() y equals()
    Son finales, no pueden ser heredados ni pueden heredar

 */
public class UsoRecords {

    public static void main(String[] args) {
        Persona per = new Persona("Juan",32,false);
        System.out.println(per.toString());
        System.out.println(per.edad());
        System.out.println(per.nombre());
    }
}

 record  Persona(String nombre,int edad,Boolean mayorDeEdad){
    //Tiene un contructor canónico por defecto pero se puede usar un constructor compacto para realizar validaciones
    public Persona{
        if(edad >=18){
            mayorDeEdad = true;
        }else{
            mayorDeEdad = false;
        }
    }

    //También puede haber sobrecarga de cosntructores pero deben llamar la canónico
     public Persona(String nombre,int edad){
        this(nombre,edad,true);

         }

}
