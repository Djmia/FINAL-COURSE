import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPasswordValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи парола");
        String pass = input.nextLine();
        boolean isValid = passwordCheck(pass);
        System.out.println("Вашата парола е: " + isValid);

    }

    public static boolean passwordCheck (String pass) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&*-+=^]).{6,}&");
        Matcher matcher = pattern.matcher(pass);
        boolean isPasswordCorrect = matcher.find();
        return isPasswordCorrect;
    }



}
