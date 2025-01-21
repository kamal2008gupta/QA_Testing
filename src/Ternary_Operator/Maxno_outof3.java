package Ternary_Operator;

public class Maxno_outof3
{
    public static void main(String[] args) {
        // find the max no  from the given three no
        int a=5, b=20,c=30;
        String max= a>b ? ((a>c ? " A Is G":"C is G" )) : ((b>c ? "b is g" : "C is g"));
        System.out.println(max);
    }
}
