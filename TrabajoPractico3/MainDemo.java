package trabajopractico3;

/**
 * Trabajo Práctico 3 - Introducción a la POO
 * Demostración de todas las clases solicitadas: Estudiante, Mascota, Libro,
 * Gallina y NaveEspacial.
 */
public class MainDemo {
    public static void main(String[] args) {
        System.out.println("=== TP3: Introducción a la POO ===");

        // 1) Registro de Estudiantes
        System.out.println("\n[1] Registro de Estudiantes");
        Estudiante est = new Estudiante("Alejandro", "Pereyra", "Programación II", 7.5);
        System.out.println(est.mostrarInfo());
        est.subirCalificacion(1.0);
        est.bajarCalificacion(0.75);
        System.out.println("Luego de ajustes: " + est.mostrarInfo());

        // 2) Registro de Mascotas
        System.out.println("\n[2] Registro de Mascotas");
        Mascota m = new Mascota("Toby", "Perro", 3);
        System.out.println(m.mostrarInfo());
        m.cumplirAnios();
        System.out.println("Tras cumpleaños: " + m.mostrarInfo());

        // 3) Encapsulamiento con Libro
        System.out.println("\n[3] Clase Libro con encapsulamiento");
        Libro libro = new Libro("Clean Code", "Robert C. Martin", 2008);
        try {
            libro.setAnioPublicacion(1200); // inválido
        } catch (IllegalArgumentException ex) {
            System.out.println("Intento inválido de setear año: " + ex.getMessage());
        }
        libro.setAnioPublicacion(2010); // válido
        System.out.println("Libro: " + libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAnioPublicacion() + ")");

        // 4) Gestión de Gallinas
        System.out.println("\n[4] Gestión de Gallinas");
        Gallina g1 = new Gallina("G-001", 1);
        Gallina g2 = new Gallina("G-002", 2);
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        System.out.println(g1.mostrarEstado());
        System.out.println(g2.mostrarEstado());

        // 5) Simulación de Nave Espacial
        System.out.println("\n[5] Simulación de Nave Espacial");
        NaveEspacial nave = new NaveEspacial("Aysa-1", 50.0, 100.0, 1.5); // 50 de combustible, máx 100, consumo 1.5 por unidad de distancia
        nave.despegar();                       // intenta despegar con combustible actual
        nave.avanzar(20);                      // debería alcanzar
        nave.avanzar(30);                      // podría no alcanzar según consumo
        nave.recargarCombustible(40);          // recarga, sin exceder el máximo
        nave.avanzar(25);                      // avanza correctamente
        System.out.println(nave.mostrarEstado());

        System.out.println("\n=== Fin de la demo ===");
    }
}
