package Streams;

public class Personas implements Comparable <Personas> {
        private String nombre;
        private int edad;

        public Personas(String nombre,int edad){
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
        public int compareTo(Personas p) {
            if(this.nombre.compareTo(p.getNombre()) == 0){ //Primero compara el nombre, si son iguales se compara
                //la edad
                return ((Integer)this.edad).compareTo(p.edad);//Se compara edad, devuelve 1,0 o -1 y lo usa sort
            }else{
                return this.nombre.compareTo(p.getNombre());//Si no son iguales los nombres los
                // compara y devuelve 1 o -1
            }
        }
}
