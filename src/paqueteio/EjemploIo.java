/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e9
 */
public class EjemploIo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leerArchivoBytes();
            crearArchivoBytes();
        } catch (IOException ex) {
            Logger.getLogger(EjemploIo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leerArchivoBytes() throws IOException {

        FileInputStream miStream = null;

        try {
            miStream = new FileInputStream("puebaInputStream.txt");
            int miByte = miStream.read();
            while (miByte != -1) {
                System.err.print(miByte);
                miByte = miStream.read();
            }
        } catch (IOException ex) {
            Logger.getLogger(EjemploIo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }

    }



    public static void crearArchivoBytes() throws IOException {

        FileOutputStream miStream = null;

        try {
            miStream = new FileOutputStream("puebaOutputStream.txt");
            miStream.write(300);

        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }

    }
}
