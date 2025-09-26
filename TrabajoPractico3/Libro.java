package trabajopractico3;

/**
 * 3. Clase Libro (encapsulada)
 * Atributos privados: titulo, autor, anioPublicacion.
 * Getters para todos; setter con validación para anioPublicacion.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título inválido");
        this.titulo = titulo;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) {
        if (autor == null || autor.isBlank()) throw new IllegalArgumentException("Autor inválido");
        this.autor = autor;
    }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) {
        int currentYear = 2025;
        if (anioPublicacion < 1450 || anioPublicacion > currentYear)
            throw new IllegalArgumentException("Año de publicación inválido (1450.." + currentYear + ")");
        this.anioPublicacion = anioPublicacion;
    }
}
