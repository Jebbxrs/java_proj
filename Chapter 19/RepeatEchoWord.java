import java.util.Scanner;
public class RepeatEchoWord {
    public static void main(String[] args){
        String inputString = new String();
        int times, i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        inputString = scan.nextLine();
        System.out.println();

        times = inputString.length();
        while (i <= times){
            System.out.println(inputString);
            i++;
        }
        scan.close();
    }
}
