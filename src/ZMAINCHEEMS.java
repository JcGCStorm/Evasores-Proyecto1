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

    public String completarCompra() {
        return ditto.completarCompra();
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
                System.out.println("\nNombre de usuario incorrecto, intenta otra vez:");
                System.out.println("Incorrect username, try again:");
                opcionUsuario = scanner.nextLine();
                acceso.contieneUsuario(opcionUsuario);
            } else {
                usuarioBool = true;
                Cliente usuario = acceso.obtenerCliente((opcionUsuario));
                String nacionalidad = usuario.getNacionalidad();
                switch (nacionalidad) {
                    case "Español":
                        main.cambiaVista(new VistaEspanol());
                        System.out.println("\nOstras Perlín, bienvenido " + opcionUsuario);
                        System.out.println("Introduce tu contraseña ostia:");
                        break;
                    case "Mexicano":
                        main.cambiaVista(new VistaMexa());
                        System.out.println("\nKiubo mi buen " + opcionUsuario);
                        System.out.println("Escribe tú contraseña pero en fa:");
                        break;
                    case "Estadounidense":
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
            try {
                int opcion2 = scanner.nextInt();
                Compra catalogo = new Compra(opcionUsuario, main);
                CatalogoProxy catalogoProxy = new CatalogoProxy(catalogo);
                if (opcion2 == 1) {
                    catalogoBool = catalogoProxy.mostrarCatalogo(opcionUsuario, main);
                } else if (opcion2 == 2) {
                    catalogoBool = catalogo.compraProducto(opcionUsuario);
                } else if (opcion2 == 3) {
                    catalogoBool = true;
                } else {
                    System.out.println("No seleccionaste una opción válida ):");
                }
            } catch (Exception e) {
                Cliente usuario = acceso.obtenerCliente((opcionUsuario));
                String nacionalidad = usuario.getNacionalidad();
                switch (nacionalidad) {
                    case "Español":
                        System.out.println("¿Pero que leches?, debes ingresar un valor numerico chaval.");
                        break;
                    case "Mexicano":
                        System.out.println("¿Que pasó master? ¡¡¡Debes ingresar un número!!!");
                        break;
                    case "Estadounidense":
                        main.cambiaVista(new VistaGringo());
                        System.out.println("Error, you must enter an integer.");
                        break;
                    default:
                        System.out.println("No seleccionaste una opción válida ):");
                }
            }
        }
        catalogoBool = true;
        System.out.println(main.despedir());
    }
}
