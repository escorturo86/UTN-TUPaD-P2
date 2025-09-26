package trabajopractico3;

/**
 * 1. Registro de Estudiantes
 * Atributos: nombre, apellido, curso, calificación.
 * Métodos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; // Se asume escala 0..10

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        setNombre(nombre);
        setApellido(apellido);
        setCurso(curso);
        setCalificacion(calificacion);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre;
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if (apellido == null || apellido.isBlank()) throw new IllegalArgumentException("Apellido inválido");
        this.apellido = apellido;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()) throw new IllegalArgumentException("Curso inválido");
        this.curso = curso;
    }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) throw new IllegalArgumentException("Calificación fuera de rango (0..10)");
        this.calificacion = calificacion;
    }

    public String mostrarInfo() {
        return String.format("Estudiante[nombre=%s, apellido=%s, curso=%s, calificación=%.2f]",
                             nombre, apellido, curso, calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos < 0) throw new IllegalArgumentException("Los puntos deben ser positivos");
        setCalificacion(Math.min(10, calificacion + puntos));
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) throw new IllegalArgumentException("Los puntos deben ser positivos");
        setCalificacion(Math.max(0, calificacion - puntos));
    }
}
