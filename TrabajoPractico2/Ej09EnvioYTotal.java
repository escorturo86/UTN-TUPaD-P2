import java.util.*;

public class Ej09EnvioYTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble(sc);
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = leerDouble(sc);
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona inválida. Debe ser 'Nacional' o 'Internacional'.");
            return;
        }
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return 5.0 * peso;
        if (zona.equalsIgnoreCase("Internacional")) return 10.0 * peso;
        return -1.0; // inválido
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    private static double leerDouble(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine().trim().replace(',', '.');
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.print("Valor inválido. Ingrese un número: ");
            }
        }
    }
}