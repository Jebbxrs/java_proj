import java.util.Scanner;
import java.text.DecimalFormat;
public class JetLagCalc {
    public static void main(String[] args) {
        int hours, zones, departure = 0, arrival = 0, deptConv, arrvConv, attempts = 3;
        boolean loopCheck = false;
        double recoverDays;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("00");
        
        // Input
        System.out.println("Jet Lag Calculator");
        System.out.print("Enter the estimated length of your flight in hours: ");
        hours = scan.nextInt();
        System.out.print("Enter the number of time zones crossed during the flight: ");
        zones = scan.nextInt();
        while (loopCheck == false){
            System.out.print("Enter the time of departure in 24-hour time format (e.g. 1824 = 6:24 P.M.): ");
            departure = scan.nextInt();
            if ((departure % 100 > 59 || departure % 100 < 0 || departure / 100 > 24  || departure / 100 < 0) && attempts > 0){
                System.out.println("Warning: Invalid time entered. You have " + attempts + " attempts left.");
                attempts--;
            }
            else if (attempts == 0){
                System.out.println("You have reached the maximum number of attempts.");
                System.out.println("Terminating Program...");
                System.exit(0);
            }
            else 
                loopCheck = true;
        }
        loopCheck = false;
        attempts = 3;
        while (loopCheck == false){
            System.out.print("Enter the time of arrival in 24-hour time format (e.g. 1824 = 6:24 P.M.): ");
            arrival = scan.nextInt();
            if ((arrival % 100 > 59 || arrival % 100 < 0 || arrival / 100 > 24  || arrival / 100 < 0) && attempts > 0){
                System.out.println("Invalid time entered. You have " + attempts + " attempts left.");
                attempts--;
            }
            else if (attempts == 0){
                System.out.println("You have reached the maximum number of attempts.");
                System.out.println("Terminating Program...");
                System.exit(0);
            }
            else 
                loopCheck = true;
        }
        System.out.print("\033[H\033[2J"); // clears screen
        System.out.flush();  // resets cursor position

        deptConv = departureConvert(departure);
        arrvConv = arrivalConvert(arrival);
        recoverDays = (hours / 2.0 + (zones - 3) + deptConv + arrvConv) / 10.0; 
        // Output
        System.out.println("Summary");
        System.out.println("Flight length: " + hours + " hours");
        System.out.println("Number of time zones crossed: " + zones);
        System.out.println("Time of departure: " + df2.format(departure / 100) + ":" + df2.format(departure % 100));
        System.out.println("Time of arrival: " + df2.format(arrival / 100) + ":" + df2.format(arrival % 100));
        System.out.printf("Number of days till recovery: %.2f", recoverDays);        
        scan.close();
    }
    public static int departureConvert (int departure){
        if (departure >= 800 && departure <= 1200)
            return 0;
        else if (departure >= 1200 && departure <= 1800)
            return 1;
        else if (departure >= 1800 && departure <= 2200)
            return 3;
        else if (departure >= 2200 || departure <= 100)
            return 4;
        else
            return 5;
    }

    public static int arrivalConvert (int arrival){
        if (arrival >= 800 && arrival <= 1200)
            return 4;
        else if (arrival >= 1200 && arrival <= 1800)
            return 2;
        else if (arrival >= 1800 && arrival <= 2200)
            return 0;
        else if (arrival >= 2200 || arrival <= 100)
            return 1;
        else
            return 3;
    }
}
