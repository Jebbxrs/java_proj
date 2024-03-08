import java.util.Scanner;
public class WedgeOfStars {
    public static void main(String[] args) {
        int input, j = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Initial number of stars: ");
        input = scan.nextInt();
    
        while (input > 0){
            while (j < input) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            input--;
            j = 0;
        }
        scan.close();
    }
}
