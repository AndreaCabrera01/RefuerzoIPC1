package com.company;

public class Main {

    public static Pizzas[] pizzas = new Pizzas[5];

    public static void main(String[] args) {

        //------------ ORDENAMIENTO PARA ARREGLOS ESTÁTICOS ---------------
        int[] arreglo = {20,47,90,62,38,5,41};

        System.out.println("----ARREGLO ORIGINAL-----");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("|" + arreglo[i] + "|");
        }

        int[] arrayOrdenado1 = BurbujaAsc(arreglo);
        System.out.println("\n----ARREGLO ORDENADO Asc-----");
        for (int i = 0; i < arrayOrdenado1.length; i++) {
            System.out.print("|" + arrayOrdenado1[i] + "|");
        }

        int[] arrayOrdenado2 = BurbujaDesc(arreglo);
        System.out.println("\n----ARREGLO ORDENADO Desc-----");
        for (int i = 0; i < arrayOrdenado2.length; i++) {
            System.out.print("|" + arrayOrdenado2[i] + "|");
        }

        //------------ ------------------------------------- ---------------


        //------------ ORDENAMIENTO PARA UN ARREGLO DE OBJETOS ---------------
        pizzas[0] = new Pizzas(1, "grande", 90, "hawaianna");
        pizzas[1] = new Pizzas(2, "mediana", 65, "jamón");
        pizzas[2] = new Pizzas(3, "grande", 50, "peperonni");
        pizzas[3] = new Pizzas(4, "mediana", 120, "carne");
        pizzas[4] = new Pizzas(5, "mediana", 185, "queso");

        System.out.println("\n-----PIZZAS------");
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].MostrarDatos();
        }

        Pizzas[] pizzasOrdenado = BurbujaPizzaAsc(pizzas);
        System.out.println("\n-----PIZZAS MÁS ECONÓMICAS------");
        for (int i = 0; i < pizzasOrdenado.length; i++) {
            pizzasOrdenado[i].MostrarDatos();
        }

        //------------ ------------------------------------- ---------------

    }

    // ------------ BUBBLE SORT PARA OBJETOS (de tipo Pizza) ----------------
    static Pizzas[] BurbujaPizzaAsc(Pizzas[] arr){
        int n = arr.length;
        Pizzas temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].getPrecio() > arr[j].getPrecio()) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    //------------ ------------------------------------- ---------------


    //------------ ORDENAMIENTO BUBBLESORT ASCENDENTE ---------------
    static int[] BurbujaAsc(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    //------------ ORDENAMIENTO BUBBLESORT DESCENDENTE ---------------
    static int[] BurbujaDesc(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) { //Solo se realiza el cambio de signo
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
