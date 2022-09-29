package at.ac.fhcampuswien;

import javax.swing.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum;
        sum = (int)a + b + c + (int)d + (int)e +(int) f + (int)g +(int) h;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int sum = x + y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print("Before Swap:\nx: y: ");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:\nx: "+x+"\ny: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        System.out.print("n1: ");
        System.out.print("n2: ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if (x > y) {
            System.out.println("n1 > n2");
        } else if (y > x) {
            System.out.println("n2 > n1");

        } else if (x == y) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        Scanner s = new Scanner(System.in);
       int revenue =  s.nextInt();
        if (revenue <  0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue >= 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue >= 20000 && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue >= 50000 && revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (revenue >= 80000 && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        switch (eingabe){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        Scanner s =  new Scanner(System.in);
        int year = s.nextInt();
        if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println("Leapyear");
        }else
            System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner s = new Scanner(System.in);
        System.out.print("Number: ");
        int number = s.nextInt();
        int result;
        result = number % 10 * 100 + (number/10) % 10 * 10 + (number/100);
        System.out.println(result);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}