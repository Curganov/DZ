package taks3;

import java.util.Scanner;

public class User{
    public static int userInput() {
        int result = 0;
        try{
            System.out.println("enter the number of hours");
            Scanner in = new Scanner(System.in);
            result = in.nextInt();
            while (result <= 0 || result > 24) {
                System.out.println("you have exceeded the range of operations");
                result = in.nextInt();
            }
            return result;
        }
        catch (Exception e)
        {
            return result;
        }
    }
}
