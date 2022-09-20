package com.ctd.b3.java.repasoExamen;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> listaOfertasAcademicas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        listaOfertasAcademicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<OfertaAcademica> getListaOfertasAcademicas() {
        return listaOfertasAcademicas;
    }

    public void setListaOfertasAcademicas(ArrayList<OfertaAcademica> listaOfertasAcademicas) {
        this.listaOfertasAcademicas = listaOfertasAcademicas;
    }

    public void generarInforme(){
        double monto = 0;
        String informe = "Lista de cursos ofrecidos " + '\n' ;
        for (OfertaAcademica oa: listaOfertasAcademicas
             ) {
            informe += oa.toString() + '\n' ;
            monto += oa.calcularPrecio();
        }
        System.out.println(informe);
        System.out.println("El precio total q recibimos por todos los cursos dictados es: $"+monto);
    }
}
