package Taks1;

public class InputNumber {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void infoNumber(int num) {
        if (isEven(num)) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
