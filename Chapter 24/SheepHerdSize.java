public class SheepHerdSize {
    public static void main(String[] args) {
        double power = 1, sheepCount;

        for (int years = 0; years <= 25; years++) { 
            sheepCount = 220 / (1 + 10 * power);
            System.out.println("Year " + years + "\t\tSheep count: " + (int)sheepCount);
            power *= 0.86;
        }       
    }
}
