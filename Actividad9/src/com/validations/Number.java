package com.validations;

public class Number extends Thread{

    String password;

    public Number(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        int numberCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                numberCount++;
            }
        }

        if (numberCount < 2) {
            System.out.println("El password debe tener al menos 2 letras mayúsculas");
        } else {
            System.out.println("El password tiene suficientes letras mayúsculas");
        }
    }
}
