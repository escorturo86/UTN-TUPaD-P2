import java.util.*;

public class Ej04DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble(sc);
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.nextLine().trim().toUpperCase();

        double porcentaje;
        switch (cat) {
            case "A" -> porcentaje = 10;
            case "B" -> porcentaje = 15;
            case "C" -> porcentaje = 20;
            default -> {
                System.out.println("Categoría inválida.");
                return;
            }
        }
        double descuento = precio * (porcentaje / 100.0);
        double finalP = precio - descuento;
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + finalP);
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