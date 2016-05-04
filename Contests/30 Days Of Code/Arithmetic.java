import java.util.Scanner;

/**
 * Created by hendrawd on 1/2/16.
 *
 * @see https://www.hackerrank.com/contests/30-days-of-code/challenges/day-2-arithmetic
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage

        // Enter your code here!
        // Run some computations....
        double tip = M * T / 100;
        double tax = M * X / 100;
        double finalPrice = M + tip + tax;

        int total = (int) Math.round(finalPrice);

        // ...then print!
        System.out.println("The final price of the meal is $" + total + ".");

    }
}
