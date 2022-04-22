import java.util.*;
public class PrintTriangel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Отпечатване на триъгълник по въведено число ");
        System.out.println("Въведете число ");
        int size = input.nextInt();


        for (int cow = 1; cow <=size; cow++ ) {
            for (int row = 1; row <= cow; row++ ) {
                System.out.print(cow + " ");
            }
            System.out.println();
        }
    }
}
