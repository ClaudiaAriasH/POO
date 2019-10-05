/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author s109e9
 */
public class EjemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lista();
        // listaFacturas();
        // pilas();
        colas();
    }

    public static void pilas() {
        Stack<Integer> miPila = new Stack<>();
        miPila.add(1);//libro base
        miPila.add(2);//libro medio
        miPila.add(3);//libro cima
        System.out.println("Tamaño: " + miPila.size());
        System.out.println("Elimina: " + miPila.pop());
        System.out.println("Ultimo en la pila en entrar: " + miPila.peek() + " nuevo tamaño: " + miPila.size());

        //add sincrono push asincrono
    }

    public static void colas() {
        Queue<String> miListaCola = new LinkedList<>();
        miListaCola.add("a");//turno 1
        miListaCola.add("b");//turno 2
        miListaCola.add("c");//turno 3

        System.out.println("Tamaño: " + miListaCola.size());
        System.out.println("Elimina: " + miListaCola.poll());
        System.out.println("Datos cola: " + miListaCola.peek() + " nuevo tamaño: " + miListaCola.size());

    }

    public static void listaFacturas() {
        ArrayList<Factura> misFacturas = new ArrayList<>();

        Factura nro1 = new Factura("100-2123698", 55000, 50000, 19);
        misFacturas.add(nro1);
        Factura nro2 = new Factura("100-14589", 35000, 30000, 16);
        misFacturas.add(nro2);
        System.out.println("Mis facturas: " + misFacturas);

        Factura obtenerFactura1 = misFacturas.get(0);

        System.out.println("Factura 1: " + obtenerFactura1);
    }

    public static void lista() {
        ArrayList<String> miLista = new ArrayList<>();
        //Agregar listas

        miLista.add("Claudia");
        miLista.add("Juan David");
        miLista.add("Luis");
        System.out.println(miLista);
        int size = miLista.size();

        System.out.println(size);

        //Obtener elemento     
        try {
            String estudiante = miLista.get(2);
            System.out.println(estudiante);
            boolean existeEstudiante = miLista.contains("Luis");
            System.out.println("Existe: " + existeEstudiante);
            boolean removido = miLista.remove("Luis");
            System.out.println("Se elimino:  " + removido);
            String removido2 = miLista.remove(1);
            System.out.println("Se elimino:  " + removido2);
            System.out.println(miLista);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " " + e);
        }
    }
}
