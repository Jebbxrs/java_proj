import java.text.DecimalFormat;
public class TableOfSines {
    public static void main(String[] args){
        double angle = -90.0;
        double radians = angle * Math.PI / 180.0;
        DecimalFormat numform = new DecimalFormat("0.000000");
        DecimalFormat numform2 = new DecimalFormat("0.0");

        System.out.println("angle\t  sine");
        System.out.println("-----   --------");
        System.out.println("-90.0\t  " + numform2.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println("-75.0\t  " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println("-60.0\t  " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println("-45.0\t  " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println("-30.0\t  " + numform2.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println("-15.0\t  " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;  
        System.out.println("  0.0\t   " + numform2.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 15.0\t   " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 30.0\t   " + numform2.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 45.0\t   " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 60.0\t   " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 75.0\t   " + numform.format(Math.sin(radians)));
        angle = angle + 15.0;
        radians = angle * Math.PI / 180.0;
        System.out.println(" 90.0\t   " + numform2.format(Math.sin(radians)));
    }
}
    
