import java.util.Scanner;

/**
 * Clase WaySub, es nuestro main, la interacción entre el usuario y
 * el programa, debe dejar escoger entre pizza o Baguette, de ser
 * Baguette te muestra los ingredientes y cuántos deseas ponerle,
 * en caso contrario te muestra las pizzas y te da a escoger una.
 */
public class ZMAINCHEEMS {
    private VistaCliente ditto;

    private void cambiaVista(VistaCliente nuevaVista) {
        ditto = nuevaVista;
    }

    public String mostrarVista() {
        return ditto.mostrarInterfaz();
    }

    public static void main(String[] args) {
        ZMAINCHEEMS main = new ZMAINCHEEMS();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[33m╔══════════════════════════╗");
        System.out.println("║       Bienvenido a       ║");
        System.out.println("║        \u001B[32mCheemSmart \u001B[33m         ║");
        System.out.println("╚══════════════════════════╝\u001B[0m");
        System.out.println("Por favor escoja su nacionalidad.");
        System.out.println("1. Español.    2. Gringo");
        int opcion = scanner.nextInt();

        /**
         * Switch con las opciones posibles del menu, crea un objeto de la Clase Prepara
         * y manda a llamar al metodo especifico que nos ayuda a escoger cada alimento.
         */
        switch (opcion) {
            case 1:
                main.cambiaVista(new VistaEspanol());
                System.out.println(main.mostrarVista()); // Hola
                break;
            case 2:
                main.cambiaVista(new VistaGringo());
                System.out.println(main.mostrarVista()); // Quancha
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }

        int opcion2 = scanner.nextInt();
        switch (opcion2) {
            case 1:
                Compra preparab = new Compra();
                preparab.preparaProducto();
                break;
            case 2:
                System.out.println("Gracias por visitarnos!! Ojalá no vuelvas");
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
    }
}