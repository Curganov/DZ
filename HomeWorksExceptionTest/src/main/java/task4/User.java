package task4;

import java.util.Scanner;

public class User {
    public static int userInput()
    {
        int num = 0;
        try{
            System.out.println("enter a six digit number");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            while(num > 999999 || num < 100000){
                System.out.println("non six digit number");
                num = in.nextInt();
            }
            return num;
        }
        catch (Exception e)
            {
                System.err.println("you entered the wrong input");
                return num;
            }
    }
}
