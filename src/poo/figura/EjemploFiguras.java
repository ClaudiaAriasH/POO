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
public class EjemploFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Punto puntoUno = new Punto(5, 10);
        Circulo circuloUno = new Circulo(8, puntoUno);
        circuloUno.setNombre("Mi circulo de prueba");
        String smsCirculo = circuloUno.obtenerNombre();
        System.out.println("circulo-> " + smsCirculo + "con área: " + circuloUno.obtenerArea());
        
        
        Cuadrado micuadrado =new Cuadrado();
        micuadrado.setLado(8);
        micuadrado.setNombre("Mi cuadrado de prueba");
        System.out.println(micuadrado.obtenerNombre()+ " con area: "+micuadrado.obtenerArea());

    }

}
