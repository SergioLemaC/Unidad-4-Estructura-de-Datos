package LinkedList;
import java.util.LinkedList;

// Crea una nueva lista de numeros enteros 
// Añadimos elementos a la lista 
// Añadimos un elemento al principio de la lista 
// Removemos el primer elemento de la lista. 
// Verificamos si la lista contiene un numero especifico, 
// Obtenemos el índice de un número específico en la lista.

public class Main {
    public static void main(String[] args) {
        // Crear una nueva lista de numeros enteros
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        // Agregar elementos a la lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Imprimir contenido de la lista
        System.out.println("Lista original: " + numeros);

        // Agregar un elemento al principio de la lista 
        numeros.addFirst(0);
        System.out.println("Lista con un numero agregado al principio: " + numeros);

        // Eliminar el primer elemento de la lista
        numeros.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + numeros);

        // Verificar si la lista contiene un número específico
        int busqueda = 3; 
        if (numeros.contains(busqueda)) {
            System.out.println("La lista contiene el número " + busqueda);
        } else {
            System.out.println("La lista no contiene el número " + busqueda);
        }

        // Obtener el índice de un número específico en la lista
        int indice = 4;
        int resultado = numeros.indexOf(indice);
        if (resultado != -1) {
            System.out.println("El número " + indice + " se encuentra en el índice " + resultado + " de la lista");
        } else {
            System.out.println("El número " + indice + " no se encuentra en la lista");
        }
    }
}

