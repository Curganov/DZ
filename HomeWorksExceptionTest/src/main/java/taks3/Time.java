package taks3;

public class Time {
    public static int timeProcess(int num)
    {
        int id = 0;
        if(num >= 0 && num<=5)
            return id=1;
        if(num >= 6 && num <=12)
            return id=2;
        if(num >= 13 && num<=16)
            return id=3;
        if(num >= 17 && num<=24)
            return id=4;

        return id;
    }
    public static void timeProcessInfo(int num){
        switch(num) {
            case 1:
                System.out.println("Good Night");
                break;
            case 2:
                System.out.println("Good Morning");;
                break;
            case 3:
                System.out.println("Good Day");;
                break;
            case 4:
                System.out.println("Good Evening");;
                break;
            default:
                break;
        }
    }
}
