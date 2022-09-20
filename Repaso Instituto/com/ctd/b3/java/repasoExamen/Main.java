package com.ctd.b3.java.repasoExamen;

public class Main {
    public static void main(String[] args) {
        OfertaAcademicaFactory oaf = OfertaAcademicaFactory.getInstancia();
        Curso fe = (Curso) oaf.crearOfertaAcademica("Curso");
        fe.setNombre("Front End");
        fe.setCargaHorarioMensual(16.);
        fe.setCantMesesDuracion(2.);
        fe.setValorHora(1000);

        Curso be = (Curso) oaf.crearOfertaAcademica("Curso");
        be.setNombre("Back End");
        be.setCargaHorarioMensual(20.);
        be.setCantMesesDuracion(2.);
        be.setValorHora(1800);

        ProgramaIntensivo fs = (ProgramaIntensivo) oaf.crearOfertaAcademica("Programa Intensivo");
        fs.setNombre("Full Stack");
        fs.setPorcentajeBonificacion(20);
        fs.agregarOfertaAcademica(fe);
        fs.agregarOfertaAcademica(be);

        System.out.println(fe.toString());
        System.out.println("----------------------");
        System.out.println(be.toString());
        System.out.println("----------------------");
        System.out.println(fs.toString());
        System.out.println("----------------------");

        Instituto martin = new Instituto("Martin");

        martin.getListaOfertasAcademicas().add(fe);
        martin.getListaOfertasAcademicas().add(fe);
        martin.getListaOfertasAcademicas().add(fe);
        martin.getListaOfertasAcademicas().add(fe);
        martin.getListaOfertasAcademicas().add(be);
        martin.getListaOfertasAcademicas().add(fs);
        martin.generarInforme();

    }



}
