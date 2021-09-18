package com.company;

import java.io.Serializable;

public class Bebida implements Serializable {
    //Variables privadas del Objeto
    private int id;
    private String tamaño;
    private int precio;
    private String sabor;

    //Método Constructor (Genera un nuevo objeto y guarda los valores enviados)
    public Bebida(int id, String tamaño, int precio, String sabor){
        this.id = id;
        this.tamaño = tamaño;
        this.precio = precio;
        this.sabor = sabor;

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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
