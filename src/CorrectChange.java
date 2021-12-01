import java.util.Scanner;

public class CorrectChange {
3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a whole number of cents: ");
        int cents = input.nextInt();
        int dollar = (cents/100) ;
        cents = (cents - (100*dollar));
        int quarter = (cents/25);
        cents = (cents - (25*quarter));
        int dime = (cents/10);
        cents = (cents - (10*dime));
        int nickel = (cents/5);
        cents = (cents - (5*nickel));
        int pennies = (cents/1);
        cents = (cents - (1*pennies));
        System.out.println("You have " + dollar + " dollars," + quarter + " quarters," + dime + " dimes," + nickel + " nickels," + " and " + pennies + " pennies."  );




    }
}
