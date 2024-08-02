package com.validations;

public class Minimum_lower extends Thread{

    String password;
    boolean valid;

    public Minimum_lower(String password) {

        this.password = password;
        this.valid = false;
    }

    @Override
    public void run() {
        int lowercaseCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        if (lowercaseCount >= 2) {
            valid = true;
        } else {
            System.out.println("El password debe tener al menos 2 letras minúsculas");
        }
    }
    public boolean isValid() {
        return valid;
    }
}
