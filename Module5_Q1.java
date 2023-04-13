
/*
 In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
 */
import java.util.Scanner;

public class Module5_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double average = (a + b + c) / 3.0;
        System.out.println("Average is " + average);
    }
}
