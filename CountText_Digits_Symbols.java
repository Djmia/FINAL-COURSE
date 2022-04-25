import java.util.Scanner;

public class VhodTest {
    public static void main(String[] args) {
        // Пребройте колко са цифрите и принтирайте резултата;
        // Пребройте колко са буквите и принтирайте резултата;
        // Принтирайте общия брой символи в поредицата;

        Scanner input = new Scanner(System.in);
        System.out.println("Въведи произволни цифри и букви");
        String anyText = input.next();
        int count = 0;
        int numbers = 0;

        for (int i = 0; i < anyText.length(); i++) {
            if (Character.isLetter(anyText.charAt(i)))
                count++;
        }
        numbers = anyText.length() - count;
        System.out.println("Цифрите са: " + numbers);
        System.out.println("Буквите са: " +count);

        int symbols = anyText.length();
        System.out.println("Общ брой въведени символи: " + symbols);
    }
}

