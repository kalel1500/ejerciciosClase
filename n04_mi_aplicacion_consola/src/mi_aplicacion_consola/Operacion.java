/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_aplicacion_consola;

/**
 *
 * @author Usuario
 */
public class Operacion {
    public double n1;
    public double n2;

    public Operacion() {
    }

    /*public Operacion(double n1) {
        this.n1 = n1;
    }*/

    /*public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }*/
    
    // mis metodos
    
    public double suma (){
        double result = this.n1+this.n2;
        return result;
        // return (this.n1+this.n2);
    }
    public double resta (){
        double result = this.n1-this.n2;
        return result;
    }
    public double multiplicacion (){
        double result = this.n1*this.n2;
        return result;
    }
    public double division (){
        double result = this.n1/this.n2;
        return result;
    }
}
