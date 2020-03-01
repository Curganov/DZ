package taks2;

public class Main {
    public static void main(String[] args){
        int[] arr = UserInputHandler.userInputNumber();
        int num = UserInputHandler.userInputSort();
        UserInputHandler.userCase(num, arr);
    }
}
