import java.util.Scanner;
public class SumOfSquaresDiffWays {
    public static void main(String[] args) {
        int input, instance = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        input = scan.nextInt();

        for (int i = 0; Math.pow(i, 2) < input; i++) {
            for (int j = 0; Math.pow(j, 2) + Math.pow(i, 2) <= input; j++) {
                if (Math.pow(j, 2) + Math.pow(i, 2) == input && instance == 0){
                    System.out.println(input + " is a sum of two squares");
                    System.out.println("Instance " + (instance + 1) + ": " + input + " = " + i + "*" + i + " + " + j + "*" + j);
                    instance++;
                }
                else if (Math.pow(j, 2) + Math.pow(i, 2) == input && instance > 0) {
                    System.out.println("Instance " + (instance + 1) + ": " + input + " = " + i + "*" + i + " + " + j + "*" + j);
                    instance++;
                }
            }
            
        }
        if (instance == 0)
            System.out.println("It is not a sum of two squares");
        scan.close();
    }
}