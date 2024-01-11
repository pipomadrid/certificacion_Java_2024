package Excepciones;

public class CapturaExcepciones {

    //Se capturan a través de TRY -CATCH
    /*try{
        	  //instrucciones
        	}
      catch(TipoExcepción1 ex){
        	 // tratamiento excepción,
        	}
      catch(TipoExcepción1 ex){
        	 // tratamiento excepción
        }*/

    //No puede haber instrucciones entre el Try Catch
    //Si se capturan varios tipos de excepciones que tienen relación de herencia los catch de la subclase
    // deben ir antes de los de la superclase
    /*  catch(FileNotFoundException ex){
	        tratamiento excepción
	    }
	    catch(IOException ex){
	        tratamiento excepción
	    }
	 */
    //MULTICATCH
    /*	catch(FileNotFoundException|SQLException ex){
	          System.out.println(“Error”);
	}
        /*
     //METODOS DE EXCEPCIÓN
      /*
      String getMessage()  devuelve cadena con el mensaje de error
      void printStackTrace()  genera volcado de error que se envia a consola
     */

    //BLOQUE FINALLY
    //Se ejecuta siempre, tanto si hay excepción como si no
    //Normalmente se usa para cerrar recursos







}
