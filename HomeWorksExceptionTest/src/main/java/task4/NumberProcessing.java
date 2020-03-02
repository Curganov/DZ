package task4;

public class NumberProcessing {
    public static int[] numberArray(int num){  //как проверить метод перевода числа в массив символов??
        int arrSize = 6;
        int[] arr = new int[arrSize];
        try{
            arr[0] = num/100000;
            arr[1] = (num/10000)%10;
            arr[2] = (num/1000)%100%10;
            arr[3] = (num/100)%1000%100%10;
            arr[4] = (num/10)%10000%1000%100%10;
            arr[5] = (num)%100000%10000%1000%100%10;
            return arr;
        }
        catch (Exception e){
        return arr;
        }
    }

    public static boolean numberHappy(int[] arr){
        int sum=0;
        int sum1=0;
        try{
            for(int i=0; i<=2; i++){
                sum=sum+arr[i];
            }
            for(int j=3; j<=5; j++){
                sum1=sum1+arr[j];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        if(sum == sum1)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void numberInfo(boolean bool)
    {
        if(bool == true){
            System.out.println("Number Happy");
        }
        else {
            System.out.println("Number not Happy");
        }
    }

}
