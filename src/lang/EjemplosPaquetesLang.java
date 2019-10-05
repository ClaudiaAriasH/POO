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
public class EjemplosPaquetesLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Character
        char miChar;
        Character mi_Char = 'g';
        Character mi_Char2 = 'e';

        boolean isDigit = Character.isDigit(mi_Char);

        System.out.println("El char es digito " + isDigit);
        int compareTo = mi_Char.compareTo(mi_Char2);
        System.out.println("compare to " + compareTo);

        System.out.println("Mayuscula " + mi_Char.toUpperCase(mi_Char));
        System.out.println("Minuscula " + mi_Char.toLowerCase(mi_Char));

        // Crear numero aleatorio
        double nro1 = Math.random();
        System.out.println("" + nro1);

        double nro2 = Math.random() * 100;

        System.out.println("" + nro2);
        System.out.println("Numero redondeado " + Math.round(nro2));
        System.out.println("Numero redondeado menor " + Math.floor(nro2));
        System.out.println("Numero redondeado mayor " + Math.ceil(nro2));

        String nombre = "Santiago";
        String nombre2 = "Juan";
        String apellido = "Urrego";
        System.out.println("Equal " + nombre.equals(nombre2));
        System.out.println(nombre + " " + apellido);

        StringBuffer nombreCompleto = new StringBuffer("Santiago ");
        nombreCompleto.append("Urrego ");
        nombreCompleto.insert(0, "Hola: ");
        nombreCompleto.deleteCharAt(4);

        String mensajeBievenida = nombreCompleto.substring(0, 4);

        System.out.println(" Nombre completo" + mensajeBievenida);
        System.out.println("substring" + nombreCompleto);
        System.out.println("Rever" + nombreCompleto.reverse());
        String[] split = mensajeBievenida.split("l");
        System.out.println("Split" + split[0] + " " + split[1]);

    }

}
