import java.util.Scanner;
public class LogBaseTwo {
    public static void main(String[] args){
        double input, base;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter a double: ");
        input = scan.nextDouble();

        base = Math.log(input) / Math.log(2);

        System.out.println("Base 2 log of " + input + " is " + base);
        scan.close(); 
    }
}
