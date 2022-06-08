package array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static pages.ValueOfNumbers.numberOfValues;

public class ArrayTest {

    /**
     * Check the number of values that are a multiplier of either 4
     */

    @Test
    public void valuesMultiplierFour() {
        int[] array = {1,2,3,4,8,10,12};
        assertEquals(numberOfValues(array),3);

    }

    /**
     * Check the number of values that are a multiplier of either 6
     */

    @Test
    public void valuesMultiplierSix() {
        int[] array = {1,2,6,7,9,10,12};
        assertEquals(numberOfValues(array),2);

    }

    /**
     * Check the number of values that are a multiplier of either 4 or 6
     */

    @Test
    public void valuesMultiplierFourAndSix() {
        int[] array = {1,4,6,7,8,10,12};
        assertEquals(numberOfValues(array),4);

    }
}
