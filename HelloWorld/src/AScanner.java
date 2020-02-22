import java.util.Scanner;

public class AScanner {

    public static void main(String[] args) {
        inputBirthday();
    }


    public static void inputBirthday() {
        Scanner age = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        Scanner year = new Scanner(System.in);


        String Ag = age.next();
        String Mo = month.next();
        String Ye = year.next();
        System.out.println("On what day of the month were you born? " + Ag);
        System.out.println("What is the name of the month in which you were born? " + Mo);
        System.out.println("During what year were you born? " + Ye);
        System.out.println("You were born on " + Mo + " " + Ag + ", " + Ye + ". You're mighty old!");


    }
}