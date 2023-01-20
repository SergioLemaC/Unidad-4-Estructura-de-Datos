package Vector;
import java.util.Vector;

// Creamos un vector de Strings 
// Agregamos elementos al vector 
// Obtenemos el tamaño del vector
// Obtenemos un elemento específico del vector
// Eliminamos un elemento del vector 
// Verificamos el indice de un elemento del vector 
// Comprobamos el tamaño del vector después de eliminar un elemento.

public class Main {
    public static void main(String[] args) {
        // Creamos un nuevo vector de strings 
        Vector<String> v = new Vector<String>();

        // Añadimos elementos al vector
        v.add("Hola");
        v.add("soy");
        v.add("una");
        v.add("cadena");

        // Obtenemos el tamaño del vector
        System.out.println("El tamaño del vector es: " + v.size());

        // Obtenemos un elemento específico del vector
        System.out.println("El elemento en la posición 1 es: " + v.get(1));

        // Eliminamos un elemento del vector
        v.remove(1);

        // Verificamos el indice del string 'Hola'
        System.out.println("Indice de la cadena 'Hola': "+v.indexOf("Hola"));
        
        // Comprobamos el tamaño del vector después de eliminar un elemento
        System.out.println("El nuevo tamaño del vector es: " + v.size());
    }
}
