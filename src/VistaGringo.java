public class VistaGringo implements VistaCliente {

    private String espacio = "==================================================================";
    private String decision = "What would you like to do? \n 1. Buy. \n 2. Quit";

    private String productos() {
        return "Welcome dear american citizens, you're entering the great frijolero Store\n" +
                "named CheemsMart, here we have the greatest products of our mexican neighbours\n" +
                "be free to choose any product that you want, they don't sell weapons unfortunately\n" +
                "but they sell great electronics";
    }

    @Override
    public String mostrarInterfaz() {
        return espacio + "\n" + productos() + "\n" + espacio + "\n" + decision;
    }
}
