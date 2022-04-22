import java.util.Scanner;

public class HomeWork_Lesson_6 {
    public static void main(String[] args) {

        //Задача 1 - Напишете програма, която чете 1 число от конзолата, изчислява му
        //корен квадратен и отпечатва резултата на екрана, с точност до 5-тия знак

        System.out.println("\nЗадача 1 - програма за изчисляване на коренквадратен до 5-я знак");
        double myNum;
        System.out.println("Моля въведете число:");

        Scanner scan = new Scanner(System.in);
        myNum = scan.nextInt();
        System.out.printf("Отговор: %.5f", Math.sqrt(myNum));


        //Задача 2 - Напишете програма, която прочита число от конзолата и отпечатва
        //дали то е четно или нечетно. (Подсказка: използвайте оператора ?:)

        System.out.println("\n\nЗадача 2 - чете число и показва дали то е четно или не");
        int myInt;
        System.out.println("Моля въведете число: ");
        myInt = scan.nextInt();
        myInt = myInt % 2; //показва остатъка при делене на "2",
        // т.е ако остатъка е 1 - нечетно, ако е 0 - четно

        boolean prov = myInt > 0;
        String output = prov ? "НЕ" : "ДА";
        System.out.println("Четно ли е? ==> " + output);


        // Задача 3 - Нека имате ученици със следните оценки: Иванчо - 2, Ани – 5,
        //Марийка - 6, Пенчо - 4, Бориславчо - 5. Използвайте printf да
        //отпечатате оценките им в табличен вид, всеки ученик - на отделен
        System.out.println("\n\nЗадачча 3 - Ученически дневник в таблица");
        System.out.println("Моля въведи произволно число: "); //Исках да направя да се въвежда конкретно число за парола
        //например 1234, и само ако е вярно на въведенето да продължи нататък
        int myPass;
        myPass = scan.nextInt();

        String Ivan = "Ivan"; String Ani = "Ani"; String Maria = "Maria";
        byte Ivan1 = 2; byte Ani1 = 5; byte Maria1 = 6;
        String Pencho = "Pencho"; String Borislavcho = "Borislavcho";
        byte Pencho1 = 4; byte Borislavcho1 = 5;

        String ocenka = "Оценка"; String ime   = "Име";

        System.out.println("");
        System.out.println("ЕЛЕКТРОНЕН ДНЕВНИК\n");
        System.out.printf("|%-12S|%6S|%n", ime, ocenka);
        System.out.printf("|%-12s|%6d|%n", Ivan, Ivan1);
        System.out.printf("|%-12s|%6d|%n", Ani, Ani1);
        System.out.printf("|%-12s|%6d|%n", Maria, Maria1);
        System.out.printf("|%-12s|%6d|%n", Pencho, Pencho1);
        System.out.printf("|%-12s|%6d|%n", Borislavcho, Borislavcho1);

        scan.close();

    }











}
