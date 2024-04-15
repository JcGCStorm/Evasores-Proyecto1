public class VistaMexa implements VistaCliente {
    private String espacio = "==================================================================";
    private String decision = "¿Qué quieres apá? \n 1. Comprar el mandado. \n 2. Escapar de LATAM (Salir del programa)";

    private String productos() {
        return "Pasele güerita, acá tenemos de todo, casi como en el centro pero desde la comodidad\n" +
                "de su linda casa. Espero que encuentre lo que busca aquí en CheemSmart, tenemos de todo\n" +
                "pregunte sin miedo.";
    }

    @Override
    public String mostrarInterfaz() {
        return espacio + "\n" + productos() + "\n" + espacio + "\n" + decision;
    }
}
