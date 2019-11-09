package scanners;

import java.util.Scanner;

public class wall {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("what is the wall color?");
        String color = input.nextLine();
        System.out.println(" what is the length ?");
        int length = input.nextInt();
        System.out.println(" is it good one ?");
        String answer =input.nextLine();
        System.out.println("color:" + color );
        System.out.println("length :"+ length);
        System.out.println("good :" + answer );




    }
}
