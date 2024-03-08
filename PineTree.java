public class PineTree {
    public static void main(String[] args){
    int star = 1, space = 7, newline = 8, i = 0, j = 0;
    // Triangle
    while (newline > 0){
        while (star > i){
            while (space > j){
                System.out.print(" ");
                j++;
                }
            System.out.print("*");
            i++;
            }
        System.out.println();
        newline--;
        star += 2;
        space--;
        i = 0;
        j = 0;
        } 
    // Trunk
    space = 6;
    star = 3;
    newline = 3;
    while (newline > 0){
        while (star > i){
            while (space > j){
                System.out.print(" ");
                j++;
                }
            System.out.print("*");
            i++;
            }
        System.out.println();
        newline--;
        i = 0;
        j = 0;
        }
    }    
}
