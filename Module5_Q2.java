
/*
 In a program, input the side of a square. You have to output the area of the
square.
 */
import java.util.Scanner;

public class Module5_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        System.out.println("Area is " + side * side);
    }

}
