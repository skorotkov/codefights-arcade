import java.util.stream.Collectors;

public class AlphabeticShift {
    static String alphabeticShift(String inputString) {
        return inputString.chars()
                          .map(i -> {
                              if (i != (int)'z')
                                  return i + 1;
                              else
                                  return (int)'a';
                          })
                          .mapToObj(i ->
                                  new String(new char[] {(char)i}))
                          .collect(Collectors.joining());
    }
}
