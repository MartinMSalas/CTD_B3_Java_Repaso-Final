package com.ctd.b3.java.repasoFinal01;

public class Main {

    public static void main(String[] args) {
        Factory instanciaFactory = Factory.getInstancia();
        Figura circulo1 = instanciaFactory.crearFigura("Circulo 1");
        Figura rectangulo5x4 = instanciaFactory.crearFigura("Rectangulo 5 x 4");
        Figura vagon = instanciaFactory.crearFigura("Figura Compuesta");

        ((FiguraCompuesta) vagon).agregarFigura(circulo1);
        ((FiguraCompuesta) vagon).agregarFigura(circulo1);
        ((FiguraCompuesta) vagon).agregarFigura(circulo1);
        ((FiguraCompuesta) vagon).agregarFigura(rectangulo5x4);

        System.out.println(vagon.toString());
        System.out.println(circulo1.calcularArea());

    }
}
