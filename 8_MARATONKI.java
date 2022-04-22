import java.util.Scanner;

public class H_W_8_zad1_obuvki {
    public static void main(String[] args) {

        //Tрябва да си купите нови маратонки. Оглеждате офертите, но имате няколко изисквания:
        //1. Цената им не трябва да е над 150 лв.;
        //2. Tрябва да са размер 44 или 45;
        //3. Tрябва да не са черни;
        //4. Tрябва задължително да можете да ги върнете;
        //▪ Напишете проверка с IF-ELSE която да отразява всички условия.
        int price;
        float size;
        boolean black = true; // по подразбиране е false
        boolean canReturn = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи цена: ");
        price = input.nextInt();

        if (price <= 150) {
            System.out.println(">> Цената е в граници");
            System.out.println("-----------------------");
            System.out.println("Въведи размер");
            size = input.nextFloat();
            if (size <= 45 && size >= 44) {
                System.out.println(">> Размера е ОК");
                System.out.println("-----------------------");
                String output1 = black ? "ДА" : "НЕ";
                System.out.println("Черни ли са? ==> " + output1);
                String output2 = canReturn ? "ДА" : "НЕ";
                System.out.println("Има ли опция за връщане? ==> " + output2);
                System.out.println("---------------------------------------------");
                if (black && canReturn){
                    System.out.println(">>> Всичко е в граници и можеш да купиш обувките");

                } else {
                    System.out.println("Не можеш да купиш тези обувки");
                }
            } else {
                System.out.println("Размера не ти е по мярка!");
            }
        } else {
            System.out.println("Цената е прекалено висока!");
        }
    }
}
