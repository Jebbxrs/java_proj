import java.util.Scanner;
public class AvgAndStdDev{
    public static void main(String[] args) {
        double stdDeviation, avg, avgSquared, sum = 0, sumSquared = 0, input;
        int loopCount, i = 0;    
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of datas to process: ");
        loopCount = scan.nextInt();

        while (i < loopCount) {
            System.out.print("Enter data number " + (i + 1) + ": ");
            input = scan.nextDouble();
            sum += input;
            sumSquared += Math.pow(input, 2);
            i++;
        }
        avg = sum / loopCount;
        avgSquared = sumSquared / loopCount;
        stdDeviation = Math.sqrt(avgSquared - Math.pow(avg, 2));

        System.out.println("Average: " + avg);
        System.out.println("Standard deviation: " + stdDeviation);
        scan.close();
    }
}