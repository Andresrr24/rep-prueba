import java.util.Scanner;
import com.calculos.Areas;
import com.calculos.Perimetros;
import com.calculos.Potenciacion;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String opcion;
        String opcion1;
        String opcion_final;
        Areas areas = new Areas();
        Perimetros perimetros = new Perimetros();
        Potenciacion potencias = new Potenciacion();

        do{

            System.out.println("Calculadora de áreas y perímetros");
            System.out.println("Elija una figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Pentágono");
            System.out.println("6. Selección de área, perímetro o potenciación");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();

            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("3. Potenciación");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion1 = scanner.nextLine();

            opcion_final = opcion + ":" + opcion1;

            switch (opcion_final){
                case ("1:1"):
                    areas.a_cuadrado();
                    scanner.nextLine();
                    break;
                case ("1:2"):
                    perimetros.p_cuadrado();
                    scanner.nextLine();
                    break;
                case ("2:1"):
                    areas.a_rectangulo();
                    scanner.nextLine();
                    break;
                case ("2:2"):
                    perimetros.p_rectangulo();
                    scanner.nextLine();
                    break;
                case ("3:1"):
                    areas.a_triangulo();
                    scanner.nextLine();
                    break;
                case ("3:2"):
                    perimetros.p_triangulo();
                    scanner.nextLine();
                    break;
                case ("4:1"):
                    areas.a_circulo();
                    scanner.nextLine();
                    break;
                case ("4:2"):
                    perimetros.p_circulo();
                    scanner.nextLine();
                    break;
                case ("5:1"):
                    areas.a_pentagono();
                    scanner.nextLine();
                    break;
                case ("5:2"):
                    perimetros.p_pentagono();
                    scanner.nextLine();
                    break;
                case ("6:3"):
                    potencias.potencia();
                    scanner.nextLine();
                    break;
                case ("6:4"):
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (!opcion_final.equals("6:3"));

        System.out.println("Resultados: "+ areas.resultados_areas + perimetros.resultados_perimetros);
    }
}