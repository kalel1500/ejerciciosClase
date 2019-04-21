/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Discriminante {
    //Atributos
    private double x1;
    private double x2;
    
    // Constructor para guardar memoria para crear objetos
    public Discriminante() {
    }
    
    //metodos de acceso getters y setters
    //con los getters recuperare el valor de mis atributos
    //Con los setters introducire el valor a mis atributos (en este caso no se usan)
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    
    
    
    public String discriminante(double a,double b,double c) {
        String mensaje = "";
        double discri;
        discri = (b*b)-4*a*c;
        if(discri>0) {
            mensaje = "Esta equacion tiene dos soluciones \n";
            this.x1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
            this.x2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        }
        if(discri==0) {
            mensaje = "Esta equacion tiene una soluciones \n";
            this.x1=-b/(2*a);
        }
        if(discri<0) {
            mensaje = "Esta equacion no tiene soluciones \n";
        }
        return mensaje;
    }
    public int solucion(double a,double b,double c) {
        int solucion = 0;
        double discri;
        discri = (b*b)-4*a*c;
        if(discri>0) {
            solucion = 2;
        }
        if(discri==0) {
            solucion = 1;
        }
        return solucion;
    }
}
