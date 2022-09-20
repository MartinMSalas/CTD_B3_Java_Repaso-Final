package com.camada2.clase22.clase;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;

    private OfertaAcademicaFactory(){
    }

    public static OfertaAcademicaFactory getInstancia(){
        if(instancia==null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }
    // hasta aqui llego el Singleton

    // desde aqui la Factory
    public OfertaAcademica crearOfertaAcademica(String tipo) throws RuntimeException{
        switch (tipo){
            case "Curso":
                return new Curso();
            case "Programa":
                return new ProgramaIntensivo();
            default:
                throw new RuntimeException("Por el momento no contamos con ese tipo de oferta academica");
        }
    }

}
