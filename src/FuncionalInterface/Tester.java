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
@FunctionalInterface
public interface Tester {

    public void imprimir();

    public default void imprimirDatos() {
        System.out.println("Hola");
    }
}
