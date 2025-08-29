/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Operaciones {
    // Pido dos enteros y hago suma, resta, multi y división
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá el primer número (entero): ");
        int a = sc.nextInt();

        System.out.print("Ingresá el segundo número (entero): ");
        int b = sc.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

 
        if (b != 0) {
            int divisionEntera = a / b; // división entera
            System.out.println("División (entera): " + divisionEntera);
        } else {
            System.out.println("División: no se puede dividir por cero");
        }

        sc.close();
    }
}
