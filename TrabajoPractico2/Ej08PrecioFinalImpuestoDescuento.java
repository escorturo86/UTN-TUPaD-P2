import java.util.*;

public class Ej08PrecioFinalImpuestoDescuento {
    public static void voidMain(String[] args) {} // placeholder to help some IDEs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double base = leerDouble(sc);
        System.out.print("Ingrese el impuesto en porcentaje (Ej.: 10 para 10%): ");
        double imp = leerDouble(sc);
        System.out.print("Ingrese el descuento en porcentaje (Ej.: 5 para 5%): ");
        double desc = leerDouble(sc);
        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + total);
    }

    static double calcularPrecioFinal(double precioBase, double impuestoPorc, double descuentoPorc) {
        double impuesto = precioBase * (impuestoPorc / 100.0);
        double descuento = precioBase * (descuentoPorc / 100.0);
        return precioBase + impuesto - descuento;
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