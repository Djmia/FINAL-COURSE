import java.util.Scanner;
class H_W_7_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of Body Mass Index (BMI):");
        System.out.println("-------------------------------------");
        System.out.println("Enter your weight in kilograms (ex.78.5) : ");
        float W = input.nextFloat();
        System.out.println("Enter your height in meters (ex:178 cm = 1.78) : ");
        double h = input.nextDouble();
        h *= h;
        double bmiResult = W / h;
        long bmiRound = (long)bmiResult;

        System.out.println("Your BMI index is : " + bmiRound);

        int low = 18;
        int normal = 25;
        int high = 29;

        if (bmiRound < 18) {
            System.out.println("Your BMI index is : UNDERWEIGHT");
        } else {
            if (bmiRound >= 18 && bmiRound <= 25) {
                System.out.println("Your BMI index is : NORMAL");
            } else {
                System.out.println("Your BMI index is : OVERWEIGHT");

            }
        }

    }
}
