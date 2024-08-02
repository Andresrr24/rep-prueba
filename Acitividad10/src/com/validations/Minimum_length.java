package com.validations;

public class Minimum_length extends Thread {

    String password;
    boolean valid;

    public Minimum_length(String password) {

        this.password = password;
        this.valid = false;
    }

    @Override
    public void run() {
        if (password.length() >= 8) {
            valid = true;
        } else {
            System.out.println("El password debe tener al menos 8 caracteres");
        }
    }

    public boolean isValid() {
        return valid;
    }
}
