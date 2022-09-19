package com.ctd.b3.java.repasoFinal01;

public class Circulo implements Figura {
    private double radio;
    private double area;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio,2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo " + '\n' +
                "Radio: " + radio + '\n' +
                "Area: " + area ;
    }
}
