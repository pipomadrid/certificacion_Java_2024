public class prueba1 {
    public static void main(String[] args) {
        Prueba2 an = new Prueba2();
        Prueba2 an2 = new Prueba2();
    }
}

class Prueba2 {

    {
        System.out.println("Instance init block  1 Prueba2");
    }

    static {
        System.out.println("Static init block Prueba2");
    }

    public Prueba2() {
        System.out.println("Constructor Prueba2");
    }

    {
        System.out.println("Instance init block 2  Prueba2");
    }

}