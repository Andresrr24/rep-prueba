package com.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwords extends Validaciones {

    @Override
    public boolean validate(String name) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);
        return m.matches();
    }
}