package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// DECLARACIÓN DE MATRIZ
        //TIPODEDATO[][] NOMBRE = new TIPODEDATO[n][m];

        //TIPODEDATO[][] nombre;
        //nombre = nre TIPODEDATO[n][m];

        //Matriz de cadenas (Strings)

        //int fila = 4;
        //int columna = 3;
        String[][] Nombres = new String[4][3];

        /*

	    COL 0	COL1	COL2
	    ------------------------
FILA 0	|	    |	    |	    |
	    -------------------------
FILA 1	|	    |	    |	    |
	    -------------------------
FILA 2	|	    |	    |	    |
	    -------------------------
FILA 3	|	    |	    |	    |
	    -------------------------

         */

        //Llenado de Matriz:
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matriz2 = new int[4][3];
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        /*

Ejemplo de cómo quedaría la matriz
	    COL 0	COL1	COL2
	    ------------------------
FILA 0	|	 1  |	2   |	3   |
	    -------------------------
FILA 1	|	4   |	5   |	6   |
	    -------------------------
FILA 2	|	 7  |	8   |	9   |
	    -------------------------
FILA 3	|	10   |	11   |	12  |
	    -------------------------

         */

        //Numero de filas y/o columnas de una matriz
        int nFilas = matriz.length;
        int nColumnas = matriz[0].length;


        // Llenado de matriz por bucle anidado - for

        Scanner sc = new Scanner(System.in);
        int[][] matriz3 = new int[3][4];

        for(int i=0; i < matriz3.length; i++){
            for (int j=0; j<matriz3[0].length; j++){
                System.out.println("Ingrese el número en la posición ["+i+","+j+"]");
                matriz3[i][j] = sc.nextInt();
            }
        }

        //Para que se imprima una matriz
        for(int i=0; i < matriz3.length; i++){
            System.out.print("|");
            for (int j=0; j<matriz3[0].length; j++){
                System.out.print(matriz3[i][j]);
                if(j!= matriz3[i].length-1)
                    System.out.println("\n");
            }
        }
    }
}
