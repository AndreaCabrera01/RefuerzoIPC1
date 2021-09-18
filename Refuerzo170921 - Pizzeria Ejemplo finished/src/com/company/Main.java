package com.company;


public class Main{

    public static Cliente[] clientes = new Cliente[5];
    public static Bebida[] bebidas = new Bebida[5];
    public static Pizza[] pizzas = new Pizza[5];



    public static void main(String[] args) {


        clientes = (Cliente[]) Archivos.deserialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\Clientes.bin");
        pizzas = (Pizza[]) Archivos.deserialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\PIZZAS.bin");
        bebidas = (Bebida[]) Archivos.deserialize("C:\\Users\\usuario\\Downloads\\EjemploJson\\Bebidas.bin");

        InterfazGrafica ventana = new InterfazGrafica();
        ventana.setVisible(true);

    }

}