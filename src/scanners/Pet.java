package scanners;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
//        String name = "james";
//        String lastname = "bond";
//        int age =45;
//        String location = " London ,UK";
//        Boolean = (TRUE,FALS)


        Scanner input = new Scanner(System.in);
        System.out.println(" what is your name ?");
        String name = input.nextLine();
        System.out.println("welcome," + name + "!");
        String from = input.next();
        System.out.println(from + "is cool ");
        int age = input.nextInt();
        System.out.println((age + " great age!"));





    }

    public static class Task {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" what month is it?");
            int month = input.nextInt();
            System.out.println("day :");

            int day = input .nextInt();

            System.out.println("year ");

            int year = input .nextInt();

             String date = month + "/" +  day + "/" + year;
            System.out.println(date);
            year+= 5;
            day -= 1;
            String day2 = month + "/" + day +"/" + year;
            int age =  input.nextInt();
            int age2 = 65 - age;
            System.out.println(day2);










        }
    }
}
