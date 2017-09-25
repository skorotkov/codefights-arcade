
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Address {
    public static boolean isIPv4Address(String inputString) {
        Pattern pattern = Pattern.compile("(\\d+)\\.(\\d+).(\\d+).(\\d+)");
        Matcher matcher = pattern.matcher(inputString);
        if (!matcher.matches())
            return false;
        else {
            if (matcher.groupCount() != 4)
                return false;
            try {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    int num = Integer.parseInt(matcher.group(i));
                    if (num < 0 || num > 255)
                        return false;
                }
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

}
