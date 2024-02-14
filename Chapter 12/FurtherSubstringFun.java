import java.util.Scanner;
public class FurtherSubstringFun {
    public static void main (String[] args){
        String sentence;
        int beginIndex, endIndex;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        sentence = scan.nextLine();
        System.out.println("Enter beginning index: ");
        beginIndex = scan.nextInt();    
        System.out.println("Enter ending index: ");
        endIndex = scan.nextInt();

        String newString = sentence.substring(beginIndex, endIndex);

        System.out.println("Original string:");
        System.out.println(sentence);
        System.out.println(" ");
        System.out.println("Substring:");
        System.out.println(newString);
        scan.close();
    }
}
