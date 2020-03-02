package taks2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {


    public static int[] userInputNumber() {
        int[] arr = new int[3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter number " + (i+1));
            try {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
            } catch (InputMismatchException e) {    //???
                System.out.println("this expression is not valid, try again");
                Scanner in = new Scanner(System.in);
                arr[i] = in.nextInt();
            }
        }
        return arr;
    }
    public static int userInputSort()
    {
        System.out.println("1.Max 2.Min 3.AVG");
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        while (result<=0 || result>3) {
                System.out.println("you have exceeded the range of operations");
                result = in.nextInt();
        }
        return result;
    }

    public static void userCase(int num, int [] arr){
        switch(num){
            case 1:
                NumberSort.maxNumber(arr);
                break;
            case 2:
                NumberSort.minNumber(arr);
                break;
            case 3:
                NumberSort.avgNumber(arr);
                break;
            default:
        }
    }
}
