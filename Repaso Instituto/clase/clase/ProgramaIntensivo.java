package com.camada2.clase22.clase;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentajeBonif;
    private List<OfertaAcademica> ofertaAcademicas = new ArrayList<>();

    public double getPorcentajeBonif() {
        return porcentajeBonif;
    }

    public void setPorcentajeBonif(double porcentajeBonif) {
        this.porcentajeBonif = porcentajeBonif;
    }

    public List<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public void setOfertaAcademicas(List<OfertaAcademica> ofertaAcademicas) {
        this.ofertaAcademicas = ofertaAcademicas;
    }


    @Override
    public double calcularPrecio() {
        double total = 0;
        for(OfertaAcademica o : ofertaAcademicas){
            total += o.calcularPrecio();
        }
        return total - (total*porcentajeBonif);
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Precio: " + calcularPrecio();
    }
}
