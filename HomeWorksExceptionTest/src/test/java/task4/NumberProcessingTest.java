package task4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberProcessingTest {

    @Test
    public void testNumberArray() {
        int num = 123456;
        int arr [] = {1,2,3,4,5,6};
        int arr1 [] = NumberProcessing.numberArray(num);
        Assert.assertArrayEquals(arr,arr1);
    }

    @Test
    public void testNumberHappyTrue() {
        int arr[]={1,2,3,1,2,3};
        Assert.assertTrue(NumberProcessing.numberHappy(arr));
    }

    @Test
    public void testNumberHappyFalse(){
        int arr[]={1,2,3,4,5,6};
        Assert.assertFalse(NumberProcessing.numberHappy(arr));
    }
}