import java.util.Scanner;

public class SquareAndTriangle {
    public static void main(String[] args) {
        int limit, sum = 1, j = 1;
        boolean triangle = false, square = false;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter upper limit: ");
        limit = scan.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i == sum) {
                triangle = true; 
                j++;
                sum += j;
            }
            if (Math.sqrt(i) == (int)Math.sqrt(i))
                square = true;

            if (triangle == true && square == true) 
                System.out.println(i + " is both a triangle number and a square number.");
            triangle = false;
            square = false;
        }
        scan.close();
    }
}