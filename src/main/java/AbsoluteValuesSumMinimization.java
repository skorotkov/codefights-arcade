import java.util.stream.IntStream;

public class AbsoluteValuesSumMinimization {
    int absSum(int x, int[] arr) {
        return IntStream.of(arr).map(a -> Math.abs(a - x)).sum();
    }

    int absoluteValuesSumMinimization(int[] a) {
        int minSum = absSum(a[0], a);
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            int newSum = absSum(a[i], a);
            if (newSum < minSum) {
                minSum = newSum;
                minIndex = i;
            }
        }
        return a[minIndex];
    }
}
