package dec30;

import java.util.Scanner;

public class convertyear_month_days
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the no of Days");
        int days=scan.nextInt();

        // calculate the no of years
         int years=days/365;
        int rem_days_after_years=days%365;
         int month =rem_days_after_years/30;
         int day=month%30;
        System.out.println(days+ "days =" + years + " years, " + month + " months, " + day + " days");

    }
}
