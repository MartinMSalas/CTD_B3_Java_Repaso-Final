package com.company.clase23.practica;

public class Main {
    public static void main(String[] args) {
        try{
            UnidadTrabajo simple1 = UnidadFactory.getInstancia().crearUnidad("Simple");
            simple1.setNombre("Mantenimiento");
            ((Simple)simple1).setCantidadPersonas(4);
            simple1.setDescripcion("Mantenimiento edilicio");
            ((Simple)simple1).setMontoPorPersona(120000);

            UnidadTrabajo simple2 = UnidadFactory.getInstancia().crearUnidad("Simple");
            simple2.setNombre("Limpieza");
            ((Simple)simple2).setCantidadPersonas(24);
            simple2.setDescripcion("Servicios de limpieza integral");
            ((Simple)simple2).setMontoPorPersona(100000);

            UnidadTrabajo comb = UnidadFactory.getInstancia().crearUnidad("Combinada");
            comb.setNombre("Servicios Generales");
            ((Combinada)comb).setCoeficienteGlobal(3);
            ((Combinada)comb).agregarUnidad(simple1);
            ((Combinada)comb).agregarUnidad(simple2);
            System.out.println(((Combinada)comb).mostrar());
            System.out.println("Monto total: $" + comb.calcularMonto());


        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
