import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Prints asterisk as there is more of each in the next lines for 5 lines
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //goes opposite of the previous
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //prints 5 asterisk for 5 lines
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}