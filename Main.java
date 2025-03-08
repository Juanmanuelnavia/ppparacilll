

public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5);

       
        Libro libro2 = new Libro();
        
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);

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

       
        System.out.println("\nEstado actual del libro 1: " + libro1);
        
        scanner.close();
    }
}
