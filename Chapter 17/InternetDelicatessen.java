import java.util.Scanner;
import java.text.DecimalFormat;
public class InternetDelicatessen {
    public static void main(String[] args){
        String input;
        double price, total, deliverPrice = 2.00;
        byte   delivery;

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter the item: ");
        input = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        System.out.print("Overnight delivery (0==no, 1==yes): ");
        delivery = scan.nextByte();

        if (price > 10.00)
            deliverPrice = 0.00;
        if (delivery == 1)
            deliverPrice += 3.00; 
        
        total = deliverPrice + price;
        System.out.println("Invoice: ");
        System.out.println(input + "\t" + df.format(price));
        System.out.println("delivery\t" + df.format(deliverPrice));
        System.out.println("total\t\t" + df.format(total));
        scan.close();            
    }
}