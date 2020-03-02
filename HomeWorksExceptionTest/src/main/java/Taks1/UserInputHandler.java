package Taks1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    public static int getUserInput() {
        int num = 0;
        try {
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            while (num == 0) {
                System.out.println("Zero is considered an even number.");
                num = in.nextInt();
            }
            return num;
        } catch (InputMismatchException e) {
            System.out.println("you entered not a number");
            System.err.println("Error: " + e);
            return num;
        }
    }
}
