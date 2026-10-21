package ie.atu.oop.week2;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while (!valid)
        {
            System.out.println("please enter a number:  ");
            String text = scan.nextLine();
            try {
                int pagecount = Integer.parseInt(text);
                System.out.println("you entered:" + text);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("you entered an invalid number");
            }
        }
    }
}
