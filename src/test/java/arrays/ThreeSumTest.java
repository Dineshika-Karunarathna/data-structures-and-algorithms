package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    @Test
    public void testThreeSum(){
        int[] num = {-2,0,0,2,2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2,0,2));
        assertEquals(expected,ThreeSum.threeSum(num));
    }
}
