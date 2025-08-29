/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class ErrorEjemploCorregido {
    // El error era usar nextInt() para leer un String (el nombre).
    // Lo correcto es usar nextLine() para texto.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ahora sí, leo texto
        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}