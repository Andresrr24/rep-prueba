package com.calculos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Areas {

    Scanner scanner = new Scanner(System.in);
    public List<Double> resultados_areas = new ArrayList<>();

    public void a_cuadrado(){
        try {
            System.out.println("Área de un cuadrado");
            System.out.print("Valor de uno de los lados: ");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("Área = " + area);
            resultados_areas.add(area);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void a_rectangulo(){
        try{
            System.out.println("Área de un rectángulo");
            System.out.print("Valor del lado mayor: ");
            double lado = scanner.nextDouble();
            System.out.print("Valor del lado menor: ");
            double altura = scanner.nextDouble();
            double area = lado*altura;
            System.out.println("Área = "+ area);
            resultados_areas.add(area);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void a_triangulo(){
        try{
            System.out.println("Área de un Triángulo");
            System.out.print("Valor de la base: ");
            double lado = scanner.nextDouble();
            System.out.print("Valor de la altura: ");
            double altura = scanner.nextDouble();
            double area = (lado*altura)/2;
            System.out.println("Área = "+ area);
            resultados_areas.add(area);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void a_circulo(){
        try{
            System.out.println("Área de un Círculo");
            System.out.print("Valor del radio: ");
            double lado = scanner.nextDouble();
            double area = (lado*lado* Math.PI);
            System.out.println("Área = "+ area);
            resultados_areas.add(area);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }
    public void a_pentagono(){
        try{
            System.out.println("Área de un Pentágono regular(es necesario calcular el perímetro antes)");
            System.out.print("Valor del apotema (altura): ");
            double lado = scanner.nextDouble();
            System.out.print("Valor del perímetro: ");
            double perimetro = scanner.nextDouble();
            Double area = 0.5*perimetro*lado;
            System.out.println("Área = "+ area);
            resultados_areas.add(area);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }
}
