/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author s109e9
 */
public class EjemploDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingresarDatos();
    }

    private static void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción:" + "\n" + " A) Sumar B) Restar S) Salir");
        String opcion = scanner.next();

        while (!opcion.equals("S")) {

            System.out.println("La opción seleccionada es: " + opcion);
            
            
            //swicht
            System.out.println("Ingrese una opción:" + "\n" + " A) Sumar B) Restar S) Salir");
            opcion = scanner.next();
        }
    }
}
