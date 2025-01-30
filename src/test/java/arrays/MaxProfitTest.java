package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTest {

    @Test
    public void testMaxProfit() {
        int[] prices = {1,2};
        int expected = 1;
        assertEquals(expected, MaxProfit.maxProfit(prices));

        int[] prices2 = {7,1,5,3,6,4};
        int expected2 = 5;
        assertEquals(expected2, MaxProfit.maxProfit(prices2));
    }
}
