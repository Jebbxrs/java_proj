import java.util.Scanner;

public class FindIntSumTwoSquares {
    public static void main(String[] args) {
        int input, instance = 0, num1 = 0, num2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit: ");
        input = scan.nextInt();
        for (int k = 0; k < input; k++) {
            for (int i = 0; Math.pow(i, 2) < k; i++) {
                for (int j = 0; Math.pow(j, 2) + Math.pow(i, 2) <= k; j++) {
                    if (Math.pow(j, 2) + Math.pow(i, 2) == k && instance < 2){
                        num1 = i;
                        num2 = j;
                        instance++;
                    }
                    else if (Math.pow(j, 2) + Math.pow(i, 2) == k && instance == 2) {
                        System.out.println(k + " is a sum of two squares");
                        System.out.println("Instance " + (instance - 1) + ": " + k + " = " + num1 + "*" + num1 + " + " + num2 + "*" + num2);
                        System.out.println("Instance " + (instance) + ": " + k + " = " + i + "*" + i + " + " + j + "*" + j);
                        instance++;
                    }
                    else if (Math.pow(j, 2) + Math.pow(i, 2) == k && instance >= 2) {
                        System.out.println("Instance " + (instance) + ": " + k + " = " + i + "*" + i + " + " + j + "*" + j);
                        instance++;
                    }
                }
            }
            instance = 0;
        }
        scan.close();
    }
}

