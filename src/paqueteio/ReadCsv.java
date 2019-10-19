/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author s109e9
 */
public class ReadCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            csvReader();
        } catch (IOException ex) {
            Logger.getLogger(ReadCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void csvReader() throws IOException {

        String cvsSplitBy = ",";
        double acum = 0;
        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        BufferedReader miBuffer = new BufferedReader(new FileReader("productos.csv"));
        String line = miBuffer.readLine();
        while (line != null) {
            try {

                String[] colums = line.split(cvsSplitBy);

                if (!colums[3].equals("Precio")) {
                    double precioProd = Double.parseDouble(colums[3]);
                    acum = acum + precioProd;
                    cont++;
                    System.out.println(colums[3]);

                }
                if (!colums[2].equals("Tipo")) {
                    int tipo = Integer.parseInt(colums[2]);
                    if (tipo==1) {
                        cont1++;
                    } else if (tipo==2) {
                        cont2++;
                    } else if (tipo==3) {
                        cont3++;
                    } else if (tipo==4) {
                        cont4++;
                    } else {
                        cont5++;
                    }
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }

            line = miBuffer.readLine();

        }
        System.out.println("El promedio es: " + acum / cont);
        System.out.println("Tipo 1: " + cont1);
        System.out.println("Tipo 2: " + cont2);
        System.out.println("Tipo 3: " + cont3);
        System.out.println("Tipo 4: " + cont4);
        System.out.println("Tipo 5: " + cont5);
    }
}
