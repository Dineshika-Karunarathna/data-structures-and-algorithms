package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearch(){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;
        assertEquals(expected, SearchInRotatedSortedArray.search(nums,target));

        int target2 = 3;
        int expected2 = -1;
        assertEquals(expected2, SearchInRotatedSortedArray.search(nums,target2));

        int[] nums3 = {1};
        int target3 = 0;
        int expected3 = -1;
        assertEquals(expected3, SearchInRotatedSortedArray.search(nums3,target3));

    }
}
