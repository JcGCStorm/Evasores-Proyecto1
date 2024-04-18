import java.util.Random;

public class VistaGringo implements VistaCliente {

    private String espacio = "==================================================================================";
    private String decision = "What would you like to do? \n 1. View catalog.\n 2. Buy." +
            "                     \n 3. Quit\n";
    private String decisionCatalogo = "What would you like to do? \n 1. Go Back. \n 2. Quit";

    private String saludo = "Welcome dear american citizens, you're entering the great frijolero Store\n" +
            "named CheemsMart, here we have the greatest products of our mexican neighbors\n" +
            "be free to choose any product that you want, they don't sell weapons unfortunately\n" +
            "but they sell great electronics";

    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    @Override
    public String mostrarDespedida() {
        return "Goodbye\n" + espacio;
    }

    @Override
    public String opciones() {
        return decision;
    }

    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }

    @Override
    public String completarCompra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'completarCompra'");
    }

    @Override
    public boolean mostrarOferta() {
        return OfertaElectronicos();
    }

    public static Boolean OfertaElectronicos() {
        Random random = new Random();
        boolean imprimirMensaje = random.nextBoolean();

        if (imprimirMensaje) {
            System.out.println("We have a 20% discount on all electronics!!!");
        }

        return imprimirMensaje;
    }
}
