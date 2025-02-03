package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    public void testMaximumProductSubarray() {
        int[] num = {2,3,-2,4};
        int expected = 6;

        assertEquals(expected, MaximumProductSubarray.maxProduct(num));


        int[] num2 = {-2,0,-1};
        int expected2 = 0;

        assertEquals(expected2, MaximumProductSubarray.maxProduct(num2));

        int[] num3 = {-4,-3,-2};
        int expected3 = 12;
        assertEquals(expected3, MaximumProductSubarray.maxProduct(num3));
    }
}
