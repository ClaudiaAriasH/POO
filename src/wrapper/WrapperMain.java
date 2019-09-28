/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author s109e9
 */
public class WrapperMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Wrappers");

        //double tipo primitivo
        double saldo = 5000.00;

        Double wrapperSaldo = new Double("8000");
        boolean isNan = wrapperSaldo.isNaN();
        int intSaldo = wrapperSaldo.intValue();

        System.err.println("Is NAN" + isNan);
        System.err.println("Is int" + intSaldo);

        int edad = 80;
        Integer wrapperEdad = new Integer(edad);
        Integer wrapperEdad2 = edad;
        System.err.println(wrapperEdad + "  " + wrapperEdad2);

    }

}
