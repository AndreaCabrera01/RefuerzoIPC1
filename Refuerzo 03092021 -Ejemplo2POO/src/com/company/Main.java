package com.company;

public class Main {

    public static void main(String[] args) {
	//Crear el objeto:

        Trabajador trabajador = new Trabajador(24, "Pablo", "Masculino", 12345, "Vendedor");
        Trabajador trabajador2 = new Trabajador(28, "María", "Femenino", 65478, "Jefe");
        Trabajador trabajador3 = new Trabajador(25, "Raquel", "Femenino", 87656, "Cajera");

        trabajador.Imprimir();
        trabajador2.Imprimir();
        trabajador3.Imprimir();

        //Polimorfismo
        //Objeto padre -->    Animales
        //          Perros      Gatos      Peces
    }
}
