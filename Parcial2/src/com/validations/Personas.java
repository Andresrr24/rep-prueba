package com.validations;

public class Personas {
    private Names names;
    private Emails emails;
    private Passwords passwords;

    public Personas() {
        this.names = new Names();
        this.emails = new Emails();
        this.passwords = new Passwords();
    }
    
    public boolean validateUser(String name, String email, String password) {
        boolean isNameValid = names.validate(name);
        boolean isEmailValid = emails.validate(email);
        boolean isPasswordValid = passwords.validate(password);

        if (!isNameValid) {
            System.out.println("Nombre inválido. Debe contener solo letras y espacios, y tener entre 1 y 50 caracteres.");
        }
        if (!isEmailValid) {
            System.out.println("Correo electrónico inválido. Debe tener un formato correcto.");
        }
        if (!isPasswordValid) {
            System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres, una letra mayúscula, una minúscula y un número.");
        }

        return isNameValid && isEmailValid && isPasswordValid;
    }
}


