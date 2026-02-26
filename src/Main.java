import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Pila pila = new Pila(5);
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;

        do {
            imprimirMenu();
            opcion = leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);

    }

    public static void imprimirMenu() {
        System.out.println("""
                -1. Llamar rutina
                -2. Terminar rutina
                -3. Rutina actual
                -4. Mostrar pila
                -0. Salir""");
    }

    public static int leerOpcion() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static void procesarOpcion(int opcion) throws IOException {

        switch (opcion) {
            case 1 -> pila.llamarRutina();
            case 2 -> pila.terminarRutina();
            case 3 -> pila.rutinaActual();
            case 4 -> pila.mostrarPila();
            case 0 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Valor invalido!");
        }
    }
}
