package trabajopractico3;

/**
 * 4. Gestión de Gallinas
 * Atributos: idGallina, edad, huevosPuestos.
 * Métodos: ponerHuevo(), envejecer(), mostrarEstado().
 */
public class Gallina {
    private String idGallina;
    private int edad;           // años
    private int huevosPuestos;  // acumulado

    public Gallina(String idGallina, int edad) {
        setIdGallina(idGallina);
        setEdad(edad);
        this.huevosPuestos = 0;
    }

    public String getIdGallina() { return idGallina; }
    public void setIdGallina(String idGallina) {
        if (idGallina == null || idGallina.isBlank()) throw new IllegalArgumentException("ID inválido");
        this.idGallina = idGallina;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0 || edad > 30) throw new IllegalArgumentException("Edad de gallina inválida");
        this.edad = edad;
    }

    public int getHuevosPuestos() { return huevosPuestos; }

    public void ponerHuevo() { this.huevosPuestos += 1; }
    public void envejecer() { this.edad += 1; }

    public String mostrarEstado() {
        return String.format("Gallina[id=%s, edad=%d, huevosPuestos=%d]", idGallina, edad, huevosPuestos);
    }
}
