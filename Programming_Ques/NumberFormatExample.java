package Programming_Ques;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatExample {

	public static void main(String args[]) {

        // Example 1 - by using NumberFormat class
        NumberFormat myFormat = NumberFormat.getInstance();
        double[] numbers = {1.16763, 443330, 30, 1000,1000000,517827.17};

        System.out.println("adding commas to number in Java using NumberFormat class");
        for (double d : numbers) {
            System.out.println(myFormat.format(d));
        }

        // Example 2 - By using DecimalFormat class
        DecimalFormat decimalFormat = new DecimalFormat("#,#");

        System.out.println("adding commas to number in Java using DecimalFormat class");
        for (double d : numbers) {
            System.out.println(decimalFormat.format(d));
        }
    }

}
