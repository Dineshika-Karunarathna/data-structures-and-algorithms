package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate(){
        int[] nums={1,2,3,1};
        boolean expected = true;

        assertEquals(expected, ContainsDuplicate.containsDuplicate(nums));

        int[] nums2={1,2,3,4};
        boolean expected2 = false;

        assertEquals(expected2, ContainsDuplicate.containsDuplicate(nums2));
    }
}
