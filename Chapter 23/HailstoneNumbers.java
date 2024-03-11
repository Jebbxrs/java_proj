import java.util.Scanner;
public class HailstoneNumbers{
    public static void main(String[] args) {
        long input;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        input = scan.nextInt();

        if (input < 1) {
            System.out.println("Error: Invalid input.");
            System.exit(1);
        }
        
        while (input >= 1) {
            if (input % 2 == 0) {
                System.out.println(input + "\t(even, next value is " + input + "/2)");
                input /= 2;
            }
            else if (input == 1){
                System.out.println(input + "\t(stop calculation)");
                break;
            }
            else {
                System.out.println(input + "\t(odd, next value is 3 * "  + input + " + 1)");
                input = input * 3 + 1;
            }
        }
        scan.close();
    }
        
}