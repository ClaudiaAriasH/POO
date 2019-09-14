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
public class Ejemploabstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudiante estudiante = new Estudiante();
        estudiante.setNombreProtegido("Juan Abs");
        estudiante.imprimirPersona();

        estudiante.setMatricula(100000.00);
        estudiante.setSalario(300000.00);
        estudiante.calcularSalario();

        Empleado empleado = new Empleado();
        empleado.setSalario(400000.00);
        empleado.calcularSalario();

    }

}
