import java.util.Iterator;
import java.util.Scanner;
import java.io.Serializable;

/**
 * La clase Compra lleva toda la logistica de la compra, agregar objetos al carrito,
 * pagar, mostrar el catalogo normal, y mostrar el catalogo de Compra.
 */
public class Compra implements Serializable, CatalogoRemoto {
    /**
     * Creamos las instancias necesarias para el funcionamiento correcto
     * del programa.
     */
    Scanner scanner = new Scanner(System.in);
    ZMAINCHEEMS main = new ZMAINCHEEMS();
    AccesoPrograma acceso = new AccesoPrograma();
    CuentaBancariaProxy cuentaProxy;

    /**
     * Constructor de la clase Compra
     */
    public Compra(String opcionUsuario, ZMAINCHEEMS main) {

    }

   /**
    * Realiza una compra de productos según la opción seleccionada por el usuario.
    * Este es parte de nuestro decorator ya que imprime los objetos que compramos 
    * junto al catalogo.
    * @param opcionUsuario La opción seleccionada por el usuario.
    * @return true si la compra se realizó con éxito, false si la compra fue cancelada o no se pudo completar.
    */
    public Boolean compraProducto(String opcionUsuario) {
        Productos producto;
        producto = new Carrito();
        if (producto != null) {
            boolean ponmeMas = true;
            Compra compra = new Compra(opcionUsuario, main);
            CatalogoProxy catalogoRemoto = new CatalogoProxy(compra);
            while (ponmeMas) {
                catalogoRemoto.catalogoCompra();
                try {
                    int productoEleccion = scanner.nextInt();
                    if (productoEleccion == 0) {
                        ponmeMas = false;
                    } else {
                        switch (productoEleccion) {
                            case 1938:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado Lechuga a tu carrito.");
                                break;
                            case 1672:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado Jitomate a tu carrito.");
                                break;
                            case 1849:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado Manzana a tu carrito.");
                                break;
                            case 2093:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una TV Hisense a tu carrito.");
                                break;
                            case 2021:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una Nintendo Zwitch a tu carrito.");
                                break;
                            case 2982:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una Laptop HP a tu carrito.");
                                break;
                            case 3956:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una Lavadora Midea a tu carrito.");
                                break;
                            case 3257:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una Ventilador de Piso Taurus a tu carrito.");
                                break;
                            case 3212:
                                producto = agregarProductos(productoEleccion, producto);
                                System.out.println("Se ha agregado una Combo Oster 4 Elementos a tu carrito.");
                                break;
                            case 10:
                                opcionUsuario = "cancelado";
                                imprimirTicket(producto, opcionUsuario);
                                return false;
                            case 0:
                                ponmeMas = false;
                            default:
                                System.out.println("No seleccionaste una opción válida ):");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Debes ingresar el número del codigo de barras, no debes ingresar letras.");
                    System.out.println("You must enter the number of the barcode, you must not enter letters");
                    opcionUsuario = "cancelado";
                    ponmeMas = false;
                }
            }
            Cliente usuario = acceso.obtenerCliente((opcionUsuario));
            String nacionalidad = usuario.getNacionalidad();
            switch (nacionalidad) {
                case "Estadounidense":
                    ZMAINCHEEMS mainAr = new ZMAINCHEEMS();
                    mainAr.cambiaVista(new VistaGringo());
                    System.out.println(mainAr.completarCompra());
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("yes")) {
                        return pagar(producto, opcionUsuario);
                    } else if (respuesta.equalsIgnoreCase("no")) {
                        System.out.println("purchase cancelled.");
                        return false;
                    } else {
                        System.out.println("it's so difficult to put Yes or no?");
                        return false;
                    }
                case "Mexicano":
                    ZMAINCHEEMS mainJu = new ZMAINCHEEMS();
                    mainJu.cambiaVista(new VistaMexa());
                    System.out.println(mainJu.completarCompra());
                    String respuestaJ = scanner.next();
                    if (respuestaJ.equalsIgnoreCase("simon")) {
                        return pagar(producto, opcionUsuario);
                    } else if (respuestaJ.equalsIgnoreCase("nel")) {
                        System.out.println("Chales, cancelaste tu compra.");
                        return false;
                    } else {
                        System.out.println("¿simon o nel? No es tan dificil escribir.");
                        return false;
                    }
                case "Español":
                    ZMAINCHEEMS mainCd = new ZMAINCHEEMS();
                    mainCd.cambiaVista(new VistaEspanol());
                    System.out.println(mainCd.completarCompra());
                    String respuestaEs = scanner.next();
                    if (respuestaEs.equalsIgnoreCase("sip")) {
                        return pagar(producto, opcionUsuario);
                    } else if (respuestaEs.equalsIgnoreCase("nop")) {
                        System.out.println("Compra cancelada.");
                        return false;
                    } else {
                        System.out.println("¿Para que pides entonces? Eso no se hace tio :(.");
                        return false;
                    }
                case "cancelado":
                     return false;
                default:
                    break;
            }

        }
        return false;
    }

    /**
     * Realiza el proceso de pago de los productos que envuelven el carrito para un cliente.
     *
     * @param producto         El producto a pagar.
     * @param opcionUsuario La opción de usuario asociada al cliente que realiza la compra.
     * @return true si el pago se realiza con éxito, false si el pago no se puede completar.
     */
    public Boolean pagar(Productos producto, String opcionUsuario) {
        AccesoPrograma accesoPrograma = new AccesoPrograma();
        Cliente cliente = accesoPrograma.obtenerCliente((opcionUsuario));
        if (cliente == null) {
            System.out.println("Usuario no encontrado / User not found");
            return false;
        }

        if (cliente.getNacionalidad().equals("Mexicano")) {

            double total = producto.getPrecio();
            System.out.println("\n   ---Bienvenido a la pantalla de CompraSegura, danos todo tú dinero.---");
            System.out.println("Orale, tu total a pagar es de: $" + total + "\n");
            System.out.println("Ingresa nuevamente la contraseña de tu usuario de la tienda: ");
            String contrasena = scanner.next();

            if (contrasena.equals(cliente.getContrasena())) {

                cuentaProxy = new CuentaBancariaProxy(cliente.getCuentaBancaria());

                if (cuentaProxy.getSaldo() >= total) {
                    System.out.println("\nIngrese la clave de tu cuenta porfa: ");
                    String clave = scanner.next();
                    cuentaProxy.setClave(clave);

                    if (cuentaProxy.verificarClave()) {
                        cuentaProxy.realizarPago(total);
                        System.out.println("\nPago realizado exitosamente, requetebien.");
                        cuentaProxy.actualizarSaldo(cuentaProxy.getSaldo());
                        System.out.println("Te quedan un total de $:" + cuentaProxy.getSaldo() + " pejecoins");
                        ZMAINCHEEMS main = new ZMAINCHEEMS();
                        main.cambiaVista(new VistaMexa());
                        System.out.println(main.darFechaEntrega());
                        return imprimirTicket(producto, opcionUsuario);
                    } else {
                        System.out.println("Chale, parece que te equivocaste");

                    }

                } else {
                    System.out.println("Saldo insuficiente en tu cuenta bancaria.");
                    return false;
                }
                return false;
            } else {
                System.out.println("Chin, contraseña de usuario incorrecta.");
                return false;
            }

        }

        if (cliente.getNacionalidad().equals("Español")) {
            System.out.println("\n   ---Bienvenido a la pantalla de CompraSegura hermano Español.---");
            double total = producto.getPrecio();
            System.out.println("Ostras, tu total a pagar es de: $" + total + "\n");
            System.out.println("Ingresa nuevamente la contraseña de tu usuario de la tienda: ");
            String contrasena = scanner.next();

            if (contrasena.equals(cliente.getContrasena())) {

                cuentaProxy = new CuentaBancariaProxy(cliente.getCuentaBancaria());

                if (cuentaProxy.getSaldo() >= total) {
                    System.out.println("\n Ingrese la clave de tu cuenta: ");
                    String clave = scanner.next();
                    cuentaProxy.setClave(clave);

                    if (cuentaProxy.verificarClave()) {
                        cuentaProxy.realizarPago(total);
                        System.out.println("\n Pago realizado exitosamente, que guay.");
                        cuentaProxy.actualizarSaldo(cuentaProxy.getSaldo());
                        System.out.println("Su saldo actual es de: $" + cuentaProxy.getSaldo());
                        ZMAINCHEEMS main = new ZMAINCHEEMS();
                        main.cambiaVista(new VistaEspanol());
                        System.out.println(main.darFechaEntrega());
                        return imprimirTicket(producto, opcionUsuario);
                    } else {
                        System.out.println("Que lío, parece que te equivocaste");

                    }

                } else {
                    System.out.println("Saldo insuficiente en tu cuenta bancaria.");
                    return false;
                }
                return false;
            } else {
                System.out.println("Chin, contraseña de usuario incorrecta.");
                return false;
            }

        }

        if (cliente.getNacionalidad().equals("Estadounidense")) {
            System.out.println("\n   ---Welcome to the SafeShop screen---");
            double total = producto.getPrecio();
            System.out.println("Your total to pay is: $" + total + "\n");
            System.out.println("Enter your store user password again:");
            String contrasena = scanner.next();

            if (contrasena.equals(cliente.getContrasena())) {

                cuentaProxy = new CuentaBancariaProxy(cliente.getCuentaBancaria());

                if (cuentaProxy.getSaldo() >= total) {
                    System.out.println("\nEnter your account password: ");
                    String clave = scanner.next();
                    cuentaProxy.setClave(clave);

                    if (cuentaProxy.verificarClave()) {
                        cuentaProxy.realizarPago(total);
                        System.out.println("\nPayment made successfully");
                        cuentaProxy.actualizarSaldo(cuentaProxy.getSaldo());
                        System.out.println("Your current balance is: $" + cuentaProxy.getSaldo());
                        ZMAINCHEEMS main = new ZMAINCHEEMS();
                        main.cambiaVista(new VistaGringo());
                        System.out.println(main.darFechaEntrega());
                        return imprimirTicket(producto, opcionUsuario);
                    } else {
                        System.out.println("What a mess, it seems you were wrong");

                    }

                } else {
                    System.out.println("Insufficient balance in your bank account.");
                    return false;
                }
                return false;
            } else {
                System.out.println("Incorrect user password.");
                return false;
            }

        }
        return false;
    }

    /**
     * Imprime el catalogo de la compra, utiliza catalogos individuales para cada
     * departamento, ya sea electronica, electrodomesticos o frutas y verduras, este
     * es el metodo real que manda a llamar ek proxy.
     */
    public void catalogoCompra() {
        CatalogoElectrodom electrodom = new CatalogoElectrodom();
        CatalogoElectronica electronica = new CatalogoElectronica();
        CatalogoFrutasYVer frutasYVer = new CatalogoFrutasYVer();
        System.out.println("================================== Catalogo ==========================================");
        System.out.println("Gracias por comprar con nosotros, espero encuentre todo lo que necesite :)");
        System.out.println("Thank you for choosing us, we hope that you find everything you need :)");
        System.out.println("\nElige tus productos (o presiona 10 para cancelar la compra.):");
        System.out.println("Choose your products (or press 10 to cancel the order.):");
        System.out.println("---------------------------- Frutas y Verduras ----------------------------");
        printCatalogo(frutasYVer.getArreglo().iterator());
        System.out.println("-------------------------------- Electrónica --------------------------------");
        printCatalogo(electronica.getArreglo().iterator());
        System.out.println("\n ---------------------------- Electrodomésticos ----------------------------");
        printCatalogo(electrodom.getArreglo().iterator());
        System.out.println("10. Cancelar la compra/ Cancel the order.");
        System.out.println("0. Pagar/ Pay");
        System.out.println("==========================================================================");
    }

    /**
     * Método auxiliar para la estructura del catalogo, imprime el catalogo
     * con ayuda de un iterador que recorre cada producto. Además este metodo
     * da formato al catalogo que vamos a imprimir en la terminal.
     */
    public void printCatalogo(Iterator<Productos> iterador) {
        while (iterador.hasNext()) {
            Productos catalogoItem = iterador.next();
            System.out.println("ID:" + catalogoItem.getCodigoBarras() + catalogoItem.getNombre());
        }
    }

    /**
     * Este Metodo es para la opcion 1 del main "1. Mostrar catalogo", aquí mandamos a llamr
     * a print catalogo para que imprima todos los catalogos-
     */
    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        CatalogoElectrodom electrodom = new CatalogoElectrodom();
        CatalogoElectronica electronica = new CatalogoElectronica();
        CatalogoFrutasYVer frutasYVer = new CatalogoFrutasYVer();
        System.out.println("================================= Catalogo ========================================");
        System.out.println("\nTenemos una gran variedad de productos aquí en CheemSmart.");
        System.out.println("We have a wide variety of products here at CheemSmart.\n");
        System.out.println("-------------------------------- Frutas y Verduras --------------------------------");
        printCatalogo(frutasYVer.getArreglo().iterator());
        System.out.println("----------------------------------- Electrónica -----------------------------------");
        printCatalogo(electronica.getArreglo().iterator());
        System.out.println("\n -------------------------------- Electrodomésticos --------------------------------");
        printCatalogo(electrodom.getArreglo().iterator());
        System.out.println("==================================================================================");
        return opcionesCatalogo(opcionUsuario, main);
    }

    /**
     * Metodo agregarProductos que nos ayuda en el Decorator para poder
     * añadir elementos al carrito, recibe un int y un producto, y agrega
     * un producto al carrito.
     * 
     * @param tipoProducto un int que nos ayuda a controlar el numero de
     *                     productos.
     * @param producto     el carrito que vamos a "envolver" con un producto.
     * @return el producto con el elemento agregado.
     */
    private Productos agregarProductos(int tipoProducto, Productos producto) {
        switch (tipoProducto) {
            case 1938:
                return new CompraLechuga(producto);
            case 1672:
                return new CompraJitomate(producto);
            case 1849:
                return new CompraManzana(producto);
            case 2093:
                return new CompraTV(producto);
            case 2021:
                return new CompraZwitch(producto);
            case 2982:
                return new CompraLaptop(producto);
            case 3956:
                return new CompraLavadora(producto);
            case 3257:
                return new CompraVentilador(producto);
            case 3212:
                return new CompraCombo(producto);
            default:
                return producto;
        }
    }

    /**
     * Metodo imprimirTicket que recibe una objeto de Tipo producto,
     * obtiene su descripcion y su precio y
     * nos devuelve el ticket de la compra.
     * 
     * @param producto la producto del usuario.
     */
    public Boolean imprimirTicket(Productos producto, String opcionUsuario) {
        Cliente usuario = acceso.obtenerCliente((opcionUsuario));
        String nacionalidad = usuario.getNacionalidad();
        Boolean imprimir = false;
        switch (nacionalidad) {
            case "Español":
                main.cambiaVista(new VistaEspanol());
                System.out.println("\n--------- Sus insumos son: -----------");
                System.out.println(producto.getDescripcion());
                System.out.println("Con un total de: $" + producto.getPrecio());
                imprimir = true;
                break;
            case "Mexicano":
                main.cambiaVista(new VistaMexa());
                System.out.println("\n--------- Su despensa es: -----------");
                System.out.println(producto.getDescripcion());
                System.out.println("Total: $" + producto.getPrecio());
                imprimir = true;
                break;
            case "Estadounidense":
                main.cambiaVista(new VistaGringo());
                System.out.println("\n--------- Your products are: -----------");
                System.out.println(producto.getDescripcion());
                System.out.println("Total: $" + producto.getPrecio());
                imprimir = true;
                break;
            case "cancelado":
                System.out.println("###### Se ha cancelado tu compra./Your purchase has been canceled.######");
                imprimir = false;
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
        return imprimir;
    }

   /**
    * Presenta las opciones disponibles para el usuario según su nacionalidad y cambia la 
    * vista principal para imprimir las opciones correspondientes de cada cliente.
    * @param opcionUsuario La opción de usuario que nos ayuda a obtener su nacionalidad.
    * @param main          Instancia de ZMAINCHEEMS que representa la vista principal del programa.
    */
    public void opciones(String opcionUsuario, ZMAINCHEEMS main) {
        Cliente usuario = acceso.obtenerCliente((opcionUsuario));
        String nacionalidad = usuario.getNacionalidad();
        switch (nacionalidad) {
            case "Español":
                main.cambiaVista(new VistaEspanol());
                System.out.println(main.opciones());
                break;
            case "Mexicano":
                main.cambiaVista(new VistaMexa());
                System.out.println(main.opciones());
                break;
            case "Estadounidense":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.opciones());
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
    }

   /**
    * Presenta las opciones del catálogo según la nacionalidad del usuario y permite al usuario
    *  realizar una acción, ya sea regresar al menu principal o salir del programa.
    * @param opcionUsuario La opción de usuario asociada al cliente, nos ayuda a obtener el cliente.
    * @param main          Instancia de ZMAINCHEEMS que representa la vista principal del programa.
    * @return true si el usuario elige cerrar el programa, false si elige regresar al menú principal o si ocurre un error.
    */
    public Boolean opcionesCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        Boolean bool = false;
        Cliente usuario = acceso.obtenerCliente((opcionUsuario));
        String nacionalidad = usuario.getNacionalidad();
        switch (nacionalidad) {
            case "Español":
                System.out.println(main.opcionesCatalogo());
                try {
                    int opCatalogoEsp = scanner.nextInt();
                    if (opCatalogoEsp == 1) {
                        System.out.println("       ------- Regresando al menú principal-------");
                        return false;
                    } else {
                        System.out.println("       ######### Cerrando el programa #########");
                        bool = true;
                    }
                } catch (Exception e) {
                    System.out.println("Error: Debes ingresar un número entero.");
                    System.out.println("        -----Regresando al menú principal-----");
                    bool = false;
                    // opcionesCatalogo(opcionUsuario, main);
                }
                break;
            case "Mexicano":
                System.out.println(main.opcionesCatalogo());
                try {
                    int opCatalogMex = scanner.nextInt();
                    if (opCatalogMex == 1) {
                        System.out.println("       ------- Regresando al menú principal-------");
                        return false;
                    } else {
                        System.out.println("       ######### Cerrando el programa #########");
                        bool = true;
                    }
                } catch (Exception e) {
                    System.out.println("Error: Debes ingresar un número entero.");
                    System.out.println("        -----Regresando al menú principal-----");
                    bool = false;
                }
                break;
            case "Estadounidense":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.opcionesCatalogo());
                // try {
                int opCatalogUSA = scanner.nextInt();
                if (opCatalogUSA == 1) {
                    System.out.println("       ------- Returning to the main menu -------");
                    return false;
                } else {
                    bool = true;
                    System.out.println("       ######### Closing the program #########");
                }
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
        return bool;
    }
}
