package Ternary_Operator;
import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
//        Grade system for class as Below
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        Scanner scan=new Scanner(System.in);
        // Ask for user input
        System.out.println("enter the number from 0 to 100");
        int number= scan.nextInt();
        char result= (number>90)? 'A' : (number>80)? 'B' : (number>70)? 'C' : (number>60)? 'D' : 'F';
        System.out.println("grade of the student is :"+result);


    }

}
