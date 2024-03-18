/*This program prints out the probability of a given amount of people not sharing the same birthdate.
  Written by: Vince Jevy Tapdasan
  Date: March 15, 2024
*/
import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        double probability = 1.0;
        int count;
        Scanner scan = new Scanner(System.in);

        System.out.println("This program prints the probability not sharing a birthday among a given number of people");
        System.out.print("Enter the number of people: ");
        count = scan.nextInt();

        for (int i = 1; i < count; i++) 
            probability *= (365 - i) / 365.0;
        System.out.println("The chance of " + count + " people not sharing a birthday is " + (probability * 100) + "%");
        scan.close();
    }
}
