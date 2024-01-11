public class BloquesInicializacion {

    //BLOQUES
    //Se ejecutan antes del constructor
    {
        System.out.println("primero");
    }
    public BloquesInicializacion(){
        System.out.println("segundo");
    }

    public static void main(String[] args) {
        BloquesInicializacion blq = new BloquesInicializacion();

    }

}
