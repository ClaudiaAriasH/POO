/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e9
 */
public class EjemploMenuExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        double nro1 = 0;
        double nro2 = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una opción: \n A) Bloque A \n B) Bloque B  \n S) para salir");
            String opcionMenu = scanner.next();
            while (!opcionMenu.equals("S")) {

                System.out.println("Ingrese el numero 1");

                nro1 = scanner.nextDouble();
                System.out.println("Ingrese el numero 2");

                nro2 = scanner.nextDouble();

                switch (opcionMenu) {

                    case "A":
                        System.out.println("Ejecucion bloquea A");
                        double resultSuma = sumar(nro1, nro2);
                        System.out.println("Resultado suma" + resultSuma);
                        break;
                    case "B":
                        System.out.println("Ejecucion bloquea B");

                        double resultdivision = dividir(nro1, nro2);

                        break;

                    default:
                        throw new MenuExcepcion();

                }
                System.out.println("Ingrese una opción: \n A) Bloque A \n B) Bloque B  \n S) para salir");
                opcionMenu = scanner.next();
            }
        } catch (MenuExcepcion ex) {
            System.out.println("Ingrese una opcion valida " + ex);
        } finally {
            System.out.println("el programa a finalizado ");
        }
    }

    public static double sumar(double numero1, double numero2) {

        try {
            if (numero1 < 0) {
                throw new Exception("Esta suma solo recobe numeros positivos");
            }
            return numero1 + numero2;
        } catch (Exception e) {
            System.out.println("Excepcion en suma");
            return 0;
        }

    }

    public static double dividir(double numero1, double numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("No se puede dividr por cero");
        }
        return numero1 / numero2;

    }

}
