
package Lab;

/**
 *
 * @author GUSTAVOADOLFO
 */
public class Venta {
    private Producto[] productos;
    private int numProductos = 0;

    public Venta() {
        this.productos = new Producto[100];
    }
    
    public boolean addProducto(String nombre, int cantidad, double precio){
        Producto nuevo = new Producto(nombre, cantidad, precio);
        if(this.numProductos < 100){
            this.productos[this.numProductos] = nuevo;
            this.numProductos++;
            return true;
        }
        else 
            return false;
    }
    
    public Producto addVenta(String nombre,int cantidad){
        Producto vendido = null;
        int numCantidad = 0;
        int u = 0; 
        for (int i = 0; i < this.numProductos; i++) {
           if(this.productos[i].getNombre().equals(nombre)){
              numCantidad = this.productos[i].getCantidad();
              numCantidad = numCantidad - cantidad;
              this.productos[i].setCantidad(numCantidad);
              vendido = this.productos[i];
              break;
           }   
        }
        return vendido;
    }
    
    public String masVendido(){
        String mas= null;
        int y = 0;
        for (int i = 0; i < this.numProductos; i++){   
            for (int k = 1; k < this.numProductos; k++){
                if(this.productos[i].getCantidad()<this.productos[k].getCantidad()){
                    mas = this.productos[i].getNombre();
                }
            }
        }
        return mas;
    }
    
}






