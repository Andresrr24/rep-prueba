package com.calculos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Perimetros {

    Scanner scanner = new Scanner(System.in);
    public List<Double> resultados_perimetros = new ArrayList<>();

    public void p_cuadrado() {
        try {
            System.out.println("Perímetro de un cuadrado");
            System.out.print("Valor de uno de los lados: ");
            double lado = scanner.nextDouble();
            double perimetro = lado * 4;
            System.out.println("Perímetro = " + perimetro);
            resultados_perimetros.add(perimetro);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }
    public void p_rectangulo(){
        try{
            System.out.println("Perímetro de un rectángulo");
            System.out.print("Valor del lado mayor: ");
            double lado = scanner.nextDouble();
            System.out.print("Valor del lado menor: ");
            double altura = scanner.nextDouble();
            double perimetro = (lado*2)+(altura*2);
            System.out.println("Perímetro = "+ perimetro);
            resultados_perimetros.add(perimetro);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void p_triangulo() {
        try {
            System.out.println("Perímetro de un Triángulo");
            System.out.print("Valor de la hipotenusa: ");
            double lado = scanner.nextDouble();
            System.out.print("Valor del lado opuesto: ");
            double altura = scanner.nextDouble();
            System.out.print("Valor del lado adyacente: ");
            double lado_a = scanner.nextDouble();
            double perimetro = lado + altura + lado_a;
            System.out.println("Perímetro = " + perimetro);
            resultados_perimetros.add(perimetro);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void p_circulo() {
        try {
            System.out.println("Perímetro de un Círculo");
            System.out.print("Valor del diámetro: ");
            double lado = scanner.nextDouble();
            double perimetro = Math.PI * lado;
            System.out.println("Perímetro = " + perimetro);
            resultados_perimetros.add(perimetro);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }

    public void p_pentagono() {
        try{
            System.out.println("Perímetro de un Pentágono regular");
            System.out.print("Valor de uno de sus lados: ");
            double lado = scanner.nextDouble();
            double perimetro = lado*5;
            System.out.println("Perímetro = "+ perimetro);
            resultados_perimetros.add(perimetro);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }
}
