/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n22_factorial_herencia;

/**
 *
 * @author Adrian Canals
 */
public class FactorialHijo extends FactorialPadre {
    /**
    *
    * @return
    */
    @Override
    public long calculoFactorial() {
        if (this.numero!=1) {
            int resultado = this.numero;
            this.numero = this.numero-1;
            return resultado*calculoFactorial();
        } else {
            return 1;
        }
    }
}
