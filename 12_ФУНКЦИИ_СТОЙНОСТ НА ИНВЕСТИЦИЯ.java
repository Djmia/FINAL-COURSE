import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // ���������� 1000 ��.
        // ����� 10 %
        // ���� 5 ������
        
        Scanner input = new Scanner(System.in);
        double investEnd = calcInvest(input);
       
       
    }
    
    public static double calcInvest(Scanner input) {
       
        System.out.println("������ �������� �� ������������");
        double glavnitsa = input.nextDouble();
        System.out.println("������ ������� ������ �������");
        double lihva = input.nextDouble();
        lihva = lihva/100; //10% = 0.10
        System.out.println("������ ���� �� ������������");
        double srok = input.nextDouble();
        srok = srok*12; // 5 ���. = 60 ������
        
        double investEnd = glavnitsa*lihva*srok/12;
        double investMonths = glavnitsa*lihva/12;
        System.out.printf("|����������    |%.2f%n|����� ������  |%.2f%n|�����         |%.2f%n\n|���.�����     |%.2f%n", glavnitsa, investEnd, (glavnitsa+investEnd), investMonths);
        
        return investEnd;
       
      
    
}

}