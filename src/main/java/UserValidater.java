import java.util.regex.Pattern;

public class UserValidater {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}