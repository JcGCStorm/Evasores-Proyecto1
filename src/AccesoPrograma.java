import java.util.ArrayList;
import java.util.Scanner;
/*
 * La clase AccesoPrograma, es la encargada de verificar usuarios y contraseñas
 * de los usuarios registrados, en este caso también se encarga de registrar nuevos 
 * usuarios al agregarlos a un Array.
 * 
 */

public class AccesoPrograma {
    /** 
     * Crear la lista de clientes, uno de ellos es vacio ya que nos es útil a la hora de cancelar
     * la compra, es para evitar excepciones.
     * */ 

    Cliente mexicano = new ClienteMexicano("JuanHorse938", "1234", "Juan Lopez", "5533456798",
            "Ciudad de Mexico, Venustiano Carranza Número 24, Lote 3, mzn 23",
            "Mexicano", 8423, new CuentaBancaria(1900.6, "chilepiquin"));
    Cliente espanol = new ClienteEspanol("CdeCiencia", "vivaEspana", "Samuel de Luque", "+34-83494854",
            "Avenida YT, calzada mojang número 22, Andorra",
            "Español", 0777, new CuentaBancaria(9000, "motomami"));
    Cliente estadounidense = new ClienteEstadounidense("Arthur", "333221", "Arthur Morgan", "78966652",
            "56 St. , Austin, Texas, U.S.A",
            "Estadounidense", 1899, new CuentaBancaria(100000, "capybara"));
    Cliente cancelado = new ClienteMexicano("cancelado", "", "John Doe", "", "", "cancelado", 0000, null);
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<String> contrasenas = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    /**
     * Este es el constructor de la clase, lo que hace es iniciar creando un arreglo con los clientes de 
     * prueba que construimos anteriormente.
     */
    public AccesoPrograma() {
        agregaClientes();
    }

    /**
     * El metodo agregaClientes simplemente los agrega a un arreglo llamado clientes
     * además de que obtiene sus usuarios y también las contraseñas de los clientes.
     */
    public void agregaClientes() {
        clientes.add(mexicano);
        clientes.add(espanol);
        clientes.add(estadounidense);
        clientes.add(cancelado);
        contrasenas.add(mexicano.getContrasena());
        contrasenas.add(espanol.getContrasena());
        contrasenas.add(estadounidense.getContrasena());
    }

    /*
     * El metodo contieneUsuario checa el arreglo con todos los usuarios y nos dice
     * si está en la lista o no, de no estar nos regresa falso, de estar nos regresa
     * true
     * @param opcionUsuario El nombre de usuario a buscar en la lista de clientes.
     * @return {@code true} si el nombre de usuario se encuentra en la lista de clientes, 
     * {@code false} de lo contrario.
      */
    public Boolean contieneUsuario(String opcionUsuario) {
        for (Cliente cliente : clientes) {
            try {
                if (cliente.getUsuario().equals(opcionUsuario)) {
                    return true;
                }
            } catch (Exception e) {
                if (!(cliente.getUsuario().equals(opcionUsuario)))
                    System.out.println("Nombre de usuario incorrecto.");
            }
        }
        return false;
    }

    /*
     * El metodo obtenerCliente() busca al cliente en el arreglo y nos lo regresa.
     * @param opcionUsuario El nombre de usuario del cliente que se desea buscar.
     * @return Cliente aquel cuyo nombre de usuario coincide con {@code opcionUsuario}, 
     * o {@code null} si no se encuentra.
    */
    public Cliente obtenerCliente(String opcionUsuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(opcionUsuario)) {
                return cliente;
            }
        }
        return null;
    }

    /*
     * Verifica si la contraseña que nos dan, coincide con la contraseña del cliente proporcionado.
     * @param opcionUsuario    El nombre de usuario del cliente cuya contraseña se quiere verificar.
     * @param opcionContrasena La contraseña proporcionada que se quiere verificar.
     * @return {@code true} si la contraseña es correcta, {@code false} de lo contrario.
    */
    public Boolean contrasenaCorrecta(String opcionUsuario, String opcionContrasena) {
        Boolean contrasenaBool = false;
        Cliente  cliente = obtenerCliente(opcionUsuario);
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
