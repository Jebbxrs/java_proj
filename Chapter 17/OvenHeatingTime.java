import java.util.Scanner;
public class OvenHeatingTime{
    public static void main (String[] args){
        byte items;
        int time, minutes, seconds;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many items to heat: ");
        items = scan.nextByte();
        if (items <= 0){
            System.out.println("Invalid amount of items to heat.");
            System.exit(0);
        }
        if (items > 3){
            System.out.println("Heating more than three items at once is not recommended.");
            System.exit(0);
        }
        System.out.print("Time for one item: ");
        time = scan.nextInt();        
       
        if (items == 1)
            time = time * 1;
        if (items == 2)
            time = time * 150 / 100;
        if (items == 3)
            time *= 2;
                
        minutes = time / 100;
        seconds = time % 100;

        System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
        scan.close();
    }
}