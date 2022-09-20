package com.ctd.b3.java.repasoExamen;

import java.util.ArrayList;
import java.util.Objects;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentajeBonificacion;
    private ArrayList<OfertaAcademica> listaOfertaAcademica = new ArrayList<>();

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public ArrayList<OfertaAcademica> getListaOfertaAcademica() {
        return listaOfertaAcademica;
    }


    public void agregarOfertaAcademica(OfertaAcademica oa){
        // lo agregamos aca solo para tener mas control sobre las ofertas academicas q se pueden agregar

        if(! listaOfertaAcademica.contains(oa))
            listaOfertaAcademica.add(oa);
        else
            System.out.println("Esa oferta academica ya esta agregada a este programa");
    }
    public void removerOfertaAcademica(OfertaAcademica oa) {
        // lo agregamos aca solo para tener mas control sobre las ofertas academicas q se pueden remover
        if (listaOfertaAcademica.contains(oa)){
            listaOfertaAcademica.remove(oa);
        }else
            System.out.println("Esa OfertaAcademica no esta en la lista de este programa Intensivo");
    }

    @Override
    public double calcularPrecio() {
        double precio = 0;
        for (OfertaAcademica oa:listaOfertaAcademica
             ) {
            precio += oa.calcularPrecio();
        }
        return precio * (100 - porcentajeBonificacion)/100;
    }

    @Override
    public String toString() {
        String info = "";
        for (OfertaAcademica oa: listaOfertaAcademica
             ) {
            info = info + (oa.getNombre() + "    $" +oa.calcularPrecio() + '\n') ;

        }
        return "ProgramaIntensivo" + '\n' +
                "PorcentajeBonificacion=" + porcentajeBonificacion + '\n' +
                "Contenido " + '\n' +
                info + '\n' +
                "Costo total: " + calcularPrecio();
    }
}
