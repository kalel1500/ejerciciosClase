/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n51_javaapplication40;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class N51_JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // iniciar un fichero bat
            String cmd = "cmd /c start C:\\Users\\Usuario\\Desktop\\admin.bat";
            Process pb = Runtime.getRuntime().exec(cmd);
            
//            String comando = "cmd /c start mkdir C:\\Users\\Usuario\\Desktop\\carpeta1";
//            Process pb = Runtime.getRuntime().exec(comando);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
