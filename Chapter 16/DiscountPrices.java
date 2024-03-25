import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args){
        int amount, floatToInt;
        float discount;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of purchases: ");
        amount = scan.nextInt();
        
        if (amount > 10)
            discount = amount * (float)0.9;
        else 
            discount = amount;

        floatToInt = (int)discount;
                
        System.out.printf("Discounted price: %d\n", floatToInt);
        scan.close();
    }
}
