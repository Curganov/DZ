package taks3;

public class Main {
    public static void main(String[] args) {
        int time = User.userInput();
        int id = Time.timeProcess(time);
        Time.timeProcessInfo(id);
    }
}
