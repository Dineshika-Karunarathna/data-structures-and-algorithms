package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    void testProductOfArrayExceptSelf() {
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};

        assertArrayEquals(output, ProductOfArrayExceptSelf.productExceptSelf(nums));

        int[] nums2 = {-1,1,0,-3,3};
        int[] output2 = {0,0,9,0,0};

        assertArrayEquals(output2, ProductOfArrayExceptSelf.productExceptSelf(nums2));
    }
}
