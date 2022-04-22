import java.util.Scanner;

import static java.lang.Math.*;

public class H_W_8_zad5_diskriminanta {
    public static void main(String[] args) {
        //Квадратното уравнение има следния вид: ax2 + bx + c = 0
        //където a,b,c входни параметри и реални числа, и a ≠ 0.
        // Всяко квадратно уравнение може да има 0, 1 или 2 реални корена
        //получени по следната формула:
        //      -b +- sqrt(b*b - 4ac)
        // x = -----------------------
        //              2a

        //Числото D = b2 - 4ac се нарича дискриминанта.
        //Ako D < 0, квадратното уравнение няма реални корени.
        //Ako D = 0, корените са еднакви, т.е уравнението има 1 реален корен x1 = x2 = -b/2a
        //Ako D > 0, квадратното уравнение има 2 реални корена.
        //Да се намерят корените

        Scanner input = new Scanner(System.in);
        System.out.println("Въведи стойност за 'а': ");
        int numA = input.nextInt();
        if (numA == 0) {
            System.out.println("Променлива 'a', трябва да е различна от 0");
            } else {
            System.out.println("Въведи стойност за 'b': ");
            int numB = input.nextInt();
            System.out.println("Въведи стойност за 'c': ");
            int numC = input.nextInt();

            int numD = (numB * numB - 4 * numA * numC); // Изчисляване D - дискриминанта
            System.out.println("Дискриминантата D = " + numD);
                if (numD > 0) {
                System.out.println("т.е Уравнението има 2 корена");
                double numX1 = ((-(numB) + sqrt(numD))/2*numA);
                double numX2 = ((-(numB) - sqrt(numD))/2*numA);

                System.out.printf("\t\tПървия корен е Х1 = %.2f%n " , numX1);
                System.out.printf("\t\tВтория корен е Х2 = %.2f%n " , numX2);

                } else {
                    if (numD < 0) {
                        System.out.println("Дискриминантата е < 0 ==> Уравнението няма корени");
                    } else {
                        if (numD == 0) {
                            System.out.println("Дискриминантата D = 0, ==> Уравнението има един корен");
                            double numX3 = -(numB/2*numA);
                            System.out.printf("\t\tКорена на уравнението е Х = %.2f%n " , numX3);
                        }
                    }
                }
            }

         }
    }






