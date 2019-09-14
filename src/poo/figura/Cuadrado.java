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
public class Cuadrado extends Figura {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String obtenerNombre() {

        return super.getNombre() + " es de tipo cuadrado";
    }

    @Override
    public double obtenerVolumen() {
        double volumen = 0;
        return volumen;
    }

    @Override
    public double obtenerArea() {
        double area = this.lado * this.lado;
        return area;
    }

}
