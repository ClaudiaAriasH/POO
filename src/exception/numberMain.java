/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import static exception.CodigoErrores.POSITIVO;

/**
 *
 * @author s109e9
 */
public class numberMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int number = -2;
            if (number <= 0) {
                throw new MynumberExcepcion(CodigoErrores.POSITIVO);
            }

            if (number % 2 == 0) {
                throw new MynumberExcepcion(CodigoErrores.PARES);
            } else {
                throw new MynumberExcepcion(CodigoErrores.IMPARES);
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

}
