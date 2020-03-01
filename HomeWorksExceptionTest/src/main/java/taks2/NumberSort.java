package taks2;

import java.util.Arrays;
import java.util.OptionalInt;

public class NumberSort {
    public static int maxNumber(int[] arr) {
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("Max number: " + max.getAsInt());
        return max.getAsInt();
    }

    public static int minNumber(int[] arr) {
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("Min number: " + min.getAsInt());
        return min.getAsInt();
    }

    public static int avgNumber(int[] arr)
    {
        int sum=0;
        for(int i = 0; i <= arr.length; i++)
        {
            try{
                sum=sum+arr[i];
            }
            catch (ArrayIndexOutOfBoundsException ignored)   //???
            {
                System.out.println(ignored);
            }
        }
        System.out.println("AVG: " + (sum/arr.length));
        return (sum/arr.length);
    }
}
