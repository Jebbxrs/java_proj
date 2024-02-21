import java.text.DecimalFormat;
import java.util.Scanner;

public class MidnightMadness {
    public static void main(String[] args){
        byte age;
        int time, hour, minute;
        final double adultTicket = 8.00, adultMatinee = 5.00, childTicket = 4.00, childMatinee = 2.00;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("Enter customer's age: ");
        age = scan.nextByte();
        System.out.printf("Enter time: ");
        time = scan.nextInt();
        
        hour = time / 100;
        minute = time % 100;

        if (hour <= 0 || hour > 24 || minute < 0 || minute > 59){
            System.out.println("Error: Invalid time.");
            System.exit(0);
        }
        else if (age < 0){
            System.out.println("Error: Invalid age.");
            System.exit(0);
        }
        else if (age > 13){
            if (hour < 17)
                System.out.println("Ticket price: $" + df.format(adultMatinee));
            else if (hour >= 22 && minute > 0)
                System.out.println("Ticket price: $" + df.format(childTicket));
            else 
                System.out.println("Ticket price: $" + df.format(adultTicket));
        }
        else {
            if (hour < 17)
                System.out.println("Ticket price: $" + df.format(childMatinee));
            else if (hour >= 22 && minute > 0)
                System.out.println("Error: Children cannot purchase tickets after 10 PM.");
            else 
                System.out.println("Ticket price: $" + df.format(childTicket));
        }
        scan.close();
    }
}
