package com.company.clase23.practica;

public class UnidadFactory {
    private static UnidadFactory instancia;
    private UnidadFactory(){

    }

    public static UnidadFactory getInstancia(){
        if(instancia==null){
            instancia = new UnidadFactory();
        }
        return instancia;
    }

    public UnidadTrabajo crearUnidad(String tipo)throws Exception{
        switch (tipo){
            case "Simple":
                return new Simple();
            case "Combinada":
                return new Combinada();
            default:
                throw new RuntimeException("Se desconoce ese tipo de unidad de trabajo");
        }
    }
}
