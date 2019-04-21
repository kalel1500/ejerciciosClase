/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n36_trycatch;

/**
 *
 * @author Usuario
 */
public class N36_tryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float f1;
        String L1 = "3";
        // si todo va bien, pasa = true
        boolean pasa = true;
        while(pasa) {
            try {
                f1 = Float.parseFloat(L1);
                pasa = false;
            } catch(Exception ex) {
                System.out.println("L1 no puede ser convertido a float");
                pasa = true;
            } finally {
                // algo que siempre se va a ejecutar
            }
        }
    }
    
}
