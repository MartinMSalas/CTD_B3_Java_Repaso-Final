package com.camada2.clase19.clase;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("Camada 2 S.A.");

        try{
            emp.mostrarEmpleados();
        } catch (NullPointerException e){
            System.err.println(e);
        }
    }
}
