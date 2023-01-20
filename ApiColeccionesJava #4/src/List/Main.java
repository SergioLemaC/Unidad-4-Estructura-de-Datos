package List;
import java.util.ArrayList;
import java.util.List;

// Creamos una lista de materias utilizando la clase ArrayList, la cual es una implementación de la interfaz List
// Agregamos elementos a la lista 
// Obtenemos el tamaño de la lista 
// Obtenemos un elemento de la lista. 
// Eliminamos un elemento en una posición específica 
// Imprimimos el nuevo tamaño de la lista.

public class Main {
    public static void main(String[] args) {
        // Creacion de la lista 
        List<String> materias = new ArrayList<>();
        
        // Añadimos elementos 
        materias.add("Naturales");
        materias.add("Matematicas");
        materias.add("Calculo");
        
        // Obtenemos tamaño 
        System.out.println("Tamaño de la lista: " + materias.size()); 
        
        // Obtenemos tamaño especifico 
        System.out.println("Tercer elemento: " + materias.get(2)); 
        
        // Removemos elemento con indice especifico 
        materias.remove(1);
        
        // Imprimimos nuevo tamaño de la lista 
        System.out.println("Nuevo tamaño de la lista: " + materias.size()); 
    }
}