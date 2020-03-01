package Taks1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserInputHandlerTest {

    @Test
    public void testIsEven_IsEven() {
        Assert.assertTrue(InputNumber.isEven(10));
    }

    @Test
    public void testIsEven_IsNotEven() {
        Assert.assertFalse(InputNumber.isEven(11));
    }
}