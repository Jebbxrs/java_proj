import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args){
        int gallons, gauge, milesPerGallon, total;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tank capacity: ");
        gallons = scan.nextInt();
        System.out.println("Gauge reading: ");
        gauge = scan.nextInt();
        System.out.println("Miles per gallon: ");
        milesPerGallon = scan.nextInt();

        total = (gallons * milesPerGallon) * (gauge / 100);
        
        if (total >= 200)
            System.out.println("Safe to Proceed.");
        else 
            System.out.println("Get Gas!");
        scan.close();
    }
}
