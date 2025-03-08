import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un libro con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5);

        // Crear un libro con el constructor por defecto
        Libro libro2 = new Libro();
        
        // Mostrar datos de los libros
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);

        // Probar los métodos de préstamo y devolución
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIntentando prestar un libro...");
        if (libro1.prestar()) {
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }

        System.out.println("\nIntentando devolver un libro...");
        if (libro1.devolver()) {
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("No se puede devolver, no hay libros prestados.");
        }

        // Mostrar información actualizada de libro1
        System.out.println("\nEstado actual del libro 1: " + libro1);
        
        scanner.close();
    }
}
