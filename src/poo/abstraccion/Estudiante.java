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
public class Estudiante extends Persona {

    private String universidad;
    private String semestre;
    private double matricula;

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprimirPersona() {
        System.out.println("El estudiante es: " + this.nombreProtegido);
    }

    @Override
    public void calcularSalario() {

        double resultaSalario = super.getSalario() - matricula;
        System.out.println("El salario del estudiante es: " + resultaSalario);
    }

}
