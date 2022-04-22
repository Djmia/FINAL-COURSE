import java.util.Scanner;

public class Zad2_cicle_Repeat {
    public static void main(String[] args) {
        //Напишете цикъл do-while, който иска от потребителя да въведе две числа.
        // Числата трябва да се добавят и сумата да се показва.
        // Цикълът трябва да попита потребителя дали желае да изпълни операцията отново.
        // Ако е така, цикълът трябва да се повтори; в противен случай трябва да се прекрати.
        Scanner input = new Scanner(System.in);
        String answer;


        do {
            System.out.println("Въвдете число 1");
            int num1 = input.nextInt();
            System.out.println("Въвдете число 2");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("Сумата им е: " + sum);
            System.out.println("==========================");
            System.out.println("\nЖелаете ли да продължите?, \nДА --> Y; \nНЕ --> всеки друг бутон");
            answer = input.next();

            } while (answer.equalsIgnoreCase("Y"));
        System.out.println("Довиждане !!!");
        }
    }

