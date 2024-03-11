package Uppgift;

import java.util.Scanner;

import static Uppgift.MorseCodeConverter.toEnglish;
import static Uppgift.MorseCodeConverter.toMorse;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1. English to morse code");
        System.out.println("2. Morse to english");

        try {
            int option = Integer.parseInt(scan.nextLine());

            MorseCodeConverter converter = new MorseCodeConverter();

            if (option == 1) {
                System.out.println("Enter a word:");
                String EngText = scan.nextLine();
                String Morse = toMorse(EngText);
                System.out.println("Your word in morse code:" + Morse);
            } else if (option == 2) {
                System.out.println("Enter your morse code: ");
                String InputMorse = scan.nextLine();
                String Decoded = toEnglish(InputMorse);
                System.out.println("Morse code to english: " + Decoded);
            } else {
                System.out.println("Invalid option. Please choose 1 or 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
