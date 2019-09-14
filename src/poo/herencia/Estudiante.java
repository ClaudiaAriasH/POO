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
    /*
     Metodo de sobre escritura
     */

    @Override
    public void imprimirPersona() {
        //  super.imprimirPersona(); //To change body of generated methods, choose Tools | Templates.
        // System.err.println("El nombre del estudiante es: "+super.getNombre());
        System.out.println("El nombre del estudiante Protegido es: " + super.nombreProtegido);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        double salario =this.getSalario()-matricula;
        System.out.println("El salario del estudiantes  es: " + salario);
    }
    
    
    

}
