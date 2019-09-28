/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e9
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // convertirNumero();
            // lanzarExcepcion();
            lanzarExcepcionConThrows();
            System.out.println("Mensaje de convertir numero");
        } catch (Exception ex) {
            System.out.println("Capturando throws");
        }
    }

    public static void convertirNumero() {

        try {
            Integer wrapperInteger = new Integer("Hola mundo");
            System.out.println("prueba");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "" + e.getCause());
        } finally {
            System.out.println("Ingresa al final");
        }

    }

    public static void lanzarExcepcion() {

        try {
            System.out.println("Inicio para lanzar la excepcion");
            throw new Exception("Esta es la excepcion lanzada");
        } catch (Exception ex) {

            System.out.println("Capturar excepcion");
            System.out.println(ex.getCause() + " " + ex.getMessage());
        }

    }

    public static void lanzarExcepcionConThrows() throws Exception {

        throw new Exception("Esta es la excepcion lanzada por el throws");

    }

    public static void EjecucionDatos() throws Exception {

        lanzarExcepcionConThrows();

    }
}
