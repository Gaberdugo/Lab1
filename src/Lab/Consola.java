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
public class Consola {
    private Empleados[] numEmpleados;
    private Provedores[] provedores; 
    private int j = 0;
    private int numProvedor = 0;

    public Consola(int x) {
        this.numEmpleados = new Empleados[7];
        this.provedores = new Provedores[15];
    }
    
    
    public boolean addEmpleado(String nombre, int horario, int horas){
        Empleados empleado = new Empleados(nombre, horario, horas);
        if(this.j < 8){
         this.numEmpleados[this.j] = empleado;
         this.j++;
         return true;
        }
        else 
          return false;
    }
    public Empleados mirarInformacion(String nombre){
         Empleados empleados = null;
         for (int i = 0; i < this.j; i++) {
           if(this.numEmpleados[i].getEmpleado().equals(nombre)){
              empleados = this.numEmpleados[i];
              break;
           }   
         }
        return empleados;
    }
    public boolean addProvedor(String nombre, double deuda, int fecha){
        Provedores provedor = new Provedores (nombre, deuda, fecha);
        if(this.numProvedor < 15){
            this.provedores[numProvedor] = provedor;
            this.numProvedor++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Provedores mirarFecha(int fecha){
        Provedores provedor = null;
        for (int k = 0; k < this.numProvedor; k++) {
            int m = this.provedores[k].getFecha() - fecha;
            if( m <= 2  ){
                provedor = this.provedores[k];
           }
         }
        return provedor;
    } 
}