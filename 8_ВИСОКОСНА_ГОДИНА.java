import java.util.Scanner;

public class H_W_8_zad3_visokosna_godina {
    public static void main(String[] args) {
        //Да напишем Java програма, която да проверява дали
        //дадена година е високосна. Една година е високосна, ако:
        //1. Дели се равномерно на 100
        //2. Ако се дели на 100, то трябва да се дели и на 400
        //3. С изключение на това, всички останали години,
        //делящи се равномерно на 4, са високосни.

        Scanner input = new Scanner(System.in);
        System.out.println("Въведи година");
        int year = input.nextInt();

        boolean isDivisibleOf4 = (year %4) ==0; //Дели ли се на 4, без остатък
        System.out.println(isDivisibleOf4);
        boolean isNotDivisibleOf100 = (year % 100) != 0; //да не е век
        System.out.println(isNotDivisibleOf100);
        boolean isDivisibleOf100and400 = ((year % 100 == 0) && (year % 400 == 0)); //дели ли се на 100 и 400 без остатък

        if (isDivisibleOf4 && (isNotDivisibleOf100 || isDivisibleOf100and400)) {
            System.out.println(year + "\nВисокосна година");
        } else {
            System.out.println("Не е високосна година");
        }
    }
}
