import java.util.*;
public class Fakturiel {
    public static void main(String[] args) {

        // Използваме формулата n*(n-1)*(n-2).....до n
        // пускаме безкраен цикъл докато n = 1, чупим

        Scanner input = new Scanner(System.in);

        System.out.println("Въведете ФАКТУРИЕЛ n! = ");
        int n = input.nextInt();
        long factorial = 1;

        while (true) {
            if (n == 1) {
                break;
            }
            factorial = n*factorial;
            n--;
        }
        System.out.println("n! = " + factorial);
    }
}


