public class EvenDigitsOnly {
    public static boolean evenDigitsOnly(int n) {

//        if (n == 1)
//            return false;
        while (n >= 1) {
            if (n % 10 % 2 == 1)
                return false;
            n = n / 10;
        }
        return true;
    }
}
