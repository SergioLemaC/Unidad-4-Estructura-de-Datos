package HashTable;
import java.util.Hashtable;

// Creamos una instancia de Hashtable llamada "p" que almacena precios de articulos. 
// Añadimos elementos a la tabla
// Obtenemos el valor de un elemento dada su clave 
// Modificamos un valor dado su clave 
// Eliminamos un elemento 
// Validamos si existe el elemento eliminado
// Comprobamos si la tabla está vacía.

public class Main {
    public static void main(String[] args) {
        // Creamos una nueva instancia de Hashtable
        Hashtable<String, Integer> p = new Hashtable<>();

        // Añadimos elementos a la tabla
        p.put("Colchon", 300000);
        p.put("Lampara", 50000);
        p.put("Audifonos", 20000);

        // Obtenemos el precio de la lampara
        System.out.println("El precio de la lampara es: " + p.get("Lampara"));

        // Modificamos el precio de los audifonos
        p.put("Audifonos", 22000);
        System.out.println("El precio de los audifonos es: " + p.get("Audifonos"));

        // Eliminamos el colchon
        p.remove("Colchon");
        
        // Validamos si existe el elemento eliminado 
        System.out.println("¿Colchon existe en la tabla?: "+p.contains("Colchon"));
        
        
        // Comprobamos si la tabla está vacía
        System.out.println("¿Está vacía la tabla?: " + p.isEmpty());
    }
}