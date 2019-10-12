/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author s109e9
 */
public class EjemploMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hasmap");
        crearHasmap();
        System.out.println("Treemap");
        crearTreeHasmap();
        System.out.println("LinkedHashMap");
        crearLikedHasmap();
    }

    public static void crearHasmap() {

        Map<Integer, String> miLista = new HashMap<>();
        miLista.put(5, "Lorena");
        miLista.put(6, "Jose");
        miLista.put(7, "Cesar");
        miLista.put(8, "Luis");

        for (Map.Entry<Integer, String> elemento : miLista.entrySet()) {
            Integer key = elemento.getKey();
            String value = elemento.getValue();
            System.out.println("Llave; " + key + " Valor: " + value);
        }

    }

    public static void crearTreeHasmap() {

        Map<Integer, String> miLista = new TreeMap<>();
        miLista.put(5, "Lorena");
        miLista.put(6, "Jose");
        miLista.put(7, "Cesar");
        miLista.put(8, "Luis");

        miLista.forEach((llave, valor)
                -> {
                    System.out.println("Llave; " + llave + " Valor: " + valor);
                });
    }

    public static void crearLikedHasmap() {

        Map<Integer, String> miLista = new LinkedHashMap<>();
        miLista.put(5, "Lorena");
        miLista.put(6, "Jose");
        miLista.put(7, "Cesar");
        miLista.put(8, "Luis");

        miLista.forEach((llave, valor)
                -> System.out.println("Llave; " + llave + " Valor: " + valor));
    }

}
