package Lab;
import java.util.*;
/**
 *
 * @author Gustavo Berdugo
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Consola consola = new Consola(2);
        Venta ventas = new Venta();
        int continuar = 1, numero=0;
        do{
            System.out.println("Bievenido a la tienda");
            System.out.println("Opciones");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mirar empleado");
            System.out.println("3. Agregar provedor");
            System.out.println("4. Mirar fecha de vencimiento");
            System.out.println("5. Agregar productos");
            System.out.println("6. Hacer venta");
            System.out.println("7. Mayor movimiento");
            numero = in.nextInt();
        
            if(numero == 1){
                
                System.out.println("Nombre");
                String nombre = in.next();
                System.out.println("Horario");
                int horario = in.nextInt();
                System.out.println("Horas");
                int horas = in.nextInt();
                boolean nuevo = consola.addEmpleado(nombre, horario, horas);
            if(nuevo == true)
                System.out.println("Se guardo el nuevo empleado");
            else
                System.out.println("No se guardo el empleado");
            }
        
            if(numero == 2){
                System.out.println("Poner nombre");
                String nombre = in.next();
                Empleados buscar = consola.mirarInformacion(nombre);
                if(buscar != null)
                    System.out.println(buscar.getEmpleado() + " Si es empleado");
                else
                    System.out.println("No trabaja aqui");
            }
            
            if(numero == 3){
                System.out.println("Nombre Provedor");
                String provedor = in.next();
                System.out.println("Deuda");
                double deuda = in.nextDouble();
                System.out.println("Fecha de pago(Poner el dia)");
                int fecha = in.nextInt();
                
                boolean agregar = consola.addProvedor(provedor, deuda, fecha);
                if(agregar == true)
                    System.out.println("Nuevo provedor");
                else
                    System.out.println("No se pudo");
            }
            
            if(numero == 4){
                System.out.println("Poner fecha actual(Dia)");
                int dia = in.nextInt();
                Provedores provedor = consola.mirarFecha(dia);
                if(provedor != null)
                    System.out.println(provedor.getProvedor() + " proximo a vencer");
                else
                    System.out.println("Aun hay tiempo para pagar");
            }
            
            if(numero == 5){
                System.out.println("Nombre");
                String nombre = in.next();
                System.out.println("Cantidad");
                int cantidad = in.nextInt();
                System.out.println("Precio");
                double precio = in.nextDouble();
                
                boolean resultado = ventas.addProducto(nombre, cantidad, precio);
                
                if(resultado == true)
                    System.out.println("Nuevo producto");
                else
                    System.out.println("No se pudo");
            }
            
            if(numero == 6){
                System.out.println("Nombre producto");
                String nombre = in.next();
                System.out.println("Cantidad vendida");
                int cantidad = in.nextInt();
                
                Producto resultado = ventas.addVenta(nombre, cantidad);
                
                if(resultado != null){
                    System.out.println("Se vendio " + resultado.getNombre());
                    if(resultado.getCantidad()>0)
                        System.out.println("Queda " + resultado.getCantidad());
                    else
                        System.out.println("No hay más");
                }
                else
                    System.out.println("No existe");
                
            }
            
            if(numero == 7){
                String mas = ventas.masVendido();
                if(mas != null)
                    System.out.println("Producto mas vendido es " + mas);
                else
                    System.out.println("Error");
            }
        }while(continuar == 1);
    }
}