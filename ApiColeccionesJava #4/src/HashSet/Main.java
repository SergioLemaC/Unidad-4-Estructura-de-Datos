package HashSet;
import java.util.HashSet;
import java.util.Set;

// Creamos un nuevo conjunto de Strings  
// Añaidmos elementos 
// Verificamos si el conjunto contiene una palabra específica
// Eliminamos un elemento del conjunto 
// Obtener el tamaño del conjunto.

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo conjunto de Strings
        Set<String> frutas = new HashSet<String>();

        // Añadimos elementos 
        frutas.add("Banano");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Uva");
        frutas.add("Banano"); // No dejara introducirlo por que ya existe 

        // Imprimir el contenido del conjunto
        System.out.println("Conjunto original: " + frutas);

        // Verificar si el conjunto contiene una palabra específica
        String busqueda = "Pera";
        if (frutas.contains(busqueda)) {
            System.out.println("El conjunto de frutas contiene " + busqueda);
        } else {
            System.out.println("El conjunto de frutas no contiene " + busqueda);
        }

        // Eliminamos elemento 
        String eliminar = "Manzana";
        frutas.remove(eliminar);
        
        // Obtenemos conjunto despues de eliminar un elemento 
        System.out.println("Conjunto después de eliminar una fruta: "+ frutas);

        // Obtener el tamaño del conjunto
        System.out.println("El tamaño del conjunto de frutas es: " + frutas.size());
    }
}

