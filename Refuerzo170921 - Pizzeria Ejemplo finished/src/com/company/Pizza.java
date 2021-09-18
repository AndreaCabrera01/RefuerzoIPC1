package com.company;

import java.io.Serializable;

public class Pizza implements Serializable {
    //Variables privadas del Objeto
    private int id;
    private String tamaño;
    private int precio;
    private String especialidad;

    //Método Constructor (Genera un nuevo objeto y guarda los valores enviados)
    public Pizza(int id, String tamaño, int precio, String especialidad){
        this.id = id;
        this.tamaño = tamaño;
        this.precio = precio;
        this.especialidad = especialidad;
    }

    //GETTER & SETTER
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


    //Método para Mostrar los Datos de la Pizza
    /*
    id) Pizza de Especialidad
    -Tamaño
    -Q0.00
     */

    public void MostrarDatos(){
        System.out.println(this.id + ") Pizza de " + this.especialidad);
        System.out.println(">Tamaño: " + this.tamaño);
        System.out.println((">Precio: Q" + this.precio));
    }
}