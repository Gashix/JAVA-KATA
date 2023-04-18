import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email = "hkGjhggv786@gmail.com";
        System.out.println(isGmailOrOutlook(email));
        System.out.println(isGmailOrOutlook1(email));
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern p = Pattern.compile("^(?!.*_)\\w+@(gmail\\.com|outlook\\.com)$");
        Matcher m = p.matcher(email);
        return m.find();
    }
    public static boolean isGmailOrOutlook1(String email) {
        String s = "^(?!.*_)\\w+@(gmail\\.com|outlook\\.com)$";
        return email.matches(s);
    }
}