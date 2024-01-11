public class ReferenciaObjetos {
    public void test(){
        System.out.println("test1");
    }

    public static void main(String[] args) {
        ReferenciaObjetos obj = new ReferenciaObjetos3();
        obj.test();//Sólo puedo llamar a métodos que compartan ambas clases
        //obj.test3();  //Error de compilación, obj se comporta como ReferenciaObjetos y no tiene este método
        //obj.test2();  //Error de compilación
        ReferenciaObjetos3 obj3 = (ReferenciaObjetos3)obj; // obtenemos un  referencia al tipo original
        obj3.test3(); // ya podemos usar el método test3 ya que ahora se comporta como ReferenciaObjetos3
        obj3.test(); // Podemos llamar tb a los métodos de las superclases
        obj3.test2();

        ReferenciaObjetos2 obj2 = new ReferenciaObjetos2();

        //No se puede asignar una referencia de un tipo a una subclase
        //ReferenciaObjetos3 obj4 = (ReferenciaObjetos3)obj2; // Dará error de ejecución ClassCastException

    }
}
class ReferenciaObjetos2 extends ReferenciaObjetos{
    public void test2(){
        System.out.println("test2");
    }
}
class ReferenciaObjetos3 extends ReferenciaObjetos2{
    public void test3(){
        System.out.println("test3");
    }
}