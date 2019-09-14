/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figura;

/**
 *
 * @author s109e9
 */
public class Circulo extends Figura {

    private double radio;

    //Has-a relación de composición
    private Punto puntoCentral;

    public Circulo() {
    }

    public Circulo(double radio, Punto puntoCentral) {
        this.radio = radio;
        this.puntoCentral = puntoCentral;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String obtenerNombre() {

        return super.getNombre() + " es de tipo circulo" + puntoCentral;
    }

    @Override
    public double obtenerVolumen() {
        double volumen = 0;
        return volumen;
    }

    @Override
    public double obtenerArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

}
