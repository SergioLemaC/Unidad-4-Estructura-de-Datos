package Arrays;
import java.util.Arrays;

// Crea un arreglo de numeros enteros 
// Usamos el metodo sort de la clase Arrays para ordenar los elementos del arreglo. 
// Usamos el metodo toString transformar a un string el arreglo y imprimir el arreglo.

public class Main {
    public static void main(String[] args) {
        int[] numeros = {3, 1, 4, 2};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros)); 
    }
}
