package com.validations;

public class Number extends Thread{

    String password;
    boolean valid;

    public Number(String password) {

        this.password = password;
        this.valid = false;
    }

    @Override
    public void run() {
        int numberCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                numberCount++;
            }
        }

        if (numberCount >= 1) {
            valid = true;
        } else {
            System.out.println("El password debe tener al menos 1 número");
        }
    }
    public boolean isValid() {
        return valid;
    }
}
