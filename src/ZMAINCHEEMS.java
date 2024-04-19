import java.util.Scanner;

/**
 * Clase ZMAINCHEEMS, es nuestro main, la interacción entre el usuario y
 * el programa, debe dejar escoger si ver catalogo, comprar o salir, de no escoger ninguna
 * cierra el programa. En caso de escoger el catalogo solo te muestra eso y luego te dice si
 * quieres volver al menu principal. En caso de escoger comprar te muestra el catalogo y te
 * deja comprar.
 */
public class ZMAINCHEEMS {
    /**
     * Nuestro objeto que cambiará las vistas.
     */
    private VistaCliente ditto;

    /**
     * El metodo cambiaVista nos ayuda a como su nombre lo indica, escoger
     * una vista según el cliente que deseamos mostrar.
     */
    public void cambiaVista(VistaCliente nuevaVista) {
        ditto = nuevaVista;
    }

    /**
     * El metodo saludar() manda a llamar al metodo mostrarSaludo según
     * la vista que tenga el ditto, es decir saluda según el idioma del
     * cliente
     * @return el saludo al cliente.
     */
    public String saludar() {
        return ditto.mostrarSaludo();
    }

    /**
     * El metodo despedir() manda a llamar al metodo mostrarDespedida() según
     * la vista que tenga el ditto, es decir saluda según el idioma del
     * cliente
     * @return la despedida al cliente.
     */
    public String despedir() {
        return ditto.mostrarDespedida();
    }

    /**
     * El metodo opciones() manda a llamar al metodo opciones() según
     * la vista que tenga el ditto, es decir muestra las opciones del catalogo
     * según el idioma del cliente
     * @return las opciones del menu del cliente.
     */
    public String opciones() {
        return ditto.opciones();
    }

    /**
     * El metodo opcionesCatalogo() manda a llamar al metodo opcionesCatalogo() 
     * según la vista que tenga el ditto, es decir muestra las opciones del catalogo
     * según el idioma del cliente
     * @return las opciones del catalogo.
     */
    public String opcionesCatalogo() {
        return ditto.opcionesCatalogo();
    }

     /**
     * El metodo completarCompra() manda a llamar al metodo completarCompra() 
     * según la vista que tenga el ditto, es decir muestra la forma de terminar
     * la compra según el idioma del cliente
     * @return la instrucciones para completar la compra
     */
    public String completarCompra() {
        return ditto.completarCompra();
    }

     /**
     * El metodo darFechaEntrega() manda a llamar al metodo darFechaEntrega() 
     * según la vista que tenga el ditto, es decir muestra la fecha de entrega 
     * de los productos según el idioma del cliente.
     * @return la fecha de entrega de los productos.
     */
    public String darFechaEntrega() {
        return ditto.darFechaEntrega();
    }

    public static void main(String[] args) {
        // Iniciamos una instancia del main para poder usar los metodos anteriores.
        ZMAINCHEEMS main = new ZMAINCHEEMS();
        // iniciamos una instancia de la clase que nos da el acceso al programa
        AccesoPrograma acceso = new AccesoPrograma();

        Scanner scanner = new Scanner(System.in);
// Esto solo es tal cuál para que se vea bonito
        System.out.println("\u001B[33m╔══════════════════════════╗");
        System.out.println("║       Bienvenido a       ║");
        System.out.println("║        \u001B[32mCheemSmart \u001B[33m       ║");
        System.out.println("╚══════════════════════════╝\u001B[0m");
        System.out.println("Por favor, introduzca su usuario:");
        System.out.println("Please enter your username:");
        String opcionUsuario = scanner.nextLine();

        /**
         * Busca el nombre en los clientes en el arreglo de AccesoPrograma 
         *  según lo que le escribamos en la terminal, de no encontrar al cliente
         * nos dice que el nombre de usuario es incorrecto en ambos idiomas pues no sabemos
         * aún la nacionalidad del cliente. Una vez verificamos que el cliente existe 
         * pedimos la contraseña del mismo.
         * */ 
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

                /**
                 * Esta es la parte que recibe la contraseña desde la terminal y la 
                 * compara con la contraseña del cliente, de ser correcta avanzamos, de no
                 * serlo se repite el bucle.
                 */
                String opcionContrasena = scanner.nextLine();
                Boolean contrasenaBool = false;
                while (contrasenaBool == false) {
                    contrasenaBool = acceso.contrasenaCorrecta(opcionUsuario, opcionContrasena);
                }
            }
        }

        /**
         * Switch con las opciones posibles del menu, crea un objeto de la Clase Compra
         * y manda a llamar al metodo especifico según lo que escriba el cliente, 1 para
         * ver el catalogo, 2 para comprar y 3 para salir, cada opcion aparece en el idioma
         * del cliente. El catalogo no se muestra directamente al cliente, mandamos a llamar 
         * a su proxy, además si le pasamos cualquier cosa que no sea un numero cerrará el
         * programa.
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
                        System.out.println("         ###### Cerrando el Programa ######");
                      catalogoBool = true;
                        break;
                    case "Mexicano":
                        System.out.println("¿Que pasó master? ¡¡¡Debes ingresar un número!!!");
                        System.out.println("         ###### Cerrando el Programa ######");
                        catalogoBool = true;
                        break;
                    case "Estadounidense":
                        main.cambiaVista(new VistaGringo());
                        System.out.println("Error, you must enter an integer.");
                        System.out.println("         ###### Cerrando el Programa ######");
                        catalogoBool = true;
                        break;
                    case "cancelado":
                        catalogoBool = true;
                    
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
