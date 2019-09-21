/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recolector;

/**
 *
 * @author s109e9
 */
public class Carro {

    private String color;
    private int numeroPuertas;
    private int modelo;
    private String marca;

    public Carro() {

    }

    public Carro(String color, int numeroPuertas, int modelo, String marca) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void acelerar() {

    }

    public void frenar() {

    }

    /**
     * Valor del carro
     *
     * @return el valor del carro
     */
    public double valorCarro() {

        //Primera condición
        if (this.modelo > 2010 && this.numeroPuertas == 4) {
            return 50000000;

        }
        //Segunda condición
        if (this.modelo > 2010 && this.numeroPuertas == 2) {
            return 40000000;

        }
        //Tercera condición
        if (this.modelo <= 2010 && this.numeroPuertas == 4) {
            return 40000000;

        }
        //cuarta condición
        if (this.modelo <= 2010 && this.numeroPuertas == 2) {
            return 40000000;

        }
        return 10000000;
    }

    public void imprimirInformación() {

        System.out.println("Marca: " + this.marca);
        System.out.println("Color: " + this.color);
        System.out.println("Modelo: " + this.modelo);
    }

}
