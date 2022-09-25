package com.ctd.b3.java.repasoFinal.UnidadTrabajo;

public class UnidadTrabajoFactory {
    private static UnidadTrabajoFactory instancia;

    private UnidadTrabajoFactory(){

    }
    public static UnidadTrabajoFactory getInstance() {
        if (instancia==null){
            instancia = new UnidadTrabajoFactory();
        }
        return instancia;
    }

    public UnidadTrabajo crearUnidadTrabajo(String tipo){
        UnidadTrabajo ut;
        switch (tipo){
            case "Simple":
                ut = new Simple();
                break;
            case "Combinada":
                ut = new Combinada();
                break;
            default:
                ut = null;
        }
        return ut;
    }
}
