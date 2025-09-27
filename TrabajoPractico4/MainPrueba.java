package trabajopractico4;

public class MainPrueba {
    public static void main(String[] args) {
        System.out.println("=== TP4: Sistema de Gestión de Empleados ===");

        Empleado e1 = new Empleado(1001, "Ana Gómez", "Desarrolladora", 850000.0);
        Empleado e2 = new Empleado("Luis Pérez", "Analista");
        e2.setSalario(650000.0);
        Empleado e3 = new Empleado("Carla López", "QA");
        e3.setSalario(520000.0);

        e1.actualizarSalario(10);
        e2.actualizarSalario(50000.0, true);
        e3.actualizarSalario(-5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
