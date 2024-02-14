import java.util.Scanner;
public class HarmonicMean {
    public static void main(String[] args){
        int x, y;
        double arithmeticMean, harmonicMean;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = scan.nextInt();
        System.out.println("Enter Y: ");
        y = scan.nextInt();

        arithmeticMean = (x + y) / 2;
        harmonicMean = 2 / (1.0 / x + 1.0 / y);

        System.out.printf("Arithmetic mean: %.1f\n", arithmeticMean);
        System.out.println("Harmonic   mean: " + harmonicMean);
        scan.close();
    }
}
