/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figura;

/**
 *
 * @author s109e9
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return "[" + x + "," + y + "]"; //To change body of generated methods, choose Tools | Templates.
    }

}
