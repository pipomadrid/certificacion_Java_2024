package Arrays;

public class ArrayMultiDimensiones {

    public static void main(String[] args) {
        int [][] ar; // dos dimensiones
        int [] ar1 [];
        int [][][] ar2; // tres dimensiones
        int [][]ar3 = new int[3][4];//array de 12 elementos {{1,2,3,4},{4,5,6,6},{12,34,45,7}}
        int [][][] ar4 = new int[2][3][2];//array de 12 elementos {{2,3},{4,5},{6,7}},{{8,9},{6,4},{6,7}}
        int [][][] ar5 = { {{2,3},{4,5},{6,7}},{{8,9},{6,4},{6,7}} }; //Creación abreviada
        int [][] ar6 = {{1,2,3,4},{4,5,6,6},{12,34,45,7}};
        ar3[0][0]=4;

        //Recorrer con for
        for(int i=0;i<ar6.length;i++){
            for(int k=0;k<ar6[i].length;k++){
                System.out.println(ar6[i][k]);
            }
        }
        System.out.println("ForEach");
        //Recorrer con ForEach
        for(int[] i:ar6){
            for(int k:i){
                System.out.println(k);
            }
        }


        System.out.println("ForEach 3 dimensiones");
        for(int[][] i:ar5){
            System.out.println("dimension 1");
            for(int[] k:i){
                System.out.println("dimension 2");
                for(int f:k){
                    System.out.println(f);
                }
            }
        }

        //ARRAYS IRREGULARES
        // al crear arrays las ultimas dimensiones se pueden dejar sin asignar tamaño
        int [] miarr= new int[4];
        int[][] miarr2= new int[2][];
        miarr2[0] = miarr; //A la fila 1 le estamos asignando un array de 4
        miarr2[1] = new int[6]; // a la fila 2 le estamos asignandu un array de 6
        // {{1,2,3,4},{1,2,4,5,6}}
        System.out.println(miarr2.length); // igual a 2
    }


}
