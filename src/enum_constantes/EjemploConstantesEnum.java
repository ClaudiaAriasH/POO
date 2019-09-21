/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum_constantes;

/**
 *
 * @author s109e9
 */
public class EjemploConstantesEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cuenta miCuenta = new Cuenta();        
        System.out.println("Consecutivo: "+miCuenta.CONSECUTIVO_INICIAL);
        
        
        System.out.println("Tipo Madera: "+TipoMadera.PINO);
        System.out.println("Tipo Madera: "+TipoMadera.ROBLE);
        
        System.out.println("Maderas: "+Maderas.PINO.color +" "+Maderas.PINO.peso );
    }
    
}
