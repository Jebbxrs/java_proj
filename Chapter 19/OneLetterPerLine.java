import java.util.Scanner;
public class OneLetterPerLine {
    public static void main(String[] args){
        String input;
        int i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        input = scan.nextLine();

        while (i < input.length()){
            System.out.println(input.charAt(i));
            i++;
        }
        scan.close();
    }
}
