public class CiclosVidaObjeto {


    public static void main(String[] args) {
        // CREACIÓN OBJETO
        String s = new String("hola"); //Se asigna a la varaible una referencia al objeto
        //Constructores
        // Se ejecutan durante la creación de un objeto,


    }
    //DESTRUCCIÓN OBJETO ( Garbage Collector)
    //Los objetos se eliminan cuando ya no hay referencias a ellos, la JVM llama a finalize()
    public void metodo(){
        String s2 = new String("hola");
        String s3 = new String("adios");
        s2 = s3; // s2  a recolección
        s3 = null; // s3 no se elimina ya que s2 sigue apuntando a s3
    } // s3 a recolección, salimos del método
}
