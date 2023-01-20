package Collection_Collections;
import java.util.ArrayList;
import java.util.Collection;

// Creamos una nueva lista de números enteros utilizando la clase ArrayList, que implementa la interfaz Collection. 
// Añadimos elementos a la lista 
// Obtnemos el tamaño de la lista 
// Verificamos si la lista está vacía 
// Verificamos si contiene un elemento específico 
// Eliminamos un elemento de la lista 
// Obtenemos o imprimimos todos los elementos con un ciclo.

public class CollectionMain {
    public static void main(String[] args) {
        // Crear una nueva lista de números enteros
        Collection<Integer> numeros = new ArrayList<>();

        // Añadir elementos a la lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Imprimir el tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size());

        // Verificar si la lista está vacía
        System.out.println("¿Lista vacía?: " + numeros.isEmpty());

        // Verificar si la lista contiene un elemento específico
        System.out.println("Contiene el número 2: " + numeros.contains(2));

        // Eliminar un elemento de la lista
        numeros.remove(2);

        // Recorrer y imprimir todos los elementos de la lista
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}

