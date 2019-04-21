/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n28_areasinterficies;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Usuario
 */
public class N28_areasinterficies implements Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public double areaTriangulo(double base, double altura) {
        return (base*altura)/2;
    }

    @Override
    public double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    @Override
    public double areaRectangulo(double lado1, double lado2) {
        return lado1*lado2;
    }

    @Override
    public double areaCircunferencia(double radio) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato2 = new DecimalFormat("#.##", separadoresPersonalizados);
        // formato2.format(Math.PI*Math.pow(radio, 2));
        return Math.round(Math.PI*Math.pow(radio, 2));
    }
    
}
