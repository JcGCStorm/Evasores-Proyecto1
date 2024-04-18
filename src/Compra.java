import java.util.Iterator;
import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;

public class Compra {
    Scanner scanner = new Scanner(System.in);
    ZMAINCHEEMS main = new ZMAINCHEEMS();
    AccesoPrograma acceso = new AccesoPrograma();
    CatalogoElectrodom electrodom = new CatalogoElectrodom();
    CatalogoElectronica electronica = new CatalogoElectronica();
    CatalogoFrutasYVer frutasYVer = new CatalogoFrutasYVer();
    CuentaBancariaProxy cuentaProxy;
    private AccesoPrograma accesoPrograma;

    public Boolean compraProducto(String opcionUsuario) {
        Productos producto;
        producto = new Carrito();
        if (producto != null) {
            boolean ponmeMas = true;
            while (ponmeMas) {
                catalogoCompra();
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
                            case 0:
                                ponmeMas = false;
                                break;
                            default:
                                System.out.println("No seleccionaste una opción válida ):");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Debes ingresar el número del codigo de barras, no debes ingresar letras.");
                    opcionUsuario = "cancelado";
                    ponmeMas = false;
                }
            }

            System.out.println("¿Deseas proceder al pago? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("s")) {
                return pagar(producto, opcionUsuario);
            } else {
                System.out.println("Compra cancelada.");
                return false;
            }
        }
        // return imprimirTicket(producto, opcionUsuario);
        return false;
        // return pagar(producto, opcionUsuario);
    }

    public Boolean pagar(Productos comida, String opcionUsuario) {
        AccesoPrograma accesoPrograma = new AccesoPrograma();

        Cliente cliente = accesoPrograma.obtenerCliente((opcionUsuario));
        if (cliente == null) {
            System.out.println("Usuario no encontrado.");
            return false;
        }

        double total = comida.getPrecio();
        System.out.println("Total a pagar: $" + total);
        System.out.println("Ingrese su contraseña: ");
        String contrasena = scanner.next();

        if (contrasena.equals(cliente.getContrasena())) {

            cuentaProxy = new CuentaBancariaProxy(cliente.getCuentaBancaria());

            if (cuentaProxy.getSaldo() >= total) {
                cuentaProxy.realizarPago(total);

                // aqui puede pedir contraseña de la cuenta
                System.out.println("Pago realizado con éxito.");
                // cliente.getCuentaBancaria().actualizarSaldo(cuentaProxy.getSaldo());
                cuentaProxy.actualizarSaldo(cuentaProxy.getSaldo());
                return imprimirTicket(comida, opcionUsuario);
            } else {
                System.out.println("Saldo insuficiente en su cuenta bancaria.");
                return false;
            }
        } else {
            System.out.println("Contraseña incorrecta.");
            return false;
        }
    }

    public void catalogoCompra() {
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
     * Método auxiliar para la estructura del catalogo
     */
    private void printCatalogo(Iterator<Productos> iterador) {
        while (iterador.hasNext()) {
            Productos catalogoItem = iterador.next();
            System.out.println("ID:" + catalogoItem.getCodigoBarras() + catalogoItem.getNombre());
        }
    }

    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
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
     * @param comida la comida del usuario.
     */
    public Boolean imprimirTicket(Productos comida, String opcionUsuario) {
        Boolean imprimir = false;
        switch (opcionUsuario) {
            case "CdeCiencia":
                main.cambiaVista(new VistaEspanol());
                System.out.println("\n--------- Sus insumos son: -----------");
                System.out.println(comida.getDescripcion());
                System.out.println("Con un total de: $" + comida.getPrecio());
                imprimir = true;
                break;
            case "JuanHorse938":
                main.cambiaVista(new VistaMexa());
                System.out.println("\n--------- Su despensa es: -----------");
                System.out.println(comida.getDescripcion());
                System.out.println("Total: $" + comida.getPrecio());
                imprimir = true;
                break;
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println("\n--------- Your products are: -----------");
                System.out.println(comida.getDescripcion());
                System.out.println("Total: $" + comida.getPrecio());
                imprimir = true;
                break;
            case "cancelado":
                System.out.println("###### Se ha cancelado tu compra./Your order has been canceled.######");
                imprimir = false;
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
        return imprimir;
    }

    public void opciones(String opcionUsuario, ZMAINCHEEMS main) {
        switch (opcionUsuario) {
            case "CdeCiencia":
                main.cambiaVista(new VistaEspanol());
                System.out.println(main.opciones());
                break;
            case "JuanHorse938":
                main.cambiaVista(new VistaMexa());
                System.out.println(main.opciones());
                break;
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.opciones());
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
    }

    // PENDIENTE ESTA MAL

    public Boolean opcionesCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        Boolean bool = false;
        switch (opcionUsuario) {
            case "CdeCiencia":
                System.out.println(main.opcionesCatalogo());
                int opCatalogoEsp = 2;
                try {
                    opCatalogoEsp = scanner.nextInt();
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
            case "JuanHorse938":
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
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.opcionesCatalogo());
                try {
                    int opCatalogUSA = scanner.nextInt();
                    if (opCatalogUSA == 1) {
                        System.out.println("       ------- Returning to the main menu -------");
                        return false;
                    } else {
                        bool = true;
                        System.out.println("       ######### Closing the program #########");
                    }
                } catch (Exception e) {
                    System.out.println("Error: You must enter an integer.");
                    System.out.println("        ----- Returning to the main menu -----");
                    bool = false;
                }
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
        return bool;
    }

    public Cliente getCliente(String opcionUsuario) {
        Cliente cliente = null;
        if ("CdeCiencia".equals(opcionUsuario)) {
            main.cambiaVista(new VistaEspanol());
            cliente = acceso.regresaCliente(2);
        } else if ("JuanHorse938".equals(opcionUsuario)) {
            main.cambiaVista(new VistaMexa());
            cliente = acceso.regresaCliente(1);
        } else if ("Arthur".equals(opcionUsuario)) {
            main.cambiaVista(new VistaGringo());
            cliente = acceso.regresaCliente(3);
        } else {
            System.out.println("Cliente no encontrado");
        }
        return cliente;
    }

}
