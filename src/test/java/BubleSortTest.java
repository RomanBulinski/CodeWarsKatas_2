import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubleSortTest {

    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{1,2,3,4,5},BubleSort.bubleSortMethod(new int[]{5,3,1,2,4}));
    }


}
