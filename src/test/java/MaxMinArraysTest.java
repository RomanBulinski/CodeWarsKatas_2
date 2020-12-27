import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxMinArraysTest {

    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11},MaxMinArrays.solve(new int[]{15,11,10,7,12}));

    }


}
