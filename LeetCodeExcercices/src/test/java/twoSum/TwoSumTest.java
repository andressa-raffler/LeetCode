package twoSum;

import com.raffler.leetcodeexcercices.LeetCodeExcercicesApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest extends LeetCodeExcercicesApplication {

    @Test
    void testTwoSumDumb() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.testTwoSumDumbWay(new int[]{1, 5, 5,}, 10);
        assertArrayEquals(new int[]{1,2}, answer);
    }

    @Test
    void twoSumWithHashMap() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSumWithHashMap(new int[]{1, 5, 5,}, 10);
        assertArrayEquals(new int[]{1,2}, answer);
    }

    @Test
    void twoSumWithDoubleHashMap() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSumWithHashMap(new int[]{1, 5, 5,}, 10);
        assertArrayEquals(new int[]{1,2}, answer);
    }
}