package com.company.clase23.practica;

import com.company.clase23.clase.OfertaAcademica;

public abstract class UnidadTrabajo {
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double calcularMonto();

    public String mostrar(){
        return
                "Nombre: " + nombre + "\n" +
                "Descripcion: " + descripcion;

    };
}
