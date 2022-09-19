package com.ctd.b3.java.repasoFinal01;

import java.util.ArrayList;

public class FiguraCompuesta implements Figura{
    private String nombre;
    private double area;
    private ArrayList<Figura> listaFiguras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura){
        listaFiguras.add(figura);
    }

    @Override
    public String toString() {
        String listaString ="";
        for (Figura figura: listaFiguras
             ) {
            listaString += figura.toString() + '\n';
        }
        String respuesta = "FiguraCompuesta" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Area: " + area + '\n' +
                "ListaFiguras " + '\n' +

                "Contenido: " + listaFiguras.size() + " figuras" + '\n' +
                "----------------" + '\n' +
                listaString;
        return respuesta;
    }

    @Override
    public double calcularArea() {
        area = 0;
        for (Figura figura:listaFiguras
             ) {
            area += figura.calcularArea();
        }
        return area;
    }

}
