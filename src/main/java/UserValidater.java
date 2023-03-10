import java.util.regex.Pattern;

public class UserValidater {
    private static final String PASSWORD_PATTERN = "(?=.*[0-9])(?=.*[A-Z])(?=.*\\d{1})(?=.*[@#$%!]{1}).{8,40}";
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}