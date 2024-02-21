import java.util.Scanner;
public class PieEatingContest {
    public static void main(String[] args){
        double weight;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Input contestant weight: ");
        weight = (int)scan.nextDouble();

        if (weight <= 280 && weight >= 250)
            System.out.println("Contestant's weight is allowed in the contest.");
        else 
            System.out.println("Contestant's weight is not allowed in the contest.");
        scan.close();
    }
}
