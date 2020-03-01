package taks2;

import org.junit.Assert;
import org.junit.Test;

public class NumberSortTest {

    @Test
    public void testMaxNumber() {
        int arr [] = {10, 15, 20};
        int result = NumberSort.maxNumber(arr);
        Assert.assertEquals(20, result);
    }

    @Test
    public void testMinNumber() {
        int arr [] = {10, 15, 20};
        int result = NumberSort.minNumber(arr);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testAvgNumber() {
        int arr [] = {10, 15, 20};
        int result = NumberSort.avgNumber(arr);
        Assert.assertEquals(15, result);
    }
}