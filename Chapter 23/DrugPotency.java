import java.text.DecimalFormat;
public class DrugPotency {
    public static void main(String[] args) {
        int month = 1;
        double effectiveness = 100.00;
        DecimalFormat df = new DecimalFormat("0.00"), df2 = new DecimalFormat("00");

        while (effectiveness >= 50.0) {
            effectiveness *= 0.96;
            if (effectiveness <= 50.0) 
                System.out.println("Month "+ df2.format(month) + "\tEffectiveness: " + df.format(effectiveness) + "% [DISCARDED]");
            else
                System.out.println("Month "+ df2.format(month) + "\tEffectiveness: " + df.format(effectiveness) + "%");
            month++;
        }
    }
}
