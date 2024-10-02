import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorHashMap gestor = new GestorHashMap();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese una clave:");
        String claveUsuario = scanner.nextLine();

        int valorUsuario = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Ingrese un valor para la clave '" + claveUsuario + "':");
            if (scanner.hasNextInt()) {
                valorUsuario = scanner.nextInt();  // Leer el valor asociado a la clave
                valorValido = true;  // Valor correcto
            } else {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();  // Limpiar el input inválido
            }
        }


        Scanner.newLine();

        gestor.agregarElemento(claveUsuario, valorUsuario);
        gestor.mostrarHashMap();

        System.out.println("\nPruebas adicionales:");

        System.out.println("Ingrese una clave para buscar su valor:");
        String claveBusqueda = scanner.nextLine();
        int valor = gestor.obtenerValor(claveBusqueda);
        if (valor != -1) {
            System.out.println("El valor asociado a '" + claveBusqueda + "' es: " + valor);
        } else {
            System.out.println("La clave '" + claveBusqueda + "' no se encuentra en el HashMap.");
        }

        System.out.println("Ingrese una clave para verificar si existe:");
        String claveVerificacion = scanner.nextLine();
        boolean contieneClave = gestor.contieneClave(claveVerificacion);
        System.out.println("El HashMap contiene la clave '" + claveVerificacion + "'? " + contieneClave);

        System.out.println("Ingrese una clave para eliminar:");
        String claveEliminacion = scanner.nextLine();
        gestor.eliminarElemento(claveEliminacion);
        gestor.mostrarHashMap();
        scanner.close();
    }
}