package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowMaximumTest {

    @Test
    public void testSlidingWindowMaximum(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] expected = {3,3,5,5,6,7};

        assertArrayEquals(expected, SlidingWindowMaximum.maxSlidingWindow(nums,k));
    }
}
