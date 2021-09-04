package com.company;

public class Persona {
    private int edad;
    private String nombre;
    private String sexo;
    
    public Persona(int edad, String nombre, String sexo){
        this.edad = edad;
        this.nombre = nombre;
        this.sexo=sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
