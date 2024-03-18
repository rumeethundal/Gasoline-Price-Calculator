import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to the Gasoline Price Calculator!\n" +
                    "Please choose which type of gasoline your vehicle takes, or exit\n" +
                    "Regular, Plus, Premium, Diesel, or Exit: ");

            String input = scan.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                return;
            }

            if (!input.equals("regular") && !input.equals("plus") && !input.equals("premium") && !input.equals("diesel")) {
                System.out.println("Invalid. Must choose from provided options\n");
                continue;
            }

            switch (input) {

                case "regular":
                    calculatePriceOfRegular();
                    break;
                case "plus":
                    calculatedPriceOfPlus();
                    break;
                case "premium":
                    calculatedPriceOfPremium();
                    break;
                case "diesel":
                    calculatedPriceOfDiesel();
                    break;
            }
        }
    }
    public static void calculatePriceOfRegular() {
        double regularPricePerGallon = 4.88;
        System.out.println("How many gallons do you need?");
        int gallonsOfRegularNeeded = scan.nextInt();
        scan.nextLine();
        double totalPriceOfRegular = regularPricePerGallon * gallonsOfRegularNeeded;
        printTotal(totalPriceOfRegular);
    }
    public static void calculatedPriceOfPlus() {
        double plusPricePerGallon = 5.10;
        System.out.println("How many gallons do you need?");
        int gallonsOfPlusOfNeeded = scan.nextInt();
        scan.nextLine();
        double totalPriceOfPlus = plusPricePerGallon * gallonsOfPlusOfNeeded;
        printTotal(totalPriceOfPlus);
    }
    public static void calculatedPriceOfPremium() {
        double premiumPricePerGallon = 5.26;
        System.out.println("How many gallons do you need?");
        int gallonsOfPremiumNeeded = scan.nextInt();
        scan.nextLine();
        double totalPriceOfPremium = premiumPricePerGallon * gallonsOfPremiumNeeded;
        printTotal(totalPriceOfPremium);
    }
    public static void calculatedPriceOfDiesel() {
        double dieselPricePerGallon = 5.39;
        System.out.println("How many gallons do you need?");
        int gallonsOfDieselNeeded = scan.nextInt();
        scan.nextLine();
        double totalPriceOfDiesel = dieselPricePerGallon * gallonsOfDieselNeeded;
        printTotal(totalPriceOfDiesel);
    }

    public static void printTotal(double totalPrice) {
        System.out.printf("Your total price is:  $%.2f",totalPrice);
        System.out.println("\n----------------------------------------- \n");
    }
}