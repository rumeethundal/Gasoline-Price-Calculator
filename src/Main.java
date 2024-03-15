import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Gasoline Price Calculator!\n" +
                "Please choose which type of gasoline your vehicle takes\n" +
                "Regular, Plus, Premium, or Diesel: ");
        String input = scan.nextLine();

        while(true) {
            switch(input) {
                case "Regular":
                    calculatePriceOfRegular();
                    break;

                case "Plus":
                    calculatedPriceOfPlus();
                    break;

                case "Preimium":
                    break;

                case "Diesel":
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
        double plusPricePerGallon = 5.098;
        System.out.println("How many gallons do you need?");
        int gallonsPlusOfNeeded = scan.nextInt();
        double totalPriceOfPlus = plusPricePerGallon * gallonsPlusOfNeeded;
        System.out.println("Your total price is:" + "$" + totalPriceOfPlus);
    }
}