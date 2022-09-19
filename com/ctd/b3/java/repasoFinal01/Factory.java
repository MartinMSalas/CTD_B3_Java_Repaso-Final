package com.ctd.b3.java.repasoFinal01;

public class Factory implements Figura{
    private static Factory instancia;

    private Factory() {

    }
    public static Factory getInstancia(){
        if (instancia == null)
            instancia = new Factory();
        return instancia;
    }

    public Figura crearFigura(String figuraString){
        Figura figura = null;
        switch (figuraString){
            case "Circulo 1" :
                figura = new Circulo();
                ((Circulo) figura).setRadio(10);
                break;
            case "Rectangulo 5 x 4" :
                figura = new Rectangulo();
                ((Rectangulo) figura).setAlto(4);
                ((Rectangulo) figura).setLargo(5);
                break;
            case "Triangulo 10 x 20" :
                figura = new Triangulo();
                ((Triangulo) figura).setBase(10);

                break;
            case "Figura Compuesta" :
                figura = new FiguraCompuesta();
                ((FiguraCompuesta) figura).setNombre("Vagon");
                break;
        }
        return figura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
