package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Inicialización de variables
        String MiNombre = "Andrea";
	    int edad = 15;
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


		//Scanner
		Scanner entrada = new Scanner(System.in);


		int opcion = 0;

		do{
			//Desplegar menú
			System.out.println("MENÚ\n" +
					"1. Suma\n" +
					"2. Desplegar datos del usuario\n" +
					"3. Ejemplo con IF\n" +
					"4. Factorial\n"+
					"5. Salir");
			System.out.println("Ingrese la opción que desea realizar:");
			opcion = entrada.nextInt();


			//Estructura Switch
			switch(opcion){
				case 1:
					System.out.println("Ingrese el primer número: ");
					numero1 = entrada.nextInt();
					System.out.println("Ingrese el segundo número: ");
					numero3 = entrada.nextInt();

					resultado = numero1 + numero3;
					System.out.println("El resultado de la suma del número: " + numero1 + " y el número: " + numero3 + " es: " +resultado);
					break;
				case 2:
					System.out.println("Hola mi nombre es: " + MiNombre + " y tengo " + edad + " años");
					break;
				case 3:
					if(edad >= 18){
						System.out.println("Es mayor de edad.");
					}else{
						System.out.println("Es menor de edad.");
					}
					break;
				case 4:
					// 4! = 1 * 2 * 3 * = 6
					int n, factorial = 1;
					System.out.println("Ingrese el valor del cual quiere realizar su factorial:");
					n = entrada.nextInt();
					for (int i = 1; i <= n; i++) {
						factorial= factorial * i;
					}
					System.out.println("El resultado de "+ n + "! es: "+ factorial);
					break;
				case 5:
					System.out.println("Adiós!");
					break;
				default:
					System.out.println("Ha ingresado una opción incorrecta");
					break;
			}





		}while(opcion != 5);





    }
}
