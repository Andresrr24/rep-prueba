package com.validations;

public class Minimum_lower extends Thread{

    String password;

    public Minimum_lower(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        int lowercaseCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        if (lowercaseCount < 2) {
            System.out.println("El password debe tener al menos 2 letras mayúsculas");
        } else {
            System.out.println("El password tiene suficientes letras mayúsculas");
        }
    }
}
