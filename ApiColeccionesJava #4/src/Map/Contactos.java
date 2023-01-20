package Map;
import java.util.HashMap;
import java.util.Map;

// Creamos una clase llamada Contactos con sus respectivos metodos para añadir, obtener, eliminar y ver cantidad de contactos 
// Creamos una instancia de la clase Contactos 
// Añadimos contactos  
// Obtener el número de teléfono de un contacto específico 
// Eliminar un contacto. 
// Obtenemos el número de contactos almacenados en la lista.

public class Contactos {
    private Map<String, String> contactos;

    public Contactos() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String numero) {
        contactos.put(nombre, numero);
    }

    public String obtenerNumero(String nombre) {
        return contactos.get(nombre);
    }

    public void eliminarContacto(String nombre) {
        contactos.remove(nombre);
    }

    public int numeroDeContactos() {
        return contactos.size();
    }
    
    public static void main(String[] args) {
        // Creamos un objeto de tipo Contactos 
        Contactos m = new Contactos();
        
        // Añadimos elementos a la lista 
        m.agregarContacto("juan", "305");
        m.agregarContacto("carlos", "307");
        m.agregarContacto("pedro", "308");
        m.agregarContacto("javier", "309");
        
        // Obtenemos la cantidad de contactos  
        System.out.println("Numero de contactos: "+m.numeroDeContactos());
        
        // Obtenemos el numero de un contacto en especifico 
        System.out.println("Obteniendo numero de juan: "+m.obtenerNumero("juan"));
        
        // Eliminamos un elemento 
        m.eliminarContacto("pedro");
        
        // Obtenemos la nueva cantidad de contactos despues de haber eliminado uno 
        System.out.println("Obteniendo nuevo numero de contactos despues de eliminar a pedro: "+m.numeroDeContactos());
    }
}


