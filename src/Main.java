import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Welcome to the Gasoline Price Calculator!\n" +
                    "Please choose which type of gasoline your vehicle takes\n" +
                    "Regular, Plus, Premium, or Diesel. When you are done enter Exit: ");
            String input = scan.nextLine();

            if(input.equals("Exit")) {
                System.out.println("Exiting the program. Goodbye!");
                return;
            }

            switch(input) {

                case "Regular":
                    calculatePriceOfRegular();
                    break;

                case "Plus":
                    calculatedPriceOfPlus();
                    break;

                case "Premium":
                    calculatedPriceOfPremium();
                    break;

                case "Diesel":
                    calculatedPriceOfDiesel();
                    break;

                default:
                    System.out.println("Invalid. Must choose from provided options");
                    break;
            }
        }
    }
    public static void calculatePriceOfRegular() {
        double regularPricePerGallon = 4.879;
        System.out.println("How many gallons do you need?");
        int gallonsOfRegularNeeded = scan.nextInt();
        double totalPriceOfRegular = regularPricePerGallon * gallonsOfRegularNeeded;
        System.out.println("Your total price is: " + "$" + totalPriceOfRegular);
    }
    public static void calculatedPriceOfPlus() {
        double plusPricePerGallon = 5.10;
        System.out.println("How many gallons do you need?");
        int gallonsOfPlusOfNeeded = scan.nextInt();
        double totalPriceOfPlus = plusPricePerGallon * gallonsOfPlusOfNeeded;
        System.out.println("Your total price is:" + "$" + totalPriceOfPlus);
    }
    public static void calculatedPriceOfPremium() {
        double premiumPricePerGallon = 5.26;
        System.out.println("How many gallons do you need?");
        int gallonsOfPremiumNeeded = scan.nextInt();
        double totalPriceOfPremium = premiumPricePerGallon * gallonsOfPremiumNeeded;
        System.out.println("Your total price is:" + "$" + totalPriceOfPremium);
    }
    public static void calculatedPriceOfDiesel() {
        double dieselPricePerGallon = 5.39;
        System.out.println("How many gallons do you need?");
        int gallonsOfDieselNeeded = scan.nextInt();
        double totalPriceOfDiesel = dieselPricePerGallon * gallonsOfDieselNeeded;
        System.out.println("Your total price is: " + "$" + totalPriceOfDiesel);
    }
}