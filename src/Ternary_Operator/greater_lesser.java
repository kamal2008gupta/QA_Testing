package Ternary_Operator;

public class greater_lesser {
    public static void main(String[] args) {
        int num=15;
        String result= num>10 ? (num>20 ? "number is greater than 20" : "number is between 10 and 20" ): "number is 10 or less";
        System.out.println(result);


    }
}
