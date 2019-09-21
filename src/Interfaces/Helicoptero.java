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
public class Helicoptero implements Voladores {

    @Override
    public void despegar() {

        System.out.println("Despegando helicoptero");
    }

    @Override
    public void aterizar() {
        System.out.println("aterrizando helicoptero");
    }

    @Override
    public boolean servirComida() {
        System.out.println("en el helicoptero no se reparte comida");
        return false;
    }

    @Override
    public void volar() {
        System.out.println("Volando helicoptero");
    }
}
