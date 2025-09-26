package trabajopractico3;

/**
 * 5. Simulación de Nave Espacial
 * Atributos: nombre, combustible (estado), capacidad máxima y consumo por unidad de distancia.
 * Métodos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
 * Reglas: validar combustible antes de avanzar y no superar el máximo al recargar.
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;       // estado actual
    private double capacidadMaxima;   // límite de tanque
    private double consumoPorDist;    // combustible por unidad de distancia
    private boolean enVuelo = false;
    private double distanciaRecorrida = 0.0;

    public NaveEspacial(String nombre, double combustibleInicial, double capacidadMaxima, double consumoPorDist) {
        if (capacidadMaxima <= 0) throw new IllegalArgumentException("Capacidad máxima inválida");
        if (consumoPorDist <= 0) throw new IllegalArgumentException("Consumo inválido");
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.consumoPorDist = consumoPorDist;
        if (combustibleInicial < 0 || combustibleInicial > capacidadMaxima) {
            throw new IllegalArgumentException("Combustible inicial fuera de rango");
        }
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        if (combustible <= 0) {
            System.out.println("No hay combustible para despegar");
            return;
        }
        if (!enVuelo) {
            enVuelo = true;
            System.out.println("[" + nombre + "] Despegó con " + combustible + " unidades de combustible.");
        } else {
            System.out.println("[" + nombre + "] Ya está en vuelo.");
        }
    }

    public boolean avanzar(double distancia) {
        if (distancia <= 0) return false;
        double requerido = distancia * consumoPorDist;
        if (requerido > combustible) {
            System.out.println("[" + nombre + "] Combustible insuficiente para avanzar " + distancia + " (requiere " + requerido + ").");
            return false;
        }
        combustible -= requerido;
        distanciaRecorrida += distancia;
        System.out.println("[" + nombre + "] Avanzó " + distancia + ". Combustible restante: " + combustible);
        return true;
    }

    public boolean recargarCombustible(double cantidad) {
        if (cantidad <= 0) return false;
        if (combustible + cantidad > capacidadMaxima) {
            System.out.println("[" + nombre + "] No se puede superar el máximo (" + capacidadMaxima + "). Recargando hasta el tope.");
            combustible = capacidadMaxima;
            return true;
        }
        combustible += cantidad;
        System.out.println("[" + nombre + "] Recargó " + cantidad + ". Combustible actual: " + combustible);
        return true;
    }

    public String mostrarEstado() {
        return String.format("Nave[nombre=%s, enVuelo=%s, combustible=%.2f/%.2f, consumo=%.2f, distanciaRecorrida=%.2f]",
                              nombre, enVuelo, combustible, capacidadMaxima, consumoPorDist, distanciaRecorrida);
    }
}
