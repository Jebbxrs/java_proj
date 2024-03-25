import java.util.Scanner;
public class InputFilePrompt {
    public static void main(String[] args) {
        String input;
        boolean isValidExtension = false, isValidFileName = false, isValidFile = false;
        Scanner scan = new Scanner(System.in); 

        do {
            System.out.print("Input file: ");
            input = scan.nextLine();

            isValidExtension = false; isValidFileName = false;

            if (!input.endsWith(".dat"))
                System.out.println(">>>file name must end with .dat<<<");
            else 
                isValidExtension = true;
                
            if (input.charAt(0) == '.' && isValidExtension == true) 
                System.out.println(">>>file name missing<<<");    
            else if (input.contains(" "))
                System.out.println(">>>file name must not contain spaces<<<");          
            else 
                isValidFileName = true;

            if (isValidExtension == true && isValidFileName == true) {
                System.out.println("OK");
                isValidFile = true;
            }
        } while (isValidFile == false);
        scan.close();
    }
}
