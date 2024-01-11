package Arrays;

public class ArraysUnaDim {

    int [] miArr; // al ser atributo se inicia a null
    int miArr2 [];
    int [] miArr3 = new int[12]; //declaración,instanciación
    int [] valores = new int[] {3, 5, 20, 11}; // declaración,instanciación e inicialización
    int [] valores2 = {2,3,4,5,6}; // forma abreviada

    public static void main(String[] args) {
        ArraysUnaDim obj = new ArraysUnaDim();
        obj.miArr = new int[15];
        obj.miArr[0]= 3;
        obj.miArr[14]= 6;
        // obj.miArr[15]= 8; //No hay posición 15
        System.out.println(obj.miArr[0]);
        System.out.println(obj.miArr[14]);
        //System.out.println(obj.miArr[15]); //Error
        System.out.println(obj.miArr.length); // la última posición es length-1

        for(int i = 0;i<obj.valores.length;i++){
            System.out.println(obj.valores[i]);
        }
        for(int i:obj.valores2){
            System.out.println(i);
        }

    }

}
