package com.ctd.b3.java.repasoFinal.UnidadTrabajo;

public class Simple extends UnidadTrabajo{
    private double montoPorPersona;
    private int cantPersonas;

    public double calcularMonto(){
        double resultado = 0;
        if (cantPersonas>10)
            resultado = montoPorPersona * cantPersonas * 1.2;
        else
            resultado = montoPorPersona * cantPersonas;
        return resultado;

    }

    @Override
    public String toString() {
        return "Simple{" +
                "montoPorPersona=" + montoPorPersona +
                ", cantPersonas=" + cantPersonas +
                '}';
    }
}
