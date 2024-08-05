import com.validations.Personas;

public class Main {
    public static void main(String[] args) {
        Personas personas = new Personas();

        // Ejemplo de datos del usuario
        String name = "Andres Rueda";
        String email = "andresrueda@gmail.com";
        String password = "1231";

        if (personas.validateUser(name, email, password)) {
            System.out.println("Toda la información del usuario es válida.");
        } else {
            System.out.println("Hay errores en la información del usuario.");
        }

    }
}