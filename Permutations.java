import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        long n, r, diff, permutations, fact = 1, fact2 = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter total number of objects: ");
        n = scan.nextInt();
        System.out.print("Enter number of objects selected: ");
        r = scan.nextInt();

        if (r > n){
            System.err.println("Error: Number of objects must be greater than number of objects selected.");
            System.exit(1);
        }
        diff = n - r;
        while (n > 0) {
            fact *= n;
            n--;
        }
        while (diff > 0) {
            fact2 *= diff;
            diff--;
        }
        permutations = fact / fact2;
        System.out.println("Number of possible permutations: " + permutations);
        scan.close();
    }
}
