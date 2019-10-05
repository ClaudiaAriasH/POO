/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author s109e9
 */
public class Factura {

    private String nit;
    private double valor;
    private double valorSubTotal;
    private double iva;

    public Factura(String nit, double valor, double valorSubTotal, double iva) {
        this.nit = nit;
        this.valor = valor;
        this.valorSubTotal = valorSubTotal;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return this.nit + " Total: " + this.valor;
    }

}
