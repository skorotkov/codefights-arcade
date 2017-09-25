public class DepositProfit {
    static int depositProfit(int deposit, int rate, int threshold) {
        double log1 = Math.log((double)threshold / deposit);
        double log2 = Math.log((double)rate * 0.01);
        return -(int)Math.ceil(log2 / log1);
    }
}
