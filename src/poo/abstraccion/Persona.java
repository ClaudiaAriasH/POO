/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraccion;

/**
 *
 * @author s109e9
 */
public abstract class Persona {

    protected String nombreProtegido;
    private String nombre;
    private String edad;
    private double salario;

    public abstract void imprimirPersona();

    public String getNombreProtegido() {
        return nombreProtegido;
    }

    public void setNombreProtegido(String nombreProtegido) {
        this.nombreProtegido = nombreProtegido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calcularSalario();

}
