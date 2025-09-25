public class Ej13ArrayPreciosRecursivo {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    static void imprimirArrayRecursivo(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirArrayRecursivo(arr, i + 1);
    }
}