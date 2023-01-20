package Set;
import java.util.HashSet;
import java.util.Set;

// Creamos un nuevo conjunto de cadenas 
// Añadimos elementos 
// El método add no permite agregar elementos duplicados, por eso al agregar "perro" dos veces solo se agrega una vez.
// Verificamos si el conjunto contiene un elemento específico
// Eliminamos un elemento del conjunto
// Obtenemos el tamaño del conjunto.

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo conjunto de Stringss
        Set<String> palabras = new HashSet<String>();

        // Añaidmos elementos 
        palabras.add("perro");
        palabras.add("gato");
        palabras.add("raton");
        palabras.add("pajaro");
        palabras.add("perro"); // no permitira añadir nuevamente la palabra 'perro' por que ya existe y no deja añadir elementos repetidos

        // Imprimir el contenido del conjunto
        System.out.println("Conjunto original: " + palabras);

        // Verificar si el conjunto contiene una palabra específica
        String busqueda = "gato";
        if (palabras.contains(busqueda)) {
            System.out.println("El conjunto contiene la palabra " + busqueda);
        } else {
            System.out.println("El conjunto no contiene la palabra " + busqueda);
        }

        // Eliminar elemento 'raton' del conjunto
        palabras.remove("raton");
        
        // Imprimir el contenido del conjunto despues de eliminar una palabra 
        System.out.println("Conjunto después de eliminar la palabra 'raton': "+ palabras);

        // Obtener el tamaño del conjunto
        System.out.println("El tamaño del conjunto es: " + palabras.size());
    }
}
