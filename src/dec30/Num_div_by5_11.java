package dec30;

import java.util.Scanner;

public class Num_div_by5_11
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the No:");
        int num= scan.nextInt();

        if(num%5==0)
        {
            System.out.println("no is divisble by 5 :"+num);
        } else if (num%11==0)
        {
            System.out.println("no is divisible by 11 : "+num);
        }
        else
        {
            System.out.println("no is not divisible by 5 and 11");
        }


    }
}
