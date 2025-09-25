import java.util.*;

public class Ej06ContadorPNCFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int x = leerEntero(sc);
            if (x > 0) positivos++;
            else if (x < 0) negativos++;
            else ceros++;
        }
        System.out.println("Resultados:\nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
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