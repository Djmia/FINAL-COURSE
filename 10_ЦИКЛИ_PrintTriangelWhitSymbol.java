import java.util.Scanner;

public class PrintTriangelWhitSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int j;
        System.out.println("Въведи страна на триъгълник");
        System.out.println("Ще го отпечатаме чрез символ");
        number = input.nextInt();
        System.out.println();
        for (int i = 0; i <= number; i++){
            for (j = 1; j <= number - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = number; k >= j - 1; k--) {
                System.out.print(" ");
            }
        }
    }
}
