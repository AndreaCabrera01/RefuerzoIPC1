package com.company;

public class Trabajador extends Persona{
    private int codigo;
    private String puesto;

    public Trabajador(int edad, String nombre, String sexo, int codigo, String puesto){
        super(edad, nombre, sexo);
        this.codigo = codigo;
        this.puesto = puesto;
    }

    public void Imprimir(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("edad: " + getEdad());
        System.out.println("sexo: " + getSexo());
        System.out.println("Código de trabajador: " + codigo);
        System.out.println("Puesto: " + puesto +"\n");
    }

}
