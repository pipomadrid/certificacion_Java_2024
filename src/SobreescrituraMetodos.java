public class SobreescrituraMetodos {
    String b = "método clase 1";
    public void imprimir(String str){
        System.out.println(str);
    }
    public Object test(){
       return "hola";
    }
}
class SobreescrituraMetodos2 extends SobreescrituraMetodos {
    @Override
    public void imprimir(String str){ // el nombre y lista de parámetros debe ser igual
        System.out.println("hola" + str);
    }
    /*@Override
    public  imprimir(){ // error no devuelve el mismo tipo o subtipo
        System.out.println("método sobreecrito clase2");
    }
*/
    @Override
    public String test(){ //Devuelve subtipo de Object
        return "adios";
    }

}