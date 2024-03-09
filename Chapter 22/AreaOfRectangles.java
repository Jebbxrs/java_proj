import java.util.Scanner;
public class AreaOfRectangles {
    public static void main(String[] args) {
        int xCord1, xCord2, yCord1, yCord2, width = 1, height = 1, area;
        Scanner scan = new Scanner(System.in);

        System.out.println("Computer Aided Design Program");
        while(width != 0 || height != 0) {
            System.out.print("First corner X coordinate: ");
            xCord1 = scan.nextInt();
            System.out.print("First corner Y coordinate: ");
            yCord1 = scan.nextInt();
            System.out.print("Second corner X coordinate: ");
            xCord2 = scan.nextInt();
            System.out.print("Second corner Y coordinate: ");
            yCord2 = scan.nextInt();

            width = Math.abs(xCord1 - xCord2);
            height = Math.abs(yCord1 - yCord2);
            area = width * height;

            System.out.println("Width: " + width + "\tHeight: " + height + "\tArea: " + area);
        }
        System.out.println("Program End.");
        scan.close();
    }
}
