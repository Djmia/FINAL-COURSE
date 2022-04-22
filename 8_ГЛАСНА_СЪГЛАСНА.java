import java.util.Scanner;

public class H_W_8_zad4_glasna_saglasna {
    public static void main(String[] args) {
        //Да напишем Java програма, която проверява дали
        //дадена буква е гласна или съгласна
        //▪Гласните в английския език са “a”, “e”, “i”, “o”, “u”
        //▪Да проверим какво се въвежда в конзолата и да не приемаме друго освен букви
        //▪https://www.javatpoint.com/java-ascii-table - да проверим asci таблицата
        // кои са главните и кои са +малките букви.


        String myString;
        String aa = "a";
        String ee = "e";
        String ii = "i";
        String oo = "o";
        String uu = "u";

        Scanner scan = new Scanner(System.in);
        System.out.println("Напиши буква за да проверим дали е Гласна или Съгласна");
        myString = scan.next();

        // System.out.println(myString.compareToIgnoreCase(aa));
        // System.out.println(myString.compareToIgnoreCase(ee));
        // System.out.println(myString.compareToIgnoreCase(ii));
        // System.out.println(myString.compareToIgnoreCase(oo));
        // System.out.println(myString.compareToIgnoreCase(uu));

        if (myString.isEmpty()) {
            System.out.println("Грешка. Въведи буква");
        } else {
            if (!myString.matches("[a-zA-Z]+")) {
                System.out.println("Грешка, не е буква. Въведи буква");
            } else {
                if (myString.compareToIgnoreCase(aa) == 0 || myString.compareToIgnoreCase(ee) == 0
                        || myString.compareToIgnoreCase(ii) == 0 || myString.compareToIgnoreCase(oo) == 0 ||
                        myString.compareToIgnoreCase(uu) == 0) {
                    System.out.println("Гласна");
                } else {
                    System.out.println("Съгласна");
                }

            }
        }
    }
}