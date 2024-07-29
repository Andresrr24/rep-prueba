package com.calculos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Potenciacion {

    Scanner scanner = new Scanner (System.in);

    public void potencia(){
        try {
            System.out.println("Potencia");
            System.out.print("Base: ");
            double base = scanner.nextDouble();
            System.out.print("Exponente: ");
            double exponente = scanner.nextDouble();
            double resultado = Math.pow(base, exponente);
            System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
            scanner.next();
        }
    }



}
