public class AreSimilar {
    public static boolean areSimilar(int[] a, int[] b) {
        boolean firstFound = false;
        boolean secondFound = false;
        int aToSwap = 0, bToSwap = 0;

        for (int i = 0; i < a.length; i++) {
            if (secondFound) {
                if (a[i] != b[i])
                    return false;
            } else if (!firstFound) {
                if (a[i] != b[i]) {
                    firstFound = true;
                    aToSwap = a[i];
                    bToSwap = b[i];
                }
            } else {
                if (a[i] != b[i]) {
                    if (aToSwap != b[i] || bToSwap != a[i])
                        return false;
                    else
                        secondFound = true;
                }

            }
        }
        return true;
    }
}
