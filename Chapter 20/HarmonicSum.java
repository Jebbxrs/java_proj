import java.util.Scanner;
public class HarmonicSum {
    public static void main(String[] args){
        double sum = 0;
        int input, i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter limit: ");
        input = scan.nextInt();

        while (i < input){
            sum += 1.0 / (i + 1);
            i++;
        }
        System.out.println("Sum is: " + sum);
        scan.close();
    }
}
