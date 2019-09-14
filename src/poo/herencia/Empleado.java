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
public class Empleado extends Persona {

    private String antiguedad;

    @Override
    public void calcularSalario() {
        super.calcularSalario(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El salario del empleado es: " + this.getSalario());
    }
    
    
    
}
