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
public abstract class Figura {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String obtenerNombre();

    public abstract double obtenerVolumen();

    public abstract double obtenerArea();
}
