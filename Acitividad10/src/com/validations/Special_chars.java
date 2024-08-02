package com.validations;

public class Special_chars extends Thread{

    String password;
    boolean valid;

    public Special_chars(String password) {

        this.password = password;
        this.valid = false;

    }

    @Override
    public void run() {
        if ((password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            valid = true;
        } else {
            System.out.println("El password debe tener al 1 caracter especial");
        }
    }
    public boolean isValid() {
        return valid;
    }
}
