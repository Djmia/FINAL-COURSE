import java.util.Scanner;

public class H_W_8_zad2_Sravnenie {
    public static void main(String[] args) {

        //Напишете програма, която проверява дали две числа
        //с плаваща запетая са еднакви до първият знак след
        //запетаята, вторият, третият или четвъртият.
        //▪Разликата между тях може да минимална…

        Scanner input = new Scanner(System.in);
        System.out.println("Проверка за равенство на 2 числа");
        System.out.println("---------------------------------");
        System.out.println("Въведи едно число с плаваща запетая \nдо 4-тия знак след запетаята: 'пр. 20,5678': ");
        float num1 = input.nextFloat();
        System.out.println("Въведи следващо число с плаваща \nдо 4-тия знак след запетаята: 'пр. 29,5612': ");
        float num2 = input.nextFloat();
        float result = Math.abs(num1 - num2);
        System.out.printf("%.4f%n", result);
        System.out.println("-------------------");

        if (result == 0.0000) {
            System.out.println("Еднакви до 4-ти знак");
        } else {
            if (result >= 0.0001 && result <= 0.0009) {
                System.out.println("Еднакви до 3-ти знак");
            } else {
                if (result >= 0.0010 && result <= 0.0099) {
                    System.out.println("Еднакви до 2-ри знак");
                } else {
                    if (result >= 0.0100 && result <= 0.0999) {
                        System.out.println("Еднакви до 1-ви знак");
                    } else {
                        System.out.println("Не са еднакви");
                    }
                }


            }
        }
    }
}
