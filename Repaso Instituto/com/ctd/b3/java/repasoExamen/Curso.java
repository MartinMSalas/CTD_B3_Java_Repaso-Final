package com.ctd.b3.java.repasoExamen;

public class Curso extends OfertaAcademica{
    private double cargaHorarioMensual;
    private double cantMesesDuracion;
    private double valorHora;

    public double getCargaHorarioMensual() {
        return cargaHorarioMensual;
    }

    public void setCargaHorarioMensual(double cargaHorarioMensual) {
        this.cargaHorarioMensual = cargaHorarioMensual;
    }

    public double getCantMesesDuracion() {
        return cantMesesDuracion;
    }

    public void setCantMesesDuracion(double cantMesesDuracion) {
        this.cantMesesDuracion = cantMesesDuracion;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularPrecio(){
        return valorHora * cargaHorarioMensual * cantMesesDuracion;
    }

    @Override
    public String toString() {
        return "Curso " + '\n' +
                "Duracion " + cantMesesDuracion + " meses" + '\n' +
                "Precio Curso " + calcularPrecio() ;
    }
}
