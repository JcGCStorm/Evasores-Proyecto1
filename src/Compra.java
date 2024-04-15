import java.util.Scanner;

public class Compra {
    Scanner scanner = new Scanner(System.in);

    public void compraProducto() {
        System.out.println("---------------------------- Catalogo ----------------------------");
        System.out.println("Gracias por comprar con nosotros, solo tenemos lechuga");
        System.out.println("Thank you for choosing us, we only have lettuce");
        Productos producto;
        producto = new Carrito();
        if (producto != null) {
            boolean ponmeMas = true;
            while (ponmeMas) {
                System.out.println("\nElige tus productos (o presiona 0 para finalizar):");
                System.out.println("Choose your products (or press 0 to quit):");
                System.out.println("1. Lechuga 🥬($5.50)");
                System.out.println("0. Salir");

                int productoEleccion = scanner.nextInt();
                if (productoEleccion == 0) {
                    ponmeMas = false;
                } else {
                    int cantidad = 1;
                    switch (productoEleccion) {
                        case 1:
                            for (int i = 0; i < cantidad; i++) {
                                producto = agregarProductos(productoEleccion, producto);
                            }
                            System.out.println("Se ha agregado Lechuga a tu carrito.");
                            break;
                        case 0:
                            ponmeMas = false;
                            break;
                        default:
                            System.out.println("No seleccionaste una opción válida ):");

                    }
                }
            }
            imprimirTicket(producto);
        }
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
                return new Lechuga(producto);
            case 2:
                return new Lechuga(producto);

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
    public void imprimirTicket(Productos comida) {
        System.out.println("\n--------- Carrito -----------");
        System.out.println(comida.getDescripcion());
        System.out.println("Total: $" + comida.getPrecio());

    }
}