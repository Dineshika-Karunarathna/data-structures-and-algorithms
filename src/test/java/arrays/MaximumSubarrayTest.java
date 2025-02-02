package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void testMaximumSubarray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;

        assertEquals(expected, MaximumSubarray.maxSubArray(nums));
    }
}
