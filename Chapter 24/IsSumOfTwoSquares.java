import java.util.Scanner;

public class IsSumOfTwoSquares {
    public static void main(String[] args) {
        int input, instance = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Sum of Two Squares Checker");
        System.out.println("Enter a positive integer: ");
        input = scan.nextInt();

        if (input <= 0) {
            System.out.println("Error: Invalid input.");
            System.exit(1);
        }

        for (int i = 0; Math.pow(i, 2) < input; i++) {
            for (int j = 0; Math.pow(j, 2) + Math.pow(i, 2) <= input; j++) {
                if (Math.pow(j, 2) + Math.pow(i, 2) == input){
                    System.out.println("It is a sum of two squares");
                    System.out.println(input + " = " + i + "*" + i + " + " + j + "*" + j);
                    instance++;
                }
            }
        }
        if (instance == 0) 
            System.out.println("It is not a sum of two squares");
        scan.close();
    }
}