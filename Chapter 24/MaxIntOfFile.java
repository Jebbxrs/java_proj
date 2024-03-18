/*This program reads the first 5 integers in a given file and prints out the maximum value and sum of the integers.
 * Written by: Vince Jevy Tapdasan
 * Date: March 15, 2024;
 */
import java.util.Scanner;

public class MaxIntOfFile {
    public static void main(String[] args) {
        int max = 0, fileInput, numCount = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
 
        while (numCount < 5) {
            fileInput = scan.nextInt();

            if (fileInput > max) {
                max = fileInput;
            }
            sum += fileInput;
            numCount++;
        }
        System.out.println("Sum of integers: " + sum);
        System.out.println("Maximum of integers: " + max);
        scan.close();
    }
}