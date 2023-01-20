package HashMap;
import java.util.HashMap;
import java.util.Map;

// Creamos una clase que tiene un atributo privado de tipo HashMap<String, Double> para almacenar productos. 
// Creamos una instancia de la clase 
// Añadimos productos con su respectivo nombre y precio 
// Obtenemos la canidad de productos 
// Obtenemos el precio de un producto por su nombre especifico 
// Eliminamos un producto 
// Obtenemos la cantidad de productos existentes despues de haber eliminado uno 


public class Main {
    private Map<String, Double> inventario;

    public Main() {
        inventario = new HashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        inventario.put(nombre, precio);
    }

    public double obtenerPrecio(String nombre) {
        return inventario.get(nombre);
    }

    public void eliminarProducto(String nombre) {
        inventario.remove(nombre);
    }

    public int numeroDeProductos() {
        return inventario.size();
    }
    
    public static void main(String[] args) {
        // Creamos una instancia 
        Main m = new Main();
        
        // Añadimos elementos 
        m.agregarProducto("Chocolate", 8000);
        m.agregarProducto("Trululu", 500);
        m.agregarProducto("Helado", 3000);
        m.agregarProducto("BomBomBum", 200);
        
        // Obtenemos la cantidad de productos 
        System.out.println("Cantidad de productos: "+m.numeroDeProductos());
        
        // Obtener precio de un producto por su nombre 
        System.out.println("Precio del producto 'Chocolate': "+m.obtenerPrecio("Chocolate"));
        
        // Eliminamos un elemento 
        String eliminar = "Trululu";
        m.eliminarProducto(eliminar);
        
        // Obtener la cantidad de productos despues de haber eliminado el producto 'Trululu' 
        System.out.println("Cantidad de productos despues de haber eliminado a 'Trululu': "+m.numeroDeProductos());
    }
}


