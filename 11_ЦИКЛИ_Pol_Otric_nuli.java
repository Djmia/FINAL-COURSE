import java.util.Scanner;

public class Zad3_Pol_Otric_nuli {
    public static void main(String[] args) {
        //Напишете програма, в която потребителят да въвежда числа,
        // докато пожелае, и накрая трябва да покаже броя на въведените
        // положителни
        // отрицателни
        // и нули.

        Scanner input = new Scanner(System.in);
        int polojitelni = 0;
        int otriszateln = 0;
        int nuli = 0;
        String stop = "Y";
        System.out.println("Въведи число");


        do {
            int num = input.nextInt();
            if (num > 0) {
                polojitelni++;
                } else if (num < 0) {
                otriszateln++;
                } else if (num == 0){
                nuli++;
            }
            System.out.println("\nЖелаеш ли да продължиш");
            stop = input.next();



        } while (stop.equalsIgnoreCase("Y"));
        System.out.println("Положителни чилса брой: " + polojitelni);
        System.out.println("Отрицателни чилса брой: " + otriszateln);
        System.out.println("Нули чилса брой: " + nuli);
    }
}
