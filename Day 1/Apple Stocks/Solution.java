import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int getMaxProfit(int[] stockPrices) {

    int minPrice = stockPrices[0];
    int maxProfit = stockPrices[1] - stockPrices[0];
    for (int i = 1; i < stockPrices.length; i++) {
        int currentPrice = stockPrices[i];
        int potentialProfit = currentPrice - minPrice;
        maxProfit = Math.max(maxProfit, potentialProfit);
        minPrice = Math.min(minPrice, currentPrice);
    }
    return maxProfit;
}


















    // tests

    @Test
    public void priceGoesUpThenDownTest() {
        final int actual = getMaxProfit(new int[] {9,9,9,9,9,9,9});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownThenUpTest() {
        final int actual = getMaxProfit(new int[] {0,0,0,0,0,0,0});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesUpAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 6, 7, 9});
        final int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest() {
        final int actual = getMaxProfit(new int[] {10,9,8,7,6,5,4,3,2,1});
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void priceStaysTheSameAllDayTest() {
        final int actual = getMaxProfit(new int[] {1,2,3,4,5,6,7,8,9,10});
        final int expected = 9;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void exceptionWithOnePriceTest() {
        getMaxProfit(new int[] {5});
    }

    @Test(expected = Exception.class)
    public void exceptionWithEmptyPricesTest() {
        getMaxProfit(new int[] {});
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}