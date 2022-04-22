import java.util.Scanner;

public class Palidron {
    public static void main(String[] args) {
        String original = "";
        String reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи дума или число, \nза проверка дали е палидрон или не");
        original = input.next();
        int lenght = original.length();
        for (int i = lenght - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
            if (original.equalsIgnoreCase(reverse)) {
            System.out.println("Думата или числото е Палидрон");
        }
            else {
            System.out.println("Думата или числото НЕ Е Палидрон");
        }

    }
}
