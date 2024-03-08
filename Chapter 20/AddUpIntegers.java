import java.util.Scanner;
public class AddUpIntegers {
    public static void main(String[] args){
        int numCount, i = 0, sum = 0;
        Scanner scan =  new Scanner(System.in);

        System.out.println("How many integers will be added? ");
        numCount = scan.nextInt();

        while (i < numCount) {
            System.out.println("Enter a number: ");
            sum += scan.nextInt();
            i++;
        }       
        System.out.println("The sum is: " + sum);
        scan.close();
    }
}