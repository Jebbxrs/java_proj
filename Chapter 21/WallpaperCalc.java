import java.util.Scanner;
import java.text.DecimalFormat;
public class WallpaperCalc {
    public static void main(String[] args){
        double roomHeight, roomWidth, roomLength, roomArea, openingLength, openingWidth, openingAreaSum = 0, openingArea, rolls;
        final double wallpaperLength = 4.5, wallpaperWidth = 27;
        int i = 0, openings;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Wallpaper Calculator");
        System.out.print("Enter the length of the room (in feet): ");
        roomLength = scan.nextDouble();
        System.out.print("Enter the width of the room (in feet): ");
        roomWidth = scan.nextDouble();
        System.out.print("Enter the height of the room (in feet): ");
        roomHeight = scan.nextDouble();
        System.out.print("How many openings are in the room? ");
        openings = scan.nextInt();

        while (i < openings) {
            System.out.print("Enter the length of opening number " + (i + 1) + " (in feet): ");
            openingLength = scan.nextDouble();
            System.out.print("Enter the width of opening number " + (i + 1) + " (in feet): ");
            openingWidth = scan.nextDouble();
            openingArea = openingLength * openingWidth;
            openingAreaSum += openingArea;
            i++;
        }
        System.out.print("\033[H\033[2J"); // clears screen
        System.out.flush();  // resets cursor position

        roomArea = (2 * roomLength * roomWidth) + (2 * roomHeight * roomLength);
        rolls = (roomArea - openingAreaSum) / (wallpaperLength * 3 * wallpaperWidth);
        System.out.println("\t\t***Summary of Details***");
        System.out.println();
        System.out.println("Area of room to be covered: " + df.format((roomArea - openingAreaSum)) + " sq. ft.");
        System.out.println("Approximate amount of wallpaper rolls needed: " + (int)Math.ceil(rolls) + " rolls");
        System.out.println("Actual amount of wallpaper rolls needed: " + df.format(rolls) + " rolls");
        scan.close();
    }
}
