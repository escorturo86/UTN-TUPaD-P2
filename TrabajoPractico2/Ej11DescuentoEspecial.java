import java.util.*;

public class Ej11DescuentoEspecial {
    private static final double DESCUENTO_ESPECIAL = 0.10; // 10% (variable "global")

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble(sc);
        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + (precio * DESCUENTO_ESPECIAL));
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        return precio - descuentoAplicado;
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