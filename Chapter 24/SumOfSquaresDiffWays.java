import java.util.Scanner;
public class SumOfSquaresDiffWays {
    public static void main(String[] args) {
        int input, instance = 0, k_temp = 0, j_temp = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        input = scan.nextInt();

        for (int j = (int) Math.sqrt(input / 2); j * j < input; j++) {
            int k = (int) Math.sqrt(input - j * j);
            if (j * j + k * k == input) {
                instance++;

                if (instance == 1) {
                    j_temp = j;
                    k_temp = k;
                }
                else if (instance == 2) {
                    System.out.println(input + " is the sum of 2 squares in two different ways");
                    System.out.println(input + " == " + j_temp + "*" + j_temp + " + " + k_temp + "*" + k_temp);
                    System.out.println(input + " == " + j + "*" + j + " + " + k + "*" + k);
                    instance++;
                }
                else if (instance > 2)
                    System.out.println(input + " == " + j + "*" + j + " + " + k + "*" + k);
            }
        }
        if (instance < 2) 
            System.out.println(input + " is not a sum of two positive integers in two different ways.");
        scan.close();
    }
}
