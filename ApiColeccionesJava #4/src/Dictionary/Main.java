package Dictionary;
import java.util.Dictionary;
import java.util.Hashtable;

// Creamos un diccionario que almacena pares clave-valor de tipo String y Entero
// Añadimos algunos pares clave-valor al diccionario
// Obtenemos el valor asociado a una clave específica 
// Eliminamos un par clave-valor
// Validamos que el diccionario este vacío.

public class Main {
    public static void main(String[] args) {
        // Creacion del diccionario con pares clave-valor de tipo String y Integer 
        Dictionary<String, Integer> d = new Hashtable<>();
        
        // Añadimos algunos pares clave-valor al diccionario
        d.put("reloj", 1000);
        d.put("cinturon", 2500);
        d.put("sueter", 3600);
        
        // Obtenemos el valor asociado a una clave específica
        System.out.println("El valor asociado a la clave 'reloj' es: " + d.get("reloj"));
        
        // Eliminamos un par clave-valor
        d.remove("sueter");
        System.out.println("El diccionario después de eliminar el par clave-valor 'sueter': " + d);
        
        
        // Validamos que el diccionario este vacío.
        if (d.isEmpty()) {
            System.out.println("El diccionario esta vacío");
        } else {
            System.out.println("El diccionario no esta vacío");
        }
    }
}