package com.validations;

public class Special_chars extends Thread{

    String password;

    public Special_chars(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        if (!(password.contains("@") || password.contains("#")
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
            System.out.println("El password debe tener al 1 caracter especial");
        }
    }
}
