/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author s109e9
 */
public class MynumberExcepcion extends Exception {

    private CodigoErrores codigoError;

    public MynumberExcepcion(CodigoErrores codigoError) {
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {

        if (this.codigoError == CodigoErrores.POSITIVO) {

            return "Error: solo permite numeros positivos";
        }

        if (this.codigoError == CodigoErrores.PARES) {
            return "Error: solo permite numeros pares";
        }
         if (this.codigoError == CodigoErrores.IMPARES) {
            return "Error: solo permite numeros impares";
        }
        return "Error no definido";
    }
}
