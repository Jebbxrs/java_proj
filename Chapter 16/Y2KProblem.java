import java.util.Scanner;
public class Y2KProblem {
    public static void main(String[] args){
        int birthYear, currentYear, age;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Year of birth: ");
        birthYear = scan.nextInt();
        System.out.printf("Current year: ");
        currentYear = scan.nextInt();

        if (birthYear < currentYear) 
            age = currentYear - birthYear;
        else 
            age = (currentYear + 100) - birthYear; 
        System.out.println("Your age: " + age);
        scan.close();
    }
}
