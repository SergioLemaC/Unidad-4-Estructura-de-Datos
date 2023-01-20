package LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Creamos una clase que tiene un atributo privado de tipo LinkedHashMap<String, Libro> para almacenar los libros. 
// Esta clase contiene metodos para añadir, obtener, eliminar y obtener cantidad de libros 
// Creamos una instancia de esta clase llamada biblioteca  
// Creamos diferentes instancias de libros 
// Añadimos libros a la biblioteca 
// Obtenemos la cantidad de libros almacenados en la biblioteca 
// Obtenemos un libro específico 
// Eliminamos un libro. 
// Obtenemos cantidad de libros almacenados en la biblioteca despeus de haber eliminado uno.

public class Main {
    private Map<String, Libro> libros;

    public Main() {
        libros = new LinkedHashMap<>();
    }

    public void agregarLibro(Libro libro) {
        libros.put(libro.getTitulo(), libro);
    }

    public Libro obtenerLibro(String titulo) {
        return libros.get(titulo);
    }

    public void eliminarLibro(String titulo) {
        libros.remove(titulo);
    }

    public int numeroDeLibros() {
        return libros.size();
    }
    
    public static void main(String[] args) {
        // Creamos una instancia 
        Main biblioteca = new Main();
        
        // Creamos instancias de libros 
        Libro l1 = new Libro("100 años de soledad");
        Libro l2 = new Libro("Padre rico, padre pobre");
        Libro l3 = new Libro("El monje que vendio su ferrarri");
        Libro l4 = new Libro("Paz, armonia y calma");
        
        
        // Añadimos libros 
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        
        // Obtenemos cantidad de libros almacenados 
        System.out.println("Cantidad de libros almacenados: "+biblioteca.numeroDeLibros());
        
        // Obtenemos un libro en especifico 
        System.out.println("El libro 3 es: "+biblioteca.obtenerLibro("El monje que vendio su ferrarri").getTitulo());
        
        // Eliminamos un libro 
        String eliminar = "El monje que vendio su ferrarri";
        biblioteca.eliminarLibro(eliminar);
        
        // Obtenemos cantidad de libros almacenados despues de haber eliminado uno 
        System.out.println("Cantidad de libros despues de haber eliminado uno: "+biblioteca.numeroDeLibros());
    }
}


