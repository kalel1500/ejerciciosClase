/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_aplicacion_consola2;

/**
 *
 * @author Usuario
 */
public class Operacion {
    public Float n1;
    public Float n2;
    public String result;

    public Operacion() {
    }
    
    public String suma (){
        String result = String.valueOf(this.n1+this.n2);
        String result2 = "El resultado es: " + result;
        return result2;
        // return (this.n1+this.n2);
    }
    
}
