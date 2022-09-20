package com.camada2.clase22.clase;

public class Curso extends OfertaAcademica{
    private double cargaHorariaMensual;
    private double meses;
    private double valorHora;

    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return meses*cargaHorariaMensual*valorHora;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Duracion: " + meses + "\n" +
                "Precio: " + calcularPrecio();
    }
}
