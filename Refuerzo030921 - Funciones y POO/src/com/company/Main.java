package com.company;

public class Main {

    //Arreglos de Objetos Públicos para poder acceder a ellos desde cualquier clase
    public static Cliente[] clientes = new Cliente[5];
    public static Bebida[] bebidas = new Bebida[5];
    public static Pizza[] pizzas = new Pizza[5];

    public static void main(String[] args) {
        //Instanciar un nuevo objeto y guardarlo en el arreglo de objetos
        clientes[0] = new Cliente(1, 2, 3, "Jose", "zona1", 19, "M",0);
        clientes[2] = new Cliente(2, 4, 1, "Felipe", "zona1", 19, "M",0);


        pizzas[0] = new Pizza(2, "grande", 90, "hawaianna");
        pizzas[1] = new Pizza(4, "mediana", 65, "jamón");


        bebidas[0] = new Bebida(3,"mediana", 15, "pepsi");
        bebidas[1] = new Bebida(1,"pequeña", 8, "agua");

        //Llamar a los métodos dentro de cada objeto
        pizzas[0].MostrarDatos();
        clientes[0].MostrarFactura();

    }
}
