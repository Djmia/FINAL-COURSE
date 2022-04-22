import java.util.Scanner;

public class Zad7_PIN_Code {
    public static void main(String[] args) {
        //Напишете програма, в която потребителят въвежда пинкод от конзолата
        // и има само три опита да отгатне правилния пинкод на акаунта.
        // Задавате пинкода като константа.
        // Ако потребителят въведе правилният пин -> „Правилно, добре дошли обратно“.
        // При неправилно въвеждане -> „Неправилно, опитайте отново.“.
        // При изчерпване на опитите се показва „Съжаляваме, акаунтът ви е заключен“.

        Scanner input = new Scanner(System.in);
        int pin = 2584;
        int userPin;
        int i;
        for (i = 0; i <= 2; i++) {
            System.out.println("\nВъведи ПИН-код !");
            System.out.println("====================");
            userPin = input.nextInt();
            if (pin == userPin) {
            System.out.println("Правилен ПИН-код, \nДОБРЕ ДОШЛИ");
            break;
            } else {
            if (i == 2) {
                System.out.println("\nСъжалявам, акаунтът е ЗАКЛЮЧЕН");
            } else {
                System.out.println("\nГРЕШЕН КОД !!!, опитай отново");

            }
        }


    }

}
}
