public class ArrayChange {
    public static int arrayChange(int[] inputArray) {
        int sum = 0;
        int prev = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= prev) {
                sum += prev - inputArray[i] + 1;
                prev++;
            } else {
                prev = inputArray[i];
            }

        }
        return sum;
    }
}
