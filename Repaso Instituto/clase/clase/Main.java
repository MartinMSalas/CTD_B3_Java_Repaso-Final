package com.camada2.clase22.clase;

public class Main {
    public static void main(String[] args) {
        //OfertaAcademica fe = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
        Curso fe = (Curso)OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
        fe.setNombre("Front End");
        fe.setDescripcion("Curso de FE");
        fe.setMeses(2);
        fe.setCargaHorariaMensual(16);
        fe.setValorHora(1000);
        
        OfertaAcademica be = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
        be.setNombre("Back End");
        be.setDescripcion("Curso de BE");
        ((Curso)be).setMeses(2);
        ((Curso)be).setCargaHorariaMensual(20);
        ((Curso)be).setValorHora(900);

        ProgramaIntensivo ci = (ProgramaIntensivo) OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Programa");
        ci.setNombre("Fullstack");
        ci.setDescripcion("Programa fullstack");
        ci.setPorcentajeBonif(0.20);
        ci.getOfertaAcademicas().add(fe);
        ci.getOfertaAcademicas().add(be);

        Instituto c2 = new Instituto("Camada 2 Coding School");
        c2.getOfertaAcademicas().add(fe);
        c2.getOfertaAcademicas().add(be);
        c2.getOfertaAcademicas().add(ci);
        c2.generarInforme();

    }
}
