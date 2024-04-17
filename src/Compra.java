import java.util.Iterator;
import java.util.Scanner;

public class Compra {
    Scanner scanner = new Scanner(System.in);
    ZMAINCHEEMS main = new ZMAINCHEEMS();
    CatalogoElectrodom electro = new CatalogoElectrodom();
    CatalogoElectronica electronica = new CatalogoElectronica();
    CatalogoFrutasYVer frutasYVer = new CatalogoFrutasYVer();

    public Boolean compraProducto(String opcionUsuario) {
        Productos producto;
        producto = new Carrito();
        if (producto != null) {
            boolean ponmeMas = true;
            while (ponmeMas) {
                catalogoCompra();
                int productoEleccion = scanner.nextInt();
                if (productoEleccion == 0) {
                    ponmeMas = false;
                } else {
                    switch (productoEleccion) {
                        case 1:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado Lechuga a tu carrito.");
                            break;
                        case 2:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado Jitomate a tu carrito.");
                            break;
                        case 3:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado Manzana a tu carrito.");
                            break;
                        case 4:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado una TV Hisense a tu carrito.");
                            break;
                        case 5:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado una Nintendo Zwitch a tu carrito.");
                            break;
                        case 6:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado una Laptop HP a tu carrito.");
                            break;
                        case 7:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado una Lavadora Midea a tu carrito.");
                            break;
                        case 8:
                            producto = agregarProductos(productoEleccion, producto);
                            System.out.println("Se ha agregado una Ventilador de Piso Taurus a tu carrito.");
                            break;
                        case 9:
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
            }
        }
        return imprimirTicket(producto, opcionUsuario);
    }

    public void catalogoCompra(){
        System.out.println("================================== Catalogo ==========================================");
        System.out.println("Gracias por comprar con nosotros, espero encuentre todo lo que necesite :)");
        System.out.println("Thank you for choosing us, we hope that you find everything you need :)");
        System.out.println("\nElige tus productos (o presiona 10 para cancelar la compra.):");
        System.out.println("Choose your products (or press 10 to cancel the order.):");
        System.out.println("---------------------------- Frutas y Verduras ----------------------------");
        printMenu(frutasYVer.getArreglo().iterator());
        System.out.println("---------------------------- Electrónica ----------------------------");
        printMenu(electronica.getArreglo().iterator());
           System.out.println("\n ---------------------------- Electrodomésticos ----------------------------");
        printMenu(electro.getArreglo().iterator());
        System.out.println("10. Cancelar la compra/ Cancel the order.");
                System.out.println("0. Pagar/ Pay");
                System.out.println("==========================================================================");
    }
    
      /**
       * Método auxiliar para la estructura del menu
       */
        private void printMenu(Iterator<Productos> iterador){
            while (iterador.hasNext()){
                Productos menuItem = iterador.next();
                System.out.println("ID:" + menuItem.getCodigoBarras() + menuItem.getNombre());
            }
        }

    public Boolean mostrarCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        System.out.println("============================= Catalogo ====================================");
        System.out.println("\nTenemos una gran variedad de productos aquí en CheemSmart.");
        System.out.println("We have a wide variety of products here at CheemSmart.\n");
        System.out.println("---------------------------- Frutas y Verduras ----------------------------");
        printMenu(frutasYVer.getArreglo().iterator());
        System.out.println("---------------------------- Electrónica ----------------------------");
        printMenu(electronica.getArreglo().iterator());
           System.out.println("\n ---------------------------- Electrodomésticos ----------------------------");
        printMenu(electro.getArreglo().iterator());
        System.out.println("==========================================================================");
        return opcionesCatalogo(opcionUsuario, main);
    }

    /**
     * Metodo agregarIngrediente que nos ayuda en el Decorator para poder
     * añadir elementos a la producto, recibe un int y una producto, y agrega
     * un ingrediente a la producto.
     * 
     * @param tipoIngrediente un int que nos ayuda a controlar el numero de
     *                        ingredientes.
     * @param producto        la producto que vamos a "envolver" con un ingrediente.
     * @return la producto con el ingrediente agregado.
     */
    private Productos agregarProductos(int tipoProducto, Productos producto) {
        switch (tipoProducto) {
            case 1:
                return new CompraLechuga(producto);
            case 2:
                return new CompraJitomate(producto);
            case 3:
                return new CompraManzana(producto);
            case 4:
                return new CompraTV(producto);
            case 5:
                return new CompraZwitch(producto);
            case 6:
                return new CompraLaptop(producto);
            case 7:
                return new CompraLavadora(producto);
            case 8:
                return new CompraVentilador(producto);
            case 9:
                return new CompraCombo(producto);
            default:
                return producto;
        }
    }

    /**
     * Metodo imprimirTicket que recibe una objeto de Tipo producto, pero que puede
     * ser tanto una producto como una pizza, obtiene su descripcion y su precio y
     * nos devuelve el ticket de la comida ordenada.
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
                System.out.println(main.despedir());
                break;
            case "JuanHorse938":
                main.cambiaVista(new VistaMexa());
                System.out.println("\n--------- Su despensa es: -----------");
                System.out.println(comida.getDescripcion());
                System.out.println("Total: $" + comida.getPrecio());
                imprimir = true;
                System.out.println(main.despedir());
                break;
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println("\n--------- Your products are: -----------");
                System.out.println(comida.getDescripcion());
                System.out.println("Total: $" + comida.getPrecio());
                imprimir = true;
                System.out.println(main.despedir());
                break;
            case "cancelado":
                System.out.println("###### Has cancelado tu compra./You just canceled your order.######");
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

    public Boolean opcionesCatalogo(String opcionUsuario, ZMAINCHEEMS main) {
        Boolean bool = false;
        switch (opcionUsuario) {
            case "CdeCiencia":
                main.cambiaVista(new VistaEspanol());
                System.out.println(main.opcionesCatalogo());
                int opCatalogoEsp = scanner.nextInt();
                if (opCatalogoEsp == 1) {
                    return false;
                } else {
                    bool = true;
                }
                main.cambiaVista(new VistaGringo());
                break;
            case "JuanHorse938":
                main.cambiaVista(new VistaMexa());
                System.out.println(main.opcionesCatalogo());
                int opCatalogMex = scanner.nextInt();
                if (opCatalogMex == 1) {
                    return false;
                } else {
                    bool = true;
                }
                main.cambiaVista(new VistaGringo());
                break;
            case "Arthur":
                main.cambiaVista(new VistaGringo());
                System.out.println(main.opcionesCatalogo());
                int opCatalogUSA = scanner.nextInt();
                if (opCatalogUSA == 1) {
                    return false;
                } else {
                    bool = true;
                }
                main.cambiaVista(new VistaGringo());
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");
        }
        return bool;
    }
}