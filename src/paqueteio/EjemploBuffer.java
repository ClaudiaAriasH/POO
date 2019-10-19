/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author s109e9
 */
public class EjemploBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            crearArchivoBuffer();
            leerArchivoBuffer();
        } catch (IOException ex) {
            Logger.getLogger(EjemploBuffer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
    private static void crearArchivoBuffer() throws IOException {

        
        FileWriter miStream = null;
        BufferedWriter miBuffer=null;
        try {
            miStream = new FileWriter("puebaOutStream.txt");
             miBuffer= new BufferedWriter(miStream);
          miBuffer.append("Linea 1");
          miBuffer.newLine();
          miBuffer.append("Linea 2");
              miBuffer.close();
        } catch (IOException ex) {
            Logger.getLogger(EjemploIo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (miStream != null) {
                miStream.close();
            }
             if (miBuffer != null) {
                miBuffer.close();
            }
        }

    }
    
    private static void leerArchivoBuffer() throws IOException {

        
 
        BufferedReader miBuffer=new BufferedReader(new FileReader("puebaInputStream.txt") );
        String line= miBuffer.readLine();
        while(line!=null){
            System.err.println(line);
            line= miBuffer.readLine();
        }
        

    }
    
}
