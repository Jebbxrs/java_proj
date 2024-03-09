import java.util.Scanner;
public class InRangeAdder {
    public static void main(String[] args) {
        int lowRange, highRange, input = 1, sumInRange = 0, sumOutRange = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("In-range Adder");
        System.out.print("Enter low end of range: ");
        lowRange = scan.nextInt();
        System.out.print("Enter high end of range: ");
        highRange = scan.nextInt();

        if (lowRange == 0 || highRange == 0 || lowRange > highRange) {
            System.out.println("Invalid input(s). Terminating program...");
            System.exit(0);
        }

        while (input != 0) {
            System.out.print("Enter data: ");
            input = scan.nextInt();

            if (input <= highRange && input >= lowRange)
                sumInRange += input;
            else 
                sumOutRange += input;
        }
        System.out.println("Sum of in-range values: " + sumInRange);
        System.out.println("Sum of out-of-range values: " + sumOutRange);
        scan.close();        
    }
}
