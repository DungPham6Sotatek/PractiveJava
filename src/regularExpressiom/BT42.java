package regularExpressiom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT42 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{6,}");
        Matcher matcher = pattern.matcher("01234");
        System.out.println(matcher.matches());
    }
}
