import java.util.Scanner;
import java.text.DecimalFormat;
public class YourAgeInSeconds{
    public static void main(String[] args){
        byte years, months, days;
        int totalDays = 0;
        long ageInSeconds;
        byte[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double percentLived;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Write your exact age in years, months, and days");
        System.out.println("Input the number of years: ");
        years = scan.nextByte();
        System.out.println("Input the number of months: ");
        months = scan.nextByte();
        System.out.println("Input the number of days: ");
        days = scan.nextByte();

        for (int i = 0; i <= months; i++)
            totalDays += daysPerMonth[i];
        ageInSeconds = ((((years * 365) + totalDays + days) * 24) * 3600);
        percentLived = ageInSeconds / 2.5E9 * 100;

        System.out.println("You have lived out " + df.format(percentLived) + "% of your expected lifespan.");
        scan.close();
    }
}