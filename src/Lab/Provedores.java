/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

/**
 *
 * @author GUSTAVOADOLFO
 */
public class Provedores {
    
    private String provedor;
    private double deuda;
    private int fecha;

    public Provedores(String provedor, double deuda, int fecha) {
        this.provedor = provedor;
        this.deuda = deuda;
        this.fecha = fecha;
    }

    public String getProvedor() {
        return provedor;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getFecha() {
        return fecha;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }   
}