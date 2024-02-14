import java.util.Scanner;
public class DistanceBrickTravels {
    public static void main(String[] args){
        double distance, time, g = 32.174;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the number of seconds: ");
        time = scan.nextDouble();
        
        distance = g / 2.0 * Math.pow(time, 2);

        System.out.printf("Distance: %.3f", distance);
        scan.close();
    }
}
