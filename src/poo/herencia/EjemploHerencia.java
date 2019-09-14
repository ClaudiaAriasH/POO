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
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Sobrecarga de constructores
        Persona personaUno = new Persona();

        personaUno.setNombre("Juan");
        personaUno.imprimirPersona();

        Persona personaDos = new Persona("Carlos", "26", 300000.00);
        personaDos.imprimirPersona();

 //Herencia  y sobreescritura     
        Estudiante estudianteUno = new Estudiante();
        estudianteUno.setNombre("Samuel");
        estudianteUno.imprimirPersona();

        System.out.println("" + personaUno);
        estudianteUno.setMatricula(100000.00);
        estudianteUno.setSalario(300000.00);
        estudianteUno.calcularSalario();

        Empleado empleado = new Empleado();
        empleado.setSalario(40000.00);
        empleado.calcularSalario();
    }

}
