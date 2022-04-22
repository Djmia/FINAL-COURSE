import java.util.*;

public class SborPol4isla_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Въведете положително число до 100");
        int myNum1 = input.nextInt();
        int sum = 0;


        for (myNum1 = myNum1; myNum1 <= 100; myNum1++) {
            if (myNum1 <= 0) {
                System.out.println("Числото следва да е >0 и <100");
                break;

            }
            sum += myNum1;

        }
        System.out.println(sum);

    }

}
