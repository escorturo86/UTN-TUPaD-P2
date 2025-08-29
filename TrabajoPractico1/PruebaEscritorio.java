/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class PruebaEscritorio {
    // Muestra el resultado de dividir 5 entre 2 usando enteros
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}

/*
¿Por qué da 2?
Porque a y b son int. En Java, int/int hace división ENTERA y descarta los decimales.
Si quisieras 2.5, tendrías que usar double, por ejemplo:
double r = 5.0 / 2; // 2.5
*/
