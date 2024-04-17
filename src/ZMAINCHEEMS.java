import java.util.Scanner;

/**
 * Clase WaySub, es nuestro main, la interacción entre el usuario y
 * el programa, debe dejar escoger entre pizza o Baguette, de ser
 * Baguette te muestra los ingredientes y cuántos deseas ponerle,
 * en caso contrario te muestra las pizzas y te da a escoger una.
 */
public class ZMAINCHEEMS {
    private VistaCliente ditto;

    public void cambiaVista(VistaCliente nuevaVista) {
        ditto = nuevaVista;
    }

    public String saludar() {
        return ditto.mostrarSaludo();
    }

    public String despedir() {
        return ditto.mostrarDespedida();
    }

    public String opciones() {
        return ditto.opciones();
    }

    public String opcionesCatalogo() {
        return ditto.opcionesCatalogo();
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
        System.out.println("Por favor, introduzca su usuario:");
        System.out.println("Please enter your username:");
        String opcionUsuario = scanner.nextLine();
        // Buscar el nombre en los clientes
        boolean usuarioBool = false;
        while (usuarioBool == false) {
            if (acceso.contieneUsuario(opcionUsuario) == false) {
                opcionUsuario = scanner.nextLine();
                acceso.contieneUsuario(opcionUsuario);
            } else {
                usuarioBool = true;
                switch (opcionUsuario) {
                    case "CdeCiencia":
                        main.cambiaVista(new VistaEspanol());
                        System.out.println("\nOstras Perlín, bienvenido " + opcionUsuario);
                        System.out.println("Introduce tu contraseña ostia:");
                        break;
                    case "JuanHorse938":
                        main.cambiaVista(new VistaMexa());
                        System.out.println("\nKiubo mi buen " + opcionUsuario);
                        System.out.println("Escribe tú contraseña pero en fa:");
                        break;
                    case "Arthur":
                        main.cambiaVista(new VistaGringo());
                        System.out.println("\nWelcome dear " + opcionUsuario);
                        System.out.println("Enter your password please:");
                        break;
                    default:
                        System.out.println("No seleccionaste una opción válida ):");
                }

                String opcionContrasena = scanner.nextLine();
                Boolean contrasenaBool = false;
                while (contrasenaBool == false) {
                    contrasenaBool = acceso.contrasenaCorrecta(opcionUsuario, opcionContrasena);
                }
            }
        }

        /**
         * Switch con las opciones posibles del menu, crea un objeto de la Clase Prepara
         * y manda a llamar al metodo especifico que nos ayuda a escoger cada alimento.
         */

        Boolean catalogoBool = false;
        while (catalogoBool == false) {
            System.out.println(main.saludar());
            System.out.println(main.opciones());
            int opcion2 = scanner.nextInt();
            if (opcion2 == 1) {
                Compra catalogo = new Compra();
                catalogoBool = catalogo.mostrarCatalogo(opcionUsuario, main);
            } else if (opcion2 == 2) {
                Compra preparab = new Compra();
                catalogoBool = preparab.compraProducto(opcionUsuario);
            } else if (opcion2 == 3) {
                catalogoBool = true;
            } else {
                System.out.println("No seleccionaste una opción válida ):");
            }
        }
        main.despedir();
    }
}