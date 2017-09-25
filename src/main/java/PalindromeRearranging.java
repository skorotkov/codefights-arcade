import java.util.Arrays;

public class PalindromeRearranging {
    private static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean palindromeRearranging(String inputString) {
        char[] array = inputString.toCharArray();
        Arrays.sort(array);
        char c = array[0];
        int count = 1;
        boolean inputIsOdd = isOdd(array.length);
        boolean oddAlreadyFound = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != c) {
                if (isOdd(count)) {
                    if (!inputIsOdd || (inputIsOdd && oddAlreadyFound))
                        return false;
                    else
                        oddAlreadyFound = true;
                }
                count = 1;
                c = array[i];
                if (i == array.length - 1 && oddAlreadyFound)
                    return false;
            } else {
                count++;
            }
        }
        return true;
    }
}
