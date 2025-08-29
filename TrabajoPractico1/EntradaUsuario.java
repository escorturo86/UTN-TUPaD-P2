/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class EntradaUsuario {
    // Le pido nombre y edad al usuario y los muestro
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá tu nombre: ");
        String nombre = scanner.nextLine(); // leo texto

        System.out.print("Ingresá tu edad: ");
        int edad = scanner.nextInt(); // leo entero

        System.out.println("Hola " + nombre + ", tenés " + edad + " años.");
        scanner.close(); // cierro el Scanner
    }
}
