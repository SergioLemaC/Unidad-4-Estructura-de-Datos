package TreeSet;
import java.util.TreeSet;

// Creamos un nuevo conjunto 
// Añadimos elementos 
// Obtenemos la primera y última palabra del conjunto 
// Obtener una subvista del conjunto 

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo conjunto ordenado de Strings
        TreeSet<String> objetos = new TreeSet<String>();

        // Añadimos elementos 
        objetos.add("Bolso");
        objetos.add("Sueter");
        objetos.add("Pantalon");
        objetos.add("Computador");
        objetos.add("Bolso"); // No permitira añadirlo por que ya existe 

        // Imprimir el contenido del conjunto
        System.out.println("Conjunto original: " + objetos);

        // Obtener el primer y último elemento del conjunto
        System.out.println("Primer objeto: " + objetos.first());
        System.out.println("Último objeto: " + objetos.last());

        // Obtener una subvista del conjunto
        TreeSet<String> subset = (TreeSet<String>) objetos.subSet("Computador","Sueter");
        System.out.println("Subvista: " + subset);

        // Eliminar una palabra del conjunto
        objetos.remove("Computador");
        
        // Imprimir el contenido del conjunto
        System.out.println("Conjunto después de eliminar el objeto 'Computador': " + objetos);
    }
}
