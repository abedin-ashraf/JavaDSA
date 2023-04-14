
/*
 *Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
import java.util.Scanner;

public class Module5_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pencilPrice = input.nextFloat();
        float penPrice = input.nextFloat();
        float eraserPrice = input.nextFloat();

        float totalPrice = pencilPrice + penPrice + eraserPrice;
        System.out.println("Total cost is " + totalPrice);

        double totalPriceWithGST = totalPrice + (totalPrice * .18);
        System.out.println("Total Price with GST is " + totalPriceWithGST);

        int $ = 10;
        System.out.println($);
    }
}
