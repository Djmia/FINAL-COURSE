import java.util.Scanner;
class H_W_7_Monts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи число и провери на кой месец отговаря: ");
        int myNum = input.nextInt();

        switch (myNum) {
            case 1: System.out.println("Януари"); break;
            case 2: System.out.println("Февруари"); break;
            case 3: System.out.println("Март"); break;
            case 4: System.out.println("Април"); break;
            case 5: System.out.println("Май"); break;
            case 6: System.out.println("Юни"); break;
            case 7: System.out.println("Юли"); break;
            case 8: System.out.println("Август"); break;
            case 9: System.out.println("Септември"); break;
            case 10: System.out.println("Октомври"); break;
            case 11: System.out.println("Ноември"); break;
            case 12: System.out.println("Декември"); break;
            default: System.out.println("Невалидно число");


        }

    }
}