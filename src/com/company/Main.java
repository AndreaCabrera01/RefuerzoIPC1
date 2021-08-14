package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Inicialización de variables
        String MiNombre = "Andrea";
	    int edad = 20;
	    double dinero = 125.95;
	    boolean estado = true;
	    String mascota = "Perro";

	    //Operaciones
		int x, y, suma;
		x=5;
		y=9;


		suma = x+y;
		int numero1, numero2, resultado;
		int numero3;
		System.out.println("Hola mi nombre es: " + MiNombre + " y tengo " + edad + " años");

		//Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el primer número: ");
		numero1 = entrada.nextInt();
		System.out.println("Ingrese el segundo número: ");
		numero3 = entrada.nextInt();

		resultado = numero1 + numero3;
		System.out.println("El resultado de la suma del número: " + numero1 + " y el número: " + numero3 + " es: " +resultado);








    }
}
