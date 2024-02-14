import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args){
        int volts, resistance;
        double current;
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Input the voltage: ");
        volts = scan.nextInt();

        System.out.printf("Input the resistance: ");
        resistance = scan.nextInt();

        current = (volts + 0.0) / resistance;
        
        System.out.println("Current: " + current + " amps");
        scan.close();
    }
}
