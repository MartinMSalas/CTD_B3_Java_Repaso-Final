package com.ctd.b3.java.repasoFinal01;

public class Rectangulo implements Figura{
    private double alto;
    private double largo;
    private double area;



    @Override
    public double calcularArea() {
        area = alto * largo;
        return area;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo" + '\n' +
                "Alto: " + alto + '\n' +
                "Largo=" + largo + '\n' +
                "Area=" + area ;
    }
}
