package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



		Scanner scc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		String[] usuarios = new String[5];
		usuarios[0]="pancho";
		usuarios[1]="goku";
		usuarios[2]="spiderman";
		usuarios[3]="bicho";
		usuarios[4]="sakura";

		int[] password = new int[5];
		password[0]=123;
		password[1]=1234;
		password[2]=123;
		password[3]=1234;
		password[4]=123;

		System.out.println("ingrese su usuario");
		String usuario = scc.nextLine();
		System.out.println("ingrese su contraseña");
		int pass = sc1.nextInt();

		for (int i = 0; i < 5 ; i++) {
			if (usuarios[i].equals(usuario)){
				if (password[i]==pass){
					System.out.println("acceedio");

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
								for (int j= 1; j <= n; j++) {
									factorial= factorial * j;
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

		}





    }
}
