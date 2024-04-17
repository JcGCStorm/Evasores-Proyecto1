import java.util.ArrayList;
import java.util.Scanner;

public class AccesoPrograma {
    // Crear la lista de clientes
    Cliente mexicano = new ClienteMexicano("JuanHorse938", "1234", "Juan Lopez", "5533456798",
            "Ciudad de Mexico, Venustiano Carranza Número 24, Lote 3, mzn 23",
            "Mexicano", 8423);
    Cliente espanol = new ClienteEspanol("CdeCiencia", "vivaEspaña", "Samuel de Luque", "+34-83494854",
            "Avenida YT, calzada mojang número 22, Andorra",
            "Español", 0777);
    Cliente estadounidense = new ClienteEstadounidense("Arthur", "333221", "Arthur Morgan", "78966652",
            "56 St. , Austin, Texas, U.S.A",
            "Estadounidense", 1899);
    ArrayList<String> clientes = new ArrayList<>();
    ArrayList<String> contrasenas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public AccesoPrograma() {
        agregaClientes();
    }

    public void agregaClientes() {
        clientes.add(mexicano.getUsuario());
        clientes.add(espanol.getUsuario());
        clientes.add(estadounidense.getUsuario());
        contrasenas.add(mexicano.getContrasena());
        contrasenas.add(espanol.getContrasena());
        contrasenas.add(estadounidense.getContrasena());
    }

    public Boolean contieneUsuario(String opcionUsuario) {
        if (clientes.contains(opcionUsuario)) {
            Boolean encontrado = true;
            return encontrado;
        } else {
            System.out.println("Nombre de Usuario incorrecto, intentalo de nuevo");
            Boolean encontrado = false;
            return encontrado;
        }
    }

    public Cliente regresaCliente(int i) {
        switch (i) {
            case 1:
                return mexicano;
            case 2:
                return espanol;
            case 3:
                return estadounidense;
            default:
                break;
        }
        return regresaCliente(i);
    }

    public Boolean contrasenaCorrecta(String opcionUsuario, String opcionContrasena) {
        Boolean contrasenaBool = false;
        Cliente cliente = null;

        // Determinar qué cliente se está tratando de autenticar
        if (opcionUsuario.equals("JuanHorse938")) {
            cliente = regresaCliente(1);
        } else if (opcionUsuario.equals("CdeCiencia")) {
            cliente = regresaCliente(2);
        } else if (opcionUsuario.equals("Arthur")) {
            cliente = regresaCliente(3);
        }
        while (contrasenaBool == false) {
            if (cliente.getContrasena().equals(opcionContrasena)) {
                contrasenaBool = true;
                System.out.println("\n ###Inicio de sesión satisfactorio.\n Satisfactory login.###\n");
                return contrasenaBool;
            } else {
                System.out.println("Contraseña incorrecta, intente de nuevo:\n Wrong password, please try again.");
                opcionContrasena = scanner.nextLine();
            }
        }
        return contrasenaBool;
    }
}
