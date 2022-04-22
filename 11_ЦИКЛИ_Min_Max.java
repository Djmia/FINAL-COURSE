import java.util.Scanner;

public class Zad4_Min_Max {
    public static void main(String[] args) {
        //Напишете програма за въвеждане на числа, докато потребителят пожелае,
        // накрая програмата трябва да покаже най-голямото и най-малкото въведени числа.
        // Подсказка: Може да използвате Integer.MIN_VALUE и Integer.МАX_VALUE

        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String end = "Y";
        do {
            System.out.println("Въведи номер");
            int a = input.nextInt();
            if (a > max) {
                max = a;
            } else if (a < min) {
                min = a;
            }
            System.out.println("Желаеш ли да продължиш? Y or N");
            end = input.next();
        } while (!end.equalsIgnoreCase("n"));
        System.out.println("Най-малкото въведено число е: " + min);
        System.out.println("Най-голямото въведено число е: " + max);
    }
}
