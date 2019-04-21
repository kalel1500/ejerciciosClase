/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n23_equacion_herencia;

/**
 *
 * @author Usuario
 */
public class Solucion {
    private double sol1;
    private double sol2;

    public Solucion() {
    }

    public Solucion(double sol1, double sol2) {
        this.sol1 = sol1;
        this.sol2 = sol2;
    }

    public double getSol1() {
        return sol1;
    }

    public double getSol2() {
        return sol2;
    }

    public void setSol1(double sol1) {
        this.sol1 = sol1;
    }

    public void setSol2(double sol2) {
        this.sol2 = sol2;
    }
    
    
}
