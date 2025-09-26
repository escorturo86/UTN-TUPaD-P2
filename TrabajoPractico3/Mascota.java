package trabajopractico3;

/**
 * 2. Registro de Mascotas
 * Atributos: nombre, especie, edad.
 * Métodos: mostrarInfo(), cumplirAnios().
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre;
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) throw new IllegalArgumentException("Especie inválida");
        this.especie = especie;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) throw new IllegalArgumentException("Edad inválida");
        this.edad = edad;
    }

    public void cumplirAnios() { this.edad += 1; }

    public String mostrarInfo() {
        return String.format("Mascota[nombre=%s, especie=%s, edad=%d]", nombre, especie, edad);
    }
}
