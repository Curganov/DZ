package task4;

public class Main {
    public static void main(String[] args) {
        int num = User.userInput();
        int arr[] = NumberProcessing.numberArray(num);
        boolean bool = NumberProcessing.numberHappy(arr);
        NumberProcessing.numberInfo(bool);

    }
}
