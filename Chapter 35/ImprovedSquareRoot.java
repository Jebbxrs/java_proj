import java.util.Scanner;
public class ImprovedSquareRoot {
    public static void main(String[] args) {
        int input;
        String response;
        double root;
        boolean loop = false, responseLoop = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a number --> ");
            input = scan.nextInt();

            if (input < 0) 
                System.out.println(">>>number must be positive<<<");
            else {
                responseLoop = false;
                root = Math.sqrt(input);
                System.out.println("Square root of " + input + " is " + root); 
                do {
                    System.out.print("Do you wish to continue (yes or no)? ");
                    response = scan.next().toUpperCase();
                    
                    if (response.equals("YES"))
                        responseLoop = true;
                    else if (response.equals("NO")) {
                        System.out.println("Bye");
                        responseLoop = true;
                        loop = true;
                    }
                    else 
                        System.out.println(">>>Please respond with yes or no<<<");
                } while (responseLoop == false);
            }

        } while (loop == false);
        scan.close();
    }
}
