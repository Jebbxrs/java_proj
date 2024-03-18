import java.util.Scanner;

public class CubicSumTwoSquares {
    public static void main(String[] args) {
        int input, instance = 0, j_temp = 0, k_temp = 0;
        boolean isCube = false, isSumOfSquares = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            int cube = (int) Math.cbrt(i);
            if (Math.pow(cube, 3) == i) {
                isCube = true;

                for (int j = (int) Math.sqrt(i / 2); j * j < i; j++) {
                    int k = (int) Math.sqrt(i - j * j);
                    if (j * j + k * k == i) {
                        isSumOfSquares = true;
                        instance++;

                        if (isCube == true && isSumOfSquares == true && instance == 1) {
                            j_temp = j;
                            k_temp = k;
                        }
                        else if (isCube == true && isSumOfSquares == true && instance == 2) {
                            System.out.println(i + " is a cube: " + (int)Math.cbrt(i) + "^3");
                            System.out.println(i + " is the sum of 2 squares");
                            System.out.println(i + " == " + j_temp + "*" + j_temp + " + " + k_temp + "*" + k_temp);
                            System.out.println(i + " == " + j + "*" + j + " + " + k + "*" + k);
                            instance++;
                        }
                        else if (isCube == true && isSumOfSquares == true && instance > 2)
                            System.out.println(i + " == " + j + "*" + j + " + " + k + "*" + k);
                    }
                }
            }
            isCube = false;
            isSumOfSquares = false;
            instance = 0;
        }
        scan.close();
    }
}
