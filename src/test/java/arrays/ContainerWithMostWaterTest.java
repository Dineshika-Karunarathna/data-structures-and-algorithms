package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void testmaxArea(){
        int[] height = {1,1};
        int expected = 1;

        assertEquals(expected,ContainerWithMostWater.maxArea(height));
    }
}

