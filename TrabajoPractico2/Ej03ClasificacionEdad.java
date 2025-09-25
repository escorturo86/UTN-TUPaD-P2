import java.util.*;

public class Ej03ClasificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = leerEntero(sc);

        String etapa;
        if (edad < 12) etapa = "Niño";
        else if (edad <= 17) etapa = "Adolescente";
        else if (edad <= 59) etapa = "Adulto";
        else etapa = "Adulto mayor";

        System.out.println("Eres un " + etapa + ".");
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