/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author s109e9
 */
public class EjemploStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        streams();
    }

    public static void streams() {

        List<String> miLista = new ArrayList<>();
        miLista.add("Lorena");
        miLista.add("Jose");
        miLista.add("Santiago");
        miLista.add("Sebastian");

        for (int i = 0; i < miLista.size(); i++) {
            String nombre = miLista.get(i);

            if (nombre.length() >= 6) {
                System.out.println(nombre.toUpperCase());
            }
        }
        System.out.println("\nStreams: ");
        miLista.stream()
                .filter((elemento) -> {
                    return elemento.length() >= 6;
                })
                .map((elemento) -> {
                    return elemento.toUpperCase();

                })
                .forEach((elemento) -> {
                    System.out.println(elemento);
                });

    }
}
