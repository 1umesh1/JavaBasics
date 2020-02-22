/*Module Project - Trip Planner*/


import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Vacation_Planner {
    public static void main(String[] args)
    {
        greeting();
        Time_Budget();
        TimeDiff();
        CountryArea();

    }

    public static void greeting()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String Nam=input.nextLine();
        System.out.print("Nice to meet you "+Nam+" , where are you travelling to? ");
        String Add=input.nextLine();
        System.out.println("Great ! "+ Add+" sounds like a great trip");
        System.out.println("*******************************");

    }

    public static void Time_Budget()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int day = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?  ");
        int budg = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String curr = input.next();
        System.out.print("How many "+curr+"are there in 1 USD? ");
       double Rate = input.nextDouble();

        System.out.println("If you are travelling for"+day+"days that is the same as "+(day*24) +"hours or "+(day*24*60)+" minutes \n" +
                "If you are going to spend $"+budg+ " USD that means per day you can spend up to "+ perday(budg,day));
        System.out.println("Your total budget in "+curr+" is "+ (budg*Rate)+" "+curr+","+" which per day is 3252.85 "+" "+curr+"\n ******************************************************************************");

    }

    public static void TimeDiff()
    {
        Scanner hours = new Scanner(System.in);

        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Integer hrs=hours.nextInt();
        System.out.println("That means that when it is midnight at home it will be "+(12+(hrs))+":00"+
                " in your travel destination \n when it is noon at home it will be"+(12+(hrs))+":00");
        System.out.println("*********************************");

    }
    public static void CountryArea()
    {
        Scanner area=new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        Integer Ar=area.nextInt();
        System.out.println("In miles2 that is "+Ar*0.386);
        System.out.println("********************");


    }
    public static  double perday(int budg,int day )
    { double a=((budg*1.0)/(day*1.0) )*100;
        int b= (int) a;
        a=(double)b/100;
        return(a);
    }


}
