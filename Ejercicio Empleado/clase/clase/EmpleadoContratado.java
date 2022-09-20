package com.camada2.clase19.clase;

public class EmpleadoContratado extends Empleado{
    private double valorHora;
    private double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, int legajo, double valorHora, double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.valorHora = valorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias){
        double sueldoBruto = (valorHora)*8*dias;
        return sueldoBruto - (sueldoBruto*retencionImpuesto);
    }
}
