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
public class Empleados {
    private String empleado;
    private int hotario;
    private int horas;
    
    
    public Empleados(String empleado, int hotario, int horas) {
        this.empleado = empleado;
        this.hotario = hotario;
        this.horas = horas;
    }

    public String getEmpleado() {
        return empleado;
    }

    public int getHotario() {
        return hotario;
    }

    public int getHoras() {
        return horas;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setHotario(int hotario) {
        this.hotario = hotario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}