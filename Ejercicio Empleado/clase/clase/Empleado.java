package com.camada2.clase19.clase;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;

    public Empleado(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo(int dias);

    @Override
    public String toString(){
        return "Empleado: " + nombre + " " + apellido + "\nLegajo: " + legajo;
    }
}
