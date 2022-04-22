import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {

        // Направете програма DrawSquare, която въвежда размер на квадрат (0, 30]
        // и го печата на екрана така:
        // # # # #
        // # # # #
        // # # # #
        // # # # #

        Scanner input = new Scanner(System.in);
        System.out.println("Въведи страна на квадрат");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("Моля въведете положителна стойност");
        } else {

            for (int row = 0; row < size; row++) {
                {
                    for (int cow = 0; cow < size; cow++) {
                        System.out.print("#  ");
                    }
                    System.out.println();

                }


            }
        }
    }
}