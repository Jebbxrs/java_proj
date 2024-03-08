import java.util.Scanner;
public class AddingUpSquaresCubes {
    public static void main(String[] args) {
        int sumSquares = 0, sumCubes = 0, limit, i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        limit = scan.nextInt();

        while (i <= limit) {
            sumSquares += Math.pow(i, 2);
            sumCubes += Math.pow(i, 3);
            i++;
        }
        System.out.println("Sum of squares: " + sumSquares);
        System.out.println("Sum of cubes  : " + sumCubes);
        scan.close();
    }
}
