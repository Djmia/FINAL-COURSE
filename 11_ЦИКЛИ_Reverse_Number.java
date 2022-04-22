import java.util.*;

public class Zad6_Reverse_Number {
    public static void main(String[] args) {
        //Напишете програма ReverseNumber, която печата цифрите
        // на въведено от конзолата цяло число в обратен ред.
        // Например: 568739 -> 937865
        // Подсказка: Използвайте целочислено деление.
        //      int = 1234
        //      oatatak = 1234 % 10 = изкарва 4
        //      reverse = 0*10 + 4 = 4
        //      int = 1234/10 = 123
        //            int = 123
        //            ostatak = 123 % 10 = изкарва 3
        //            reverse = 4*10 + 3 = 43
        //            int = 123/10 = 12
        //                  int = 12
        //                  ostatak = 12 % 10 = изкарва 2
        //                  reverse = 43*10 + 2 = 432
        //                  int = 12/10 = 1
        //                      int = 1
        //                      ostatak = 1 % 10 = изкарва 1
        //                      reverse = 432*10 + 1 = 4321
        //                      int = 1/10 = 0
        //
//        System.out.println("Въведи номер");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int reverse = 0;
//
//        while (num != 0) {
//            int ostatak = num % 10;
//            reverse = reverse * 10 + ostatak;
//            num = num / 10;
//            System.out.println("Остатък при %10 : " + ostatak);
//            System.out.println("връща: reverse = recerse*10 + ostatak : " + reverse);
//            System.out.println("остатъчен номер: num/10 : "+ num);
//            System.out.println("================");
//        }
//        System.out.println("Номера отпечатан наобратно: " + reverse);
        System.out.println(new StringBuffer(String.valueOf(123456789)).reverse());


    }
}
