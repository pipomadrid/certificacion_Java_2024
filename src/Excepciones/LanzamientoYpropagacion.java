package Excepciones;

public class LanzamientoYpropagacion {

    public static void main(String[] args) {


        //PROPAGACIÓN

        //Si un método que debe capturar una excepción no desea hacerlo la puede propagar al lugar
        //de la llamada al método
        //Se usa la instrucción throws

       /*
       metodo(){
         BufferefReader bf = new….;
	        try{
	             //readline puede provocar IOException
	             String s = bf.readLine();
	         }
	        catch( IOException){

	        }
       }
       metodo() throws IOException{
	          BufferefReader bf = new….;
	          // si se produce la excepción se propaga al punto de llamada método()
	          // donde habrá que capturarla
	          String s = bf.readLine();
	    }
*/
        //LANZAMIENTO
        //Desde un método podemos lanzar una excepción para que sea capturada en el punto de llamada
        //Si la excepción es checked el compilador obliga a declarlarla en la cabecera del método si es Unchecked no
        /*public void setEdad(int edad) {
            if (edad <= 0)
                 throw new RuntimeException("La edad debe ser positiva");
             this.edad = edad;
           }

          public void setEdad(int edad) throws Exception {
	         if (edad <= 0)
	             throw new Exception("La edad debe ser positiva.");
	         this.edad = edad;
	       }
        */




    }
}
