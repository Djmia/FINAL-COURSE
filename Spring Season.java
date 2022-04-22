import java.util.Scanner;

public class H_W_7_SpringSeasen {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter DAY number: ");
            int myDay = input.nextInt();
            System.out.println("Enter Month number: ");
            int myMonth = input.nextInt();

            if (myDay >= 20 && myMonth >= 3 || myDay <= 20 && myMonth <= 6) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

        }
    }