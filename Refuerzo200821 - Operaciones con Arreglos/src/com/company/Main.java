package com.company;

public class Main {

    public static void main(String[] args) {

        int[] vector1 = {2,3,4,5,8}; //[5]
        int[] vector2 = {5,8,9,10,7};
        int[] vector3 = {7,10,14,1,0,13};
        int[] vectorResultante = new int[5];

        if(vector1.length == vector2.length){
        for (int i = 0; i < vector1.length; i++) {
            vectorResultante[i] = vector1[i] * vector2[i];
        }
            for (int i = 0; i < vector1.length; i++) {
                System.out.print("| " + vectorResultante[i] + " |" + "\n");
            }
        }else{
            System.out.println("Ha ingresado arreglos de dimensiones distintas");
        }


        int[][] matriz1 ={{2,7,9},{6,20,3},{7,10,5}};

        /*         C0   C1
           F0 ->  | 1 | 2 |
           F1     | 3 | 4 |
           F2     | 5 | 6 |
         */

        int[][] matrizResultado = new int[3][3];
        int n = 5;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[1].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] * n;
            }
        }

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[1].length; j++) { //length = 3 - 1
                if(j == matrizResultado[1].length - 1){
                    System.out.print("| " + matrizResultado[i][j] + " |");
                }else{
                    System.out.print("| " + matrizResultado[i][j]+ " ");
                }
            }
            System.out.println("");
        }



    }
}
