package InstruccionesBasicas;



public class ForAndWhile {


    public static void main(String[] args) {
        //FOR
        int i = 1;
        for(;i<10;){ // las tres instrucciones de control son opcionales
            System.out.print(i +",");
            i++;
        }
        System.out.println("For con dos sentencias");
        for(int a =0 ,b = 10; a<b; a++,b--){ // mas de una sentencia separadas por comas
            System.out.println(a);
            System.out.println(b);

        }
        //ENCHANCED FOR
        System.out.println("Enchanced For");
        int [] ar1 = {0,1,2,3,4,5,6,7,8,9};//  no es un indice,se usa para lectura
        for(int b : ar1){
            System.out.println(b);
        }
        //WHILE
        System.out.println("While");
        int e= 6;
        int d= 8;
        while(e<8){
            System.out.println(e + " " + d );
            e++;
        }

        //DO WHILE
        System.out.println("Do while");
        int f = 1;
        do{
            System.out.println(f);
            f++;
        }while(f<5);

        //BREAK
        System.out.println("Break");
        for(int g = 0; g<5; g++){
            if(g == 4) break;
            System.out.println(g);
        }
        //CONTINUE
        System.out.println("Continue");
        for(int h = 0; h<=5; h++){
            if(h == 4) continue;
            System.out.println(h);
        }

        //BUCLES ETIQUETADOS
        externo:for(int j=5;j<10;j++){
            System.out.println("j= "+ j);
            for(int k = 0;k<5;k++){
                System.out.println("k= "+ k );
                if(k==1)break externo; // sale del bucle externo, si no se indica nada sale del interno
            }
        }
    }
}
