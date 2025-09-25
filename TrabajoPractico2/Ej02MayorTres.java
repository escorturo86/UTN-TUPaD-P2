import java.util.*;

public class Ej02MayorTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = leerEntero(sc);
        System.out.print("Ingrese el segundo número: ");
        int b = leerEntero(sc);
        System.out.print("Ingrese el tercer número: ");
        int c = leerEntero(sc);
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
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