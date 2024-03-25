import java.util.Scanner;

public class StringSwitcher {
  public static void main (String[] args) {
    String phrase;
    char response;
    boolean loopCheck2 = false;    
    String message = "Phrase is: ";
    Scanner scan = new Scanner(System.in);

    while (true) {
        message = "Phrase is: ";

        System.out.print("Enter an acronym: ");
        phrase = scan.next().toUpperCase();
    
        switch (phrase) {
        case "LOL":
            message = message + "Laugh Out Loud";
            break;
        case "LMAO":
            message = message + "Laughing My Ass Off";
            break;
        case "MFW":
            message = message + "My Face When";
            break;
        case "FR":
            message = message + "For Real";
            break;     
        case "BFF":
            message = message + "Best Friends Forever";
            break;
        case "IDK":
            message = message + "I don't know";
            break;
        case "SO":
            message = message + "Significant Other";
            break;     
        case "THX":                                                  
            message = message + "Thanks";
            break;           
        default:
            message = message + "unknown";
            break;                
        }
        System.out.println (message);
        loopCheck2 = false;
        while (loopCheck2 == false) {
            System.out.print("Would you like to use the program again? [Y/N]: ");
            response = scan.next().charAt(0);

            switch (response) {
                case 'y':
                case 'Y':
                    loopCheck2 = true;
                    break;
                case 'n':
                case 'N':
                    System.out.println("Program terminated.");
                    System.exit(1);
                default:
                    System.out.println("Invalid response.");
                    break;
            }
        }
        }
    }
}