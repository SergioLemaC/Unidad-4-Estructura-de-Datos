package SortedSet;
import java.util.SortedSet;
import java.util.TreeSet;

// Creamos un nuevo conjunto ordenado de numeros enteros
// Añadimos elementos  
// obtenemos el primer y último elemento del conjunto
// Usamos el metodo subSet para obtener una subvista del conjunto

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo conjunto ordenado de numeros enteros
        SortedSet<Integer> numeros = new TreeSet<Integer>();

        // Agregar elementos 
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(5);

        // Imprimir el contenido del conjunto
        System.out.println("Conjunto original: " + numeros);

        // Obtener el primer y último elemento del conjunto
        System.out.println("Primer elemento: " + numeros.first());
        System.out.println("Último elemento: " + numeros.last());

        // Obtener una subvista del conjunto
        SortedSet<Integer> subset = numeros.subSet(2, 5);
        System.out.println("Subvista: " + subset);
    }
}