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
public class Incompleta extends Completa {

    public Incompleta(int a, int b, int c) {
        super(a, b, c);
    }
    
    @Override
    public Solucion completaSol () {
        Solucion result = new Solucion();
        double x1 = Math.sqrt(-c/a);
        double x2 = -Math.sqrt(-c/a);
        result.setSol1(x1);
        result.setSol2(x2);
        return result;
    }
}
