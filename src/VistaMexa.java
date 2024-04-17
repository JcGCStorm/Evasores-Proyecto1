public class VistaMexa implements VistaCliente {
    private String espacio = "==================================================================";
    private String decision = "¿Qué quieres hacer apá? \n 1. Nada más ando viendo gracias. (Ver catalogo)." +
            "\n 2. Hacer el mandado (Comprar) \n 3. Escapar de LATAM (Salir del programa)";

    private String decisionCatalogo = "¿Qué quieres hacer ahora, apá? \n 1. Al rato paso (Volver atrás)." +
            "\n 2. Escapar de LATAM (Salir del programa)";

    private String saludo = "Pasele güerita, acá tenemos de todo, casi como en el centro pero desde la comodidad\n" +
                "de su linda casa. Espero que encuentre lo que busca aquí en CheemSmart, recuerde que\n" +
                "hoy no fiamos pero mañana si, pregunte sin miedo.";


    @Override
    public String mostrarSaludo() {
        return espacio + "\n" + saludo + "\n" + espacio + "\n";
    }

    @Override
    public String mostrarDespedida() {
        return "Ahí nos vidrios";
    }

    public String opciones() {
        return decision;
    }

    @Override
    public String opcionesCatalogo() {
        return decisionCatalogo;
    }
}
