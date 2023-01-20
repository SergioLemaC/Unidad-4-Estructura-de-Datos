package Collection_Collections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// Crea una lista de numeros enteros
// Añadimos elementos a la lista  
// Usamos el método sort de la clase Collections para ordenar los elementos de la lista.
// Imprimimos la lista 

public class CollectionsMain {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        Collections.sort(numeros);
        System.out.println(numeros); 
    }
}
