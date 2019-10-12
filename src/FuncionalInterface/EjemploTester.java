/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionalInterface;

/**
 *
 * @author s109e9
 */
public class EjemploTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tester test = () -> {

            System.out.println("Implementacion metodo imprimir");
        };
        test.imprimirDatos();
        test.imprimir();

        Tester test2 = () -> {
            System.out.println("Hola, implntacion test2");
        };

        test2.imprimir();
    }

}
