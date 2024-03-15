import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Gasoline Price Calculator!\n" +
                "Please choose which type of gasoline your vehicle takes:\n" +
                "Regular, Plus, Preimium, or Diesel: ");
        Scanner scan = new Scanner (System.in);
        String input = scan.nextLine();
        while(true) {
            switch(input) {
                case "Regular":
                    break;
                case "Plus":
                    break;
                case "Preimium":
                    break;
                case "Diesel":
                    break;
            }
        }
    }
}