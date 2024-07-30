import  java.util.Scanner;
import com.validations.Minimum_length;
import com.validations.Minimum_lower;
import com.validations.Minimum_upper;
import com.validations.Special_chars;
import com.validations.Number;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
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
    }
}