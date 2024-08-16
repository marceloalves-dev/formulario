package dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificacao {
    public static boolean name(String name) {
        String regex = "([a-zA-Z])+";
        return name.matches(regex);

    }

    public static boolean cpf(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(regex);
    }

    public static boolean email(String email) {
        String regex = "([\\w\\.-])+@([a-zA-Z])+(\\.([a-zA-z])+)+";
        return email.matches(regex);
    }
}
