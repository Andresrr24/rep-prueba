package com.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emails extends Validaciones {

    @Override
    public boolean validate(String name) {
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);
        return m.matches();
    }
}