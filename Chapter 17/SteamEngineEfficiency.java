import java.util.Scanner;
public class SteamEngineEfficiency{
    public static void main(String[] args){
        double efficiency;
        int tempAir, tempSteam;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter air temperature in Kelvin: ");
        tempAir = scan.nextInt();

        System.out.print("Enter steam temperature in Kelvin: ");
        tempSteam = scan.nextInt();

        efficiency = 1.0 - (double)tempAir / tempSteam;
        if (tempSteam < 373)
            efficiency = 0;     

        System.out.printf("Efficiency: %.3f\n", efficiency);
        scan.close();
    }
}