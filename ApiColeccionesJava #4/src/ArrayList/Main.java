package ArrayList;
import java.util.ArrayList;

// Crea una lista de String utilizando la clase ArrayList. 
// Agregamos varios elementos a la lista 
// Obtenemos el tamaño de la lista 
// Obtenemos elemento especifico de la lista. 
// Eliminamos un elemento en una posición específica 
// Obtenemos el nuevo tamaño de la lista.
// Recorremos y mostramos los elementos de la lista 

public class Main {
    public static void main(String[] args) {
        // Creacion de la lista de string (discos)
        ArrayList<String> discos = new ArrayList<>();
        
        // Añadiendo elementos a la lista 
        discos.add("Feliz cumpleaños");
        discos.add("Tu eres la reina ");
        discos.add("Get lucky");
        
        // Obteniendo tamaño de la lista 
        System.out.println("Tamaño de la lista: " + discos.size()); 
        
        // Obteniendo indice de elemento en posicion especifica 
        System.out.println("Segundo elemento: " + discos.get(1));
        
        // Removiendo elemento en indice especifico
        discos.remove(0);
        
        // Obteniendo nuevo tamaño de la lista 
        System.out.println("Nuevo tamaño de la lista: " + discos.size()); 
    
        // Recorriendo e imprimiendo elementos de la lista 
        for (int i= 0; i < discos.size(); i++){
            System.out.println(discos.get(i));
        }
    }
}
