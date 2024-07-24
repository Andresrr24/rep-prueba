import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lado;
        double altura;
        double lado_a;
        double area;
        double perimetro;
        String opcion;
        String opcion1;
        String opcion_final;

        List<Double> resultados = new ArrayList<>();

        do{

            System.out.println("Calculadora de áreas y perímetros");
            System.out.println("Elija una figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();

            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion1 = scanner.nextLine();

            opcion_final = opcion + ":" + opcion1;

            switch (opcion_final){
                case ("1:1"):
                    try {
                        System.out.println("Área de un cuadrado");
                        System.out.print("Valor de uno de los lados: ");
                        lado = scanner.nextDouble();
                        area = lado * lado;
                        System.out.println("Área = " + area);
                        resultados.add(area);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("1:2"):
                    try {
                        System.out.println("Perímetro de un cuadrado");
                        System.out.print("Valor de uno de los lados: ");
                        lado = scanner.nextDouble();
                        perimetro = lado * 4;
                        System.out.println("Perímetro = " + perimetro);
                        resultados.add(perimetro);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("2:1"):
                    try{
                        System.out.println("Área de un rectángulo");
                        System.out.print("Valor del lado mayor: ");
                        lado = scanner.nextDouble();
                        System.out.print("Valor del lado menor: ");
                        altura = scanner.nextDouble();
                        area = lado*altura;
                        System.out.println("Área = "+ area);
                        resultados.add(area);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("2:2"):
                    try{
                        System.out.println("Perímetro de un rectángulo");
                        System.out.print("Valor del lado mayor: ");
                        lado = scanner.nextDouble();
                        System.out.print("Valor del lado menor: ");
                        altura = scanner.nextDouble();
                        perimetro = (lado*2)+(altura*2);
                        System.out.println("Perímetro = "+ perimetro);
                        resultados.add(perimetro);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("3:1"):
                    try{
                        System.out.println("Área de un Triángulo");
                        System.out.print("Valor de la base: ");
                        lado = scanner.nextDouble();
                        System.out.print("Valor de la altura: ");
                        altura = scanner.nextDouble();
                        area = (lado*altura)/2;
                        System.out.println("Área = "+ area);
                        resultados.add(area);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("3:2"):
                    try{
                        System.out.println("Perímetro de un Triángulo");
                        System.out.print("Valor de la hipotenusa: ");
                        lado = scanner.nextDouble();
                        System.out.print("Valor del lado opuesto: ");
                        altura = scanner.nextDouble();
                        System.out.print("Valor del lado adyacente: ");
                        lado_a = scanner.nextDouble();
                        perimetro = lado+altura+lado_a;
                        System.out.println("Perímetro = "+ perimetro);
                        resultados.add(perimetro);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("4:1"):
                    try{
                        System.out.println("Área de un Círculo");
                        System.out.print("Valor del radio: ");
                        lado = scanner.nextDouble();
                        area = (lado*lado* Math.PI);
                        System.out.println("Área = "+ area);
                        resultados.add(area);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("4:2"):
                    try{
                        System.out.println("Perímetro de un Círculo");
                        System.out.print("Valor del diámetro: ");
                        lado = scanner.nextDouble();
                        perimetro = Math.PI*lado;
                        System.out.println("Perímetro = "+ perimetro);
                        resultados.add(perimetro);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("5:1"):
                    try{
                        System.out.println("Área de un Pentágono regular(es necesario calcular el perímetro antes)");
                        System.out.print("Valor del apotema (altura): ");
                        lado = scanner.nextDouble();
                        System.out.print("Valor del perímetro: ");
                        perimetro = scanner.nextDouble();
                        area = 0.5*perimetro*lado;
                        System.out.println("Área = "+ area);
                        resultados.add(area);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("5:2"):
                    try{
                        System.out.println("Perímetro de un Pentágono regular");
                        System.out.print("Valor de uno de sus lados: ");
                        lado = scanner.nextDouble();
                        perimetro = lado*5;
                        System.out.println("Perímetro = "+ perimetro);
                        resultados.add(perimetro);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.next();
                    }
                    scanner.nextLine();
                    break;
                case ("6:3"):
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (!opcion_final.equals("6:3"));

        System.out.println("Resultados: "+ resultados);
    }
}