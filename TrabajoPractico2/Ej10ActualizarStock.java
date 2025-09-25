import java.util.*;

public class Ej10ActualizarStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = leerEntero(sc);
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = leerEntero(sc);
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = leerEntero(sc);
        int nuevo = stock - vendida + recibida; // Fórmula correcta
        System.out.println("El nuevo stock del producto es: " + nuevo);
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine().trim();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Valor inválido. Ingrese un entero: ");
            }
        }
    }
}