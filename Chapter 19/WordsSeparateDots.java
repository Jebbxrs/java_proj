import java.util.Scanner;
public class WordsSeparateDots{
    public static void main(String[] args) {
        String firstWord = new String(), secondWord = new String();
        int diff;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        firstWord = scan.nextLine();
        System.out.println("Enter second word: ");
        secondWord = scan.nextLine();

        diff = 30 - (firstWord.length() + secondWord.length());
        System.out.print(firstWord);
        while (diff >= 0){
            System.out.print(".");
            diff--;
        }
        System.out.println(secondWord); 
        scan.close();
    }
}