/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Conversiones {
    // a) División con int
    // b) División con double para comparar resultados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== División con int ===");
        System.out.print("Ingresá un entero A: ");
        int a = sc.nextInt();
        System.out.print("Ingresá un entero B: ");
        int b = sc.nextInt();

        if (b != 0) {
            int divisionEntera = a / b;
            System.out.println("Resultado (int): " + divisionEntera);
        } else {
            System.out.println("No se puede dividir por cero (int).");
        }

        System.out.println("\n=== División con double ===");
        System.out.print("Ingresá un número (puede ser decimal) A: ");
        double da = sc.nextDouble();
        System.out.print("Ingresá un número (puede ser decimal) B: ");
        double db = sc.nextDouble();

        if (db != 0) {
            double divisionReal = da / db;
            System.out.println("Resultado (double): " + divisionReal);
        } else {
            System.out.println("No se puede dividir por cero (double).");
        }

        sc.close();
    }
}
