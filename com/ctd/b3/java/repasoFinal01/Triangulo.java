package com.ctd.b3.java.repasoFinal01;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    private double area;



    @Override
    public double calcularArea() {
        area = base * altura /2.0;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo" + '\n' +
                "Base: " + base + '\n' +
                "Altura: " + altura + '\n' +
                "Area: " + area ;
    }
}
