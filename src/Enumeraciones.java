public class Enumeraciones {

    public enum Dias{

        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES

    }

    public enum Nombres{

        JUAN(34),PEDRO(43),ANTONIO(25),CARLOS(67);
        int edad;
        Nombres(int n){ // Constructor privado por defecto, nop se puede añadir otro modificador
            edad = n;
        }
    }

    public static void main(String[] args) {

        Dias obj= Dias.VIERNES;
        // Se puede usar en IF y Switch
        Nombres nom = Nombres.PEDRO;
        System.out.println(nom.edad);
        for(var v : Nombres.values()){
            System.out.println("Nombre " + v.name() + " Ordinal " + v.ordinal() + " toString " + v.toString());
        }


    }


}
