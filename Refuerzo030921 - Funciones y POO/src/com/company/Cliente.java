package com.company;

public class Cliente {
    //Variables privadas del Objeto
    private int id;
    private int idPizza;
    private int idBebida;
    private String nombre;
    private String direccion;
    private int edad;
    private String genero;
    private int totaldeCompra;

    //Método Constructor (Genera un nuevo objeto y guarda los valores enviados)
    public Cliente(int id, int idPizza, int idBebida, String nombre, String direccion, int edad, String genero, int totaldeCompra){
        this.id = id;
        this.idPizza = idPizza;
        this.idBebida = idBebida;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
        this.totaldeCompra = totaldeCompra;
    }

    //GETTER & SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTotaldeCompra() {
        return totaldeCompra;
    }

    public void setTotaldeCompra(int totaldeCompra) {
        this.totaldeCompra = totaldeCompra;
    }


    //Método para Mostrar Datos de Factura
    public void MostrarFactura(){
        System.out.println("---FACTURA---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.direccion);

        //Llama y guarda en una variable el valor de retorno de TotalFactura()
        int totalFactura = TotalFactura();
        System.out.println("Total: Q" + totalFactura);
    }

    //Método para obtener y retornar el valor del Total de Factura
    public int TotalFactura(){
        int total = 0;
        //Recorre todos los objetos en el arreglo que está en Main
        for (int i = 0; i < Main.pizzas.length; i++) {
            //Si el objeto existe (es diferente de nulo) y su Id es igual con el IdPizza que tiene el cliente
            if(Main.pizzas[i] != null && Main.pizzas[i].getId() == this.idPizza){
                total += Main.pizzas[i].getPrecio();
            }
        }
        for (int i = 0; i < Main.bebidas.length; i++) {
            if(Main.bebidas[i] != null && Main.bebidas[i].getId() == this.idBebida){
                total += Main.bebidas[i].getPrecio();
            }
        }
        return total;
    }
}