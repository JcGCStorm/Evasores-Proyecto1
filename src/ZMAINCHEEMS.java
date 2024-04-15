import java.util.ArrayList;
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
        // creacion de cliente
        AccesoPrograma acceso = new AccesoPrograma();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[33m╔══════════════════════════╗");
        System.out.println("║       Bienvenido a       ║");
        System.out.println("║        \u001B[32mCheemSmart \u001B[33m       ║");
        System.out.println("╚══════════════════════════╝\u001B[0m");
        System.out.println("Por favor, introduzca su usuario.");
        String opcionUsuario = scanner.nextLine();
        // Buscar el nombre en los clientes
        boolean usuarioBool = false;
        while (usuarioBool == false) {
            if (acceso.contieneUsuario(opcionUsuario) == false) {
                opcionUsuario = scanner.nextLine();
                acceso.contieneUsuario(opcionUsuario);
            } else {
                usuarioBool = true;
            }
        }

        System.out.println("Bienvenido: " + opcionUsuario);
        System.out.println("Por favor, introduzca su contraseña.");
        String opcionContrasena = scanner.nextLine();
        Boolean contrasenaBool = false;
        while (contrasenaBool == false) {
            if (acceso.contieneContrasena(opcionContrasena) == false) {
                opcionContrasena = scanner.nextLine();
                acceso.contieneContrasena(opcionContrasena);
            } else {
                contrasenaBool = true;
            }
        }
        /**
         * Switch con las opciones posibles del menu, crea un objeto de la Clase Prepara
         * y manda a llamar al metodo especifico que nos ayuda a escoger cada alimento.
         */
        switch (opcionUsuario) {
            case "CdeCiencia":
                main.cambiaVista(new VistaEspanol());
                System.out.println(main.mostrarVista());
                break;
            case "JuanHorse938":
                main.cambiaVista(new VistaMexa());
                System.out.println(main.mostrarVista());
                break;
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.mostrarVista());
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }

        int opcion2 = scanner.nextInt();
        switch (opcion2) {
            case 1:
                Compra preparab = new Compra();
                preparab.compraProducto();
                break;
            case 2:
                System.out.println("Gracias por visitarnos!! Ojalá no vuelvas");
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
    }
}