import java.util.Scanner;
public class LoginSimulator {
    public static void main(String[] args) {
        boolean login = false;
        String inputUser = new String(), inputPassword = new String();
        final String user1 = new String("gates"), pass1 = new String("monopoly");
        final String user3 = new String("jobs"), pass3 = new String("apple");
        final String user4 = new String("joy"), pass4 = new String("sun");
        final String user5 = new String("root"), pass5 = new String("secret");
        Scanner scan = new Scanner(System.in);

        while (login == false) {
            System.out.println("Enter username: ");
            inputUser = scan.nextLine();
            System.out.println("Enter password: ");
            inputPassword = scan.nextLine();

            if (inputUser.equals("quit") && inputPassword.equals("exit")) 
                login = true;
            else if (inputUser.equals(user1) && inputPassword.equals(pass1))
                System.out.println("You have logged in with priority level 1.");
            else if (inputUser.equals(user3) && inputPassword.equals(pass3))
                System.out.println("You have logged in with priority level 3.");
            else if (inputUser.equals(user4) && inputPassword.equals(pass4)) 
                System.out.println("You have logged in with priority level 4.");
            else if (inputUser.equals(user5) && inputPassword.equals(pass5))
                System.out.println("You have logged in with priority level 5.");
            else
                System.out.println("Failed to login.");
        }
        System.out.println("System shutting down...");
        scan.close();
    }
}