/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n22_factorial_herencia;

/**
 *
 * @author Usuario
 */
public class FactorialPadre {
    protected int numero;

    public FactorialPadre() {
    }

    public FactorialPadre(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public long calculoFactorial() {
        int contador = 1;
        for (int i = numero; i > 1; i--) {
            contador *= i;
        }
        return contador;
    }
    
}
