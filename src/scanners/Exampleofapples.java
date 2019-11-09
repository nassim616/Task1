package scanners;

import java.util.Scanner;

public class Exampleofapples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("minutes : ");
        int minutes = input.nextInt();
        int hours = minutes/60 ;
        int remainder = minutes%60;
        System.out.println(hours + " hours " + remainder + " minutes");


    }
}
