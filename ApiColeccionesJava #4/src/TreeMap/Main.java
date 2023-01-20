package TreeMap;
import java.util.TreeMap;

// Creamos un nuevo objeto TreeMap 
// Añadimos elementos 
// Obtenemos el primer elemento 
// Obtenemos el ultimo elemento 
// Obtenemos tamaño 

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Añadir elementos al TreeMap
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        
        // Imprimir el primer elemento del TreeMap
        System.out.println("Primer elemento: " + treeMap.firstKey() + " - " + treeMap.get(treeMap.firstKey()));
        
        // Imprimir el último elemento del TreeMap
        System.out.println("Último elemento: " + treeMap.lastKey() + " - " + treeMap.get(treeMap.lastKey()));
    
        // Obteniendo tamaño 
        System.out.println("Tamaño: "+treeMap.size());
    }
}


