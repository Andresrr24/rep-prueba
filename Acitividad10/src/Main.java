import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.validations.Minimum_length;
import com.validations.Minimum_lower;
import com.validations.Minimum_upper;
import com.validations.Special_chars;
import com.validations.Number;

public class Main {
    public static void main(String[] args) {

        String n = " ";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("passwords.log", true)){
            while (!n.equals("S")) {

                System.out.print("Digite la contraseña a verificar: ");
                String password = scanner.nextLine();

                Minimum_length minlen = new Minimum_length(password);
                Minimum_lower minlow = new Minimum_lower(password);
                Minimum_upper minupper = new Minimum_upper(password);
                Special_chars specialchars = new Special_chars(password);
                Number number = new Number(password);

                minlen.start();
                minlow.start();
                minupper.start();
                specialchars.start();
                number.start();

                try {
                    minlen.join();
                    minlow.join();
                    minupper.join();
                    specialchars.join();
                    number.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                boolean isValid = minlen.isValid() && minlow.isValid() && minupper.isValid() && specialchars.isValid() && number.isValid();

                Runnable logPassword = () -> {
                    try {
                        writer.write(password + " - " + (isValid ? "Válida" : "Inválida") + "\n");
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };

                logPassword.run();

                System.out.print("Seguir? (S para salir): ");
                n = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}