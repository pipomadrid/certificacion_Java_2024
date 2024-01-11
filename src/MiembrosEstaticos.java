public class MiembrosEstaticos {
    //No están asociados a un objeto de la clase
    static int e = 0;
    static{ //Se ejecuta una vez durante la vida de una clase, sólo accede a otros bloques estáticos
        e++;
    }
    public int getE(){return e;}
    int  b = 6;
    static String c = "Miembro Estatico";

    public static int cuadrado(int a){
        //b++; // Error de compilation , sólo pueden llamar a otros miembros estáticos
        System.out.println(c);
        return a*a;
    }
    public static int ejemplo(int a){
        //this;  // No se puede llamar ni a this ni a Super
        return a;
    }

    public static void main(String[] args) {
        System.out.println(MiembrosEstaticos.cuadrado(5));
        MiembrosEstaticos mest = new MiembrosEstaticos();
        MiembrosEstaticos mest2 = new MiembrosEstaticos();
        System.out.println(mest.getE());
        System.out.println(mest2.getE());
    }


}
