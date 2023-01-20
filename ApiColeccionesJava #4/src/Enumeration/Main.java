package Enumeration;
import java.util.Vector;
import java.util.Enumeration;

// Creamos un vector de Lenguajes de programacion 
// Añadimos varios elementos al vector 
// luego utiliza el método elements() de la clase Vector para obtener una enumeración de los elementos del vector. 
// Recorremos el vector apoyandonos de los metodos hasMoreElements() como condicion y nextElement() para ir recorriendo el vector 

public class Main {
    public static void main(String[] args) {
        // Creacion de un vector 
        Vector<String> lenguajes = new Vector<String>();
        lenguajes.add("Javascript");
        lenguajes.add("C++");
        lenguajes.add("Php");
        lenguajes.add("Python");
        lenguajes.add("Java");

        // Obtener una enumeración de los elementos del vector
        Enumeration<String> e = lenguajes.elements();
        
        // Recorrer los elementos del vector utilizando la enumeración
        while (e.hasMoreElements()) {
            String lenguaje = e.nextElement();
            System.out.println(lenguaje);
        }
    }
}
