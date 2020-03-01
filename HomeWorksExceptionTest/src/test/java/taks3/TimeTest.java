package taks3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

    @Test
    public void timeProcess() {
        int num = 4;
        int result = Time.timeProcess(num);
        Assert.assertEquals(1,result);
    }
}