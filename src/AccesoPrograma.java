import java.util.ArrayList;
import java.util.Scanner;

public class AccesoPrograma {
    // Crear la lista de clientes
    Cliente mexicano = new ClienteMexicano();
    Cliente espanol = new ClienteEspanol();
    Cliente estadounidense = new ClienteEstadounidense();
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

    public Boolean contieneContrasena(String opcionContrasena) {
        if (contrasenas.contains(opcionContrasena)) {
            Boolean encontrado = true;
            return encontrado;
        } else {
            System.out.println("Contraseña incorrecta, tienes dos intentos más.");
            Boolean encontrado = false;
            return encontrado;
        }
    }
}