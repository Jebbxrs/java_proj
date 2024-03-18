/*This program prints out the natural logarithm up to a given number and redirects the output to an HTML file.
 * Written by: Vince Jevy Tapdasan
 * Date: March 15, 2024
*/
import java.text.DecimalFormat;

public class LogTable {
    public static void main(String[] args) {
        int x = 1;
        double logx;
        DecimalFormat df = new DecimalFormat("##.######");

        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");
        while (x < 50) {
            logx = Math.log(x);
            System.out.println("<tr><td>" + x + "</td><td>" + df.format(logx) + "</td></tr>");
            x++;
        }
        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
