/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author s109e9
 */
public class Avion implements Voladores, Transportador {

    @Override
    public void despegar() {

        System.out.println("Despegando avion");
    }

    @Override
    public void aterizar() {
        System.out.println("aterrizando avion");
    }

    @Override
    public boolean servirComida() {
        System.out.println("en el avion si se reparte comida");
        return true;
    }

    @Override
    public void volar() {
        System.out.println("Volando avion");
    }

    @Override
    public boolean horarioCumplido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cantidadcombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
