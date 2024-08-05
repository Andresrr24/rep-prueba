package com.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Names extends Validaciones {

    @Override
    public boolean validate(String name) {
        String pattern = "^[A-Za-z\\s]{1,50}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);
        return m.matches();

    }
}
