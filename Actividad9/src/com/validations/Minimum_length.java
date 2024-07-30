package com.validations;

public class Minimum_length extends Thread {

    String password;

    public Minimum_length(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        if (password.length() < 8) {
            System.out.println("El password debe tener al menos 8 caracteres");
        }
    }
}
