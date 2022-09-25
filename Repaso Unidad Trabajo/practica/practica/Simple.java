package com.company.clase23.practica;

public class Simple extends UnidadTrabajo{
    private int cantidadPersonas;
    private double montoPorPersona;


    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    @Override
    public double calcularMonto() {
        if(cantidadPersonas>20){
            return montoPorPersona*cantidadPersonas*1.2;
        }
        return montoPorPersona*cantidadPersonas;
    }

    @Override
    public String mostrar() {

        return  "\n" + super.mostrar()  + "\n\tCosto  --->  " + calcularMonto() + "\n\n" ;
    }

}
