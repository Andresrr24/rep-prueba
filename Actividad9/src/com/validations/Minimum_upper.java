package com.validations;

public class Minimum_upper extends Thread{

    String password;

    public Minimum_upper(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        int uppercaseCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        if (uppercaseCount < 2) {
            System.out.println("El password debe tener al menos 2 letras mayúsculas");
        }
    }
}
