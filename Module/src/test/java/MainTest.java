import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testMergeSort(){
        // Odd
        int[] testArraySorted = new int[]{1,2,3,4,5,6,7,8,9};
        int[] testArrayUnsorted = new int[]{3,9,6,7,5,8,2,4,1};
        assertArrayEquals(testArraySorted, Main.mergeSort(testArrayUnsorted));
        // Even
        testArraySorted = new int[]{0,1,2,3,4,5,6,7,8,9};
        testArrayUnsorted = new int[]{3,9,6,7,0,5,8,2,4,1};
        assertArrayEquals(testArraySorted, Main.mergeSort(testArrayUnsorted));
    }

}
