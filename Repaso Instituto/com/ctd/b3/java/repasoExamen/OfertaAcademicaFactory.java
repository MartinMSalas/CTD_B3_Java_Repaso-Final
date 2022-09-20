package com.ctd.b3.java.repasoExamen;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;

    private OfertaAcademicaFactory(){

    };
    public static OfertaAcademicaFactory getInstancia(){
        if (instancia == null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo){
        OfertaAcademica oa;
        switch (tipo){
            case "Curso" :
                oa = new Curso();
                break;
            case "Programa Intensivo" :
                oa = new ProgramaIntensivo();
                break;
            default:
                oa = null;
        }

        return oa;
    }
}
