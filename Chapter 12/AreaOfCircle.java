import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int radius;
        double area;

        System.out.printf("Input the radius: ");
        radius = scan.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("The area is: " + area);
        scan.close();
    }
}
