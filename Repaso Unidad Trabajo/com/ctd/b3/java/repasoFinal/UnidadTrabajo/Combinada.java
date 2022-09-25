package com.ctd.b3.java.repasoFinal.UnidadTrabajo;

import java.util.ArrayList;

public class Combinada extends UnidadTrabajo{
    private double coeficienteGlobal;
    private double montoMaterial;
    private ArrayList<UnidadTrabajo> listaUnidadTrabajo = new ArrayList<>();

    public void agregarUnidadTrabajo(UnidadTrabajo ut){
        listaUnidadTrabajo.add(ut);

    }
    public void removerUnidadTrabajo(UnidadTrabajo ut) throws Exception{
        if (!(listaUnidadTrabajo.contains(ut))){
            throw new Exception("No se encuentra la unidad de trabajo a remover dentro de la lista");
        }
        listaUnidadTrabajo.remove(ut);
    }


    @Override
    public double calcularMonto() {
        double monto = 0;
        for (UnidadTrabajo ut: listaUnidadTrabajo
             ) {
            monto += ut.calcularMonto();
        }
        monto = monto * coeficienteGlobal;
        return monto;
    }
}
