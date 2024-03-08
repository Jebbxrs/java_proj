import java.util.Scanner;
public class RunOfIntegers{
    public static void main(String[] args){
        int start, end;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Start: ");
        start = scan.nextInt();

        System.out.println("Enter End: ");
        end = scan.nextInt();
        System.out.println("");

        while (start <= end){
            System.out.println(start);
            start++;
        }
        scan.close();
    }
}