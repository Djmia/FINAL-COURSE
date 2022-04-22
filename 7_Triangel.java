import java.util.Scanner;
class H_W_7_Triangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Програма за проверка на вид триъгълник :");
        System.out.println("----------------------------------------");
        System.out.println("Въведете страна 'X' :");
        float sideX = input.nextFloat();
        System.out.println("Въведете страна 'Y' :");
        float sideY = input.nextFloat();
        System.out.println("Въведете страна 'Z' :");
        float sideZ = input.nextFloat();

        if (sideX == sideY && sideX == sideZ) {
            System.out.println("Тригълника е: РАВНОСТРАНЕН");
            System.out.println("--------------------------");
        } else {
            if (sideX == sideY || sideX == sideZ || sideY == sideZ) {
                System.out.println("Тригълника е: РАВНОБЕДРЕН");
                System.out.println("--------------------------");
            } else {
                System.out.println("Тригълника е: РАЗНОСТРАНЕН");
                System.out.println("--------------------------");
            }
        }

        float perimeterP = (sideX + sideY + sideZ);
        System.out.printf("\nОбиколката на тригълника е: P = %.2f", perimeterP);
        float semiperimeterP = ((sideX + sideY + sideZ)/2);
        float px = (semiperimeterP - sideX);
        float py = (semiperimeterP - sideY);
        float pz = (semiperimeterP - sideZ);
        double faceS = Math.sqrt((semiperimeterP*px*py*pz));

        System.out.printf("\nЛицето: S = %.2f", faceS);

    }
}
