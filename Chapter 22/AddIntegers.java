import java.util.Scanner;
public class AddIntegers {
    public static void main(String[] args){
        int input, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer (or 0 to end the program): ");
        input = scan.nextInt();

        if (input == 0) {
            System.out.println("No integers were entered.");
            System.out.println("Terminating Program...");
            System.exit(1);
        }
        else 
            sum += input;

        while (input != 0){
            System.out.print("Enter the next integer (or 0 to end the program): ");
            input = scan.nextInt();
            if (input != 0)
                sum += input;
        }

        System.out.println("Sum of integers: " + sum);
        System.out.println("End of program...");
        scan.close();
    }    
}
