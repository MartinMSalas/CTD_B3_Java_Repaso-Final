package com.camada2.clase19.clase;

public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo, double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias){
        return (sueldoMensual/30)*dias;
    }
}
