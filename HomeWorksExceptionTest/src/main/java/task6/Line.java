package task6;

public class Line {
    public static void lineTtreat(int length, String direction, char sym){
        if(length<0){
            System.out.println("incorrect method values");
        }
        if(direction == "right"){
            for(int i=1; i<=length; i++){
                System.out.print(sym);
            }
        }
        else {
            System.out.println("incorrect method values");
        }
        if(direction == "bottom"){
            for(int i=1; i<=length; i++){
                System.out.println(sym);
            }
        }
        else {
            System.out.println("incorrect method values");
        }
    }
}
