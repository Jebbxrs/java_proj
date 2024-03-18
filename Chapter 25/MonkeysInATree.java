/*This program prints out the nursery rhyme "Monkeys in a Tree".
 * Written by Vince Jevy Tapdasan
 * Date: March 15, 2024
 */

public class MonkeysInATree {
    public static void main(String[] args) {
       String count = new String();

        for (int i = 5; i >= 0; i--) {
            if (i == 5) 
                count = "Five";
            else if (i == 4) 
                count = "Four";
            else if (i == 3) 
                count = "Three";
            else if (i == 2)
                count = "Two";
            else if (i == 1)
                count = "One";
            else {
                System.out.println("No little monkeys swinging in a tree");
                break;
            }
            
            System.out.println(count + " little monkeys swinging in a tree\n" +
            "Teasing Mr Crocodile \"you can't catch me\"\n" + 
            "Along came the crocodile as quiet as can be\n" + 
            "and SNAP!");
            System.out.println();
            
        }
    }
}
