/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

/**
 *
 * @author s109e9
 */
public class Persona {

    protected String nombreProtegido;
    private String nombre;
    private String edad;
    private double salario;

    public Persona() {

    }

    public Persona(String nombre, String edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = sueldo;
    }

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
        this.nombreProtegido = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*    public String obtenerNombre() {

     return this.nombre;
     }

     public void asignarNombre(String nombre) {
     this.nombre = nombre;
     this.nombreProtegido = nombre;
     }
     */
    public void calcularSalario() {

    }

    public void imprimirPersona() {
        System.out.println("El nombre de la persona es: " + this.nombre);
    }

    @Override
    public String toString() {
        return this.nombre; //To change body of generated methods, choose Tools | Templates.
    }

}
