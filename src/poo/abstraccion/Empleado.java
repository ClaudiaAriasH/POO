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
public class Empleado extends Persona {

    private String antiguedad;

    @Override
    public void imprimirPersona() {
    }

    @Override
    public void calcularSalario() {

        System.out.println("El salario del empleado es: " + super.getSalario());
    }

}
