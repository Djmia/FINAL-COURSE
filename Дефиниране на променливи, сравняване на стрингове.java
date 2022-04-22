public class HomeWork_Lesson4 {
    public static void main(String[] args) {
        //Задача 1 - Дефинирайте променливи със ст-ти
        //-250, 250, 4 589 498, 10 000 000 000 000 000 000, -9 000 000 000 000 000 000
        //Изведете всяка пром. на екрана с println()
     System.out.println("\nЗадача 1 - дефиниране на променливи - целочислени");
     short prom1 = -250;
     short prom2 = 250;
     int prom3 = 4589498;
     double prom4 = 10000000000000000000d;
     long prom5 = -9_000_000_000_000_000_000L;

     System.out.println(prom1);
     System.out.println(prom2);
     System.out.println(prom3);
     System.out.println(prom4);
     System.out.println(prom5);

        //Задача 2 - Дефинирайте променливи със ст-ти
        //43 112, -1 357 674, 1 357 674, -1 357 674 000, 3 657 895 000
        //Изведете всяка пром. на екрана с println()
      System.out.println("\nЗадача 2 - Дефиниране на променливи - целочислени");
      int prom6 = 43_112;
      int prom7 = -1357674;
      int prom8 = 1357674;
      int prom9 = -1357674000;
      long prom10 = 3657895000L;

      System.out.println(prom6);
      System.out.println(prom7);
      System.out.println(prom8);
      System.out.println(prom9);
      System.out.println(prom10);

        //Задача 3 - Дефинирайте променливи със ст-ти
        //4,9876543,   7.123456789012345678890,   18 398 458 438 583 853.28,
        //18 398 458 438 583 853.39875937284928422
        //Изведете всяка пром. на екрана с println()
      System.out.println("\nЗадача 3 - Дефиниране на променливи - с плаваща запетая");
      float prom11 = 4.987_654_3f;
      double prom12 = 7.123456789012345678890d;
      double prom13 = 18398458438583853.28d;
      double prom14 = 18398458438583853.39875937284928422d;

      System.out.println(prom11);
      System.out.println(prom12);
      System.out.println(prom13);
      System.out.println(prom14);

        //Задача 4 - Напишете програма която:
          String work1 = "4.1 Извежда името ви в конзолата";
          String work2 = "4.2 Сравнява го с име на приятел, като използвате \n" +
                  "equals(), equalsIgnoreCasa(), compareTo(), резултатите да се изведат на отделни редове";
          String work3 = "4.3 Долепя до името ви, вашата фамилия на нов ред";
          String work4 = "4.4.Извежда на нов ред вашата възраст";
          String work5 = "4.5.Извежда името, фамилията и годините ви на един ред";
          String work6 = "4.6.Извежда името, фамилията и годините на приятеля ви на нов ред";
            //деклараирайте и инициализирайте променливи
            //може да се използват методите със събиране на нивзове

      System.out.println("\n" + work1);
            String myName = "Milen";
            String myFamName = "Angelov";
            byte myAge = 40;
            String frName = "Stela";
            String frFamName = "Ivanova";
            byte frAge = 39;
            System.out.println(myName);

      System.out.println("\n" + work2);
            System.out.println(myName.equals(frName));
            System.out.println(myName.equalsIgnoreCase(frName));
            System.out.println(myName.compareTo(frName));

      System.out.println("\n" + work3);
            System.out.println(myName + "\n" + myFamName);

      System.out.println("\n" + work4);
            System.out.println("Моята възраст е:\t" + myAge + "\tгодини");

      System.out.println("\n" + work5);
            System.out.println(myName + "\t" + myFamName + "\t" + myAge);

      System.out.println("\n" + work6);
         System.out.println(frName + "\t" + frFamName + "\t" + frAge);


         char endGame = '\u2705';
         char endGame2 = '\u27AA';

      System.out.println("\n\n" + endGame2 + endGame2 + endGame2);
      System.out.println("" + endGame + endGame + endGame + "\tКРАЙ НА ДОМАШНОТО\t" + endGame + endGame + endGame);

    }





}
