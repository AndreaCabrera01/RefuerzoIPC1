package com.company;

public class Pizzas {
    private int id;
    private String tamaño;
    private int precio;
    private String especialidad;

    //Método Constructor (Genera un nuevo objeto y guarda los valores enviados)
    public Pizzas(int id, String tamaño, int precio, String especialidad){
        this.id = id;
        this.tamaño = tamaño;
        this.precio = precio;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void MostrarDatos(){
        System.out.println(this.id + ") Pizza de " + this.especialidad);
        System.out.println(">Tamaño: " + this.tamaño);
        System.out.println((">Precio: Q" + this.precio));
        System.out.println("");
    }
}