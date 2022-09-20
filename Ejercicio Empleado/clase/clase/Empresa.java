package com.camada2.clase19.clase;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public void mostrarEmpleados() throws NullPointerException{
        if (empleados.isEmpty()){
            throw new NullPointerException("No hay empleados aun en la nomina");
        }
        for (Empleado e : empleados){
            System.out.println(e);
        }
    }
    public double calcularTotalSueldos(int dias) throws NullPointerException{
        double total = 0;
        if(empleados.isEmpty()) throw new NullPointerException("No hay empleados aun en la nomina");
        for (Empleado e : empleados){
            total += e.calcularSueldo(dias);
            System.out.println(e + "\nSueldo: $" + e.calcularSueldo(dias));
        }
        return total;
    }
}
