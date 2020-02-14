public class Pair implements Math, Show {
    private int num1;
    private int num2;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Pair() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void print(){
        System.out.println("Number1: " + this.num1 + " Number2: " + this.num2 + " Max: " + max() + " Min: " + min() + " Avg: " + avg());
    }
    public void print(String info){
        System.out.println("Number1: " + this.num1 + " Number2 " + this.num2 + " Max: " + max() + " Min: " + min() + " Avg: " + avg() + " Info: " + info);
    }

    public int max(){
        return  java.lang.Math.max(this.num1, this.num2);
    }
    public int min(){
        return java.lang.Math.min(this.num1, this.num2);
    }
    public float avg(){
        return ((float) this.num1 + (float)this.num2)/2;
    }
}
