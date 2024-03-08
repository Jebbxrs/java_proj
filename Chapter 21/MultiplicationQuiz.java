import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz {
    public static void main(String[] args) {
        int answer, i = 0, correctItems = 0, prod, num1, num2, totalItems;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Multiplication Quiz");
        System.out.print("How many questions do you want to answer? ");
        totalItems = scan.nextInt();
        if (totalItems < 0) {
            System.out.println("Error. Invalid number of questions.");
            System.out.println("Terminating program...");
            System.exit(1);
        }
        while (i < totalItems){
            if (i % 5 == 0 && i > 0 && totalItems > 5) {
                System.out.print("\033[H\033[2J"); 
                System.out.flush(); 
            }
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            System.out.print((i + 1) + ". What is " + num1 + " * " + num2 + "? ");
            answer = scan.nextInt(); 
            prod = num1 * num2;
            if (answer == prod){
                System.out.println("Correct!");
                correctItems++;
            }
            else 
                System.out.println("Wrong. " + num1 + " * " + num2 + " is " + prod);
            i++;
        }
        System.out.println("You answered " + correctItems + " out of " + totalItems + " questions correctly!");
        scan.close();
    }
}    
