import java.util.Random;
import java.util.Scanner;

public class gtn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("***********************************************");
        System.out.println("Welcome to the 'Guessing the Number' game..");
        System.out.println("***********************************************");
        System.out.println("Please enter a number between '1-100'");
        int gues = sc.nextInt();
        int number = rnd.nextInt(101);

        while(true) {
            while(gues != number) {
                if (gues < 1 && gues > 100) {
                    System.out.println("Please enter between 1 and 100:");
                    gues = sc.nextInt();
                } else if (gues < number) {
                    System.out.println("Enter a larger number:");
                    gues = sc.nextInt();
                } else {
                    System.out.println("Enter a smaller number:");
                    gues = sc.nextInt();
                }
            }

            System.out.println("Congratulations you won. The number is:" + gues);
            return;
        }
    }
}

