
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose your Path");

        System.out.println(" 1. Explore the Enchanted Forest | 2. Sail the High Seas | 3. Join the Galactic Federation");

        int num = scnr.nextInt();

        if(num == 1){
            System.out.println("You chose to explore the enchanted forest.");
            System.out.println("Choose your Path");
            System.out.println("1. Befriend forest creatures | 2. Encounter fairy folk");
            int num2 = scnr.nextInt();
            if(num2 == 1){
                System.out.println("You chose to befriend forest creatures.");
                System.out.println("You encountered a mythical creature named Josh and he kills you.");
            } else if (num2 == 2) {
                System.out.println("You chose to encounter fairy folk.");
                System.out.println("The fairies were imps and killed you.");
            }
        } else if (num == 2){
            System.out.println("You chose to sail the high seas.");
            System.out.println("Choose your Path");
            System.out.println("1. Search for a crew | 2. Look for a ship");
            int num3 = scnr.nextInt();
            if(num3 == 1){
                System.out.println("You chose to search for a crew");
                System.out.println("You find a musician skeleton named Ricardo.");
                System.out.println("Shortly after he dies of an unknown disease");
            } else if (num3 == 2){
                System.out.println("You chose look for a ship");
                System.out.println("Choose your Path");
                System.out.println("1. Steal a ship | 2. Build a ship");
                int num4 = scnr.nextInt();
                if(num4 == 1){
                    System.out.println("You chose to steal a ship");
                    System.out.println("You tried to steal a ship and got sent to jail.");
                } else if(num4 == 2){
                    System.out.println("You chose to build a ship");
                    System.out.println("While building your ship a log falls and crushes you to your death.");
                }
            }
        } else if (num == 3){
            System.out.println("You chose to join the Galatic Federation.");
            System.out.println("Choose your Path");
            System.out.println("1. Become a Pilot | 2. Become a Bounty Hunter");
            int num6 = scnr.nextInt();
            if(num6 == 1){
                System.out.println("You chose to become a pilot and joined the Elite Squadron");
                System.out.println("Choose your path");
                System.out.println("1. Travel to newly discovered planet | 2. Travel to home planet");
                int num7 = scnr.nextInt();
                if(num7 == 1){
                    System.out.println("On your way to the newly discovered planet your ship is destroyed by an asteriod.");
                    System.out.println("Your suit is fully space-proof so you float through space for the rest of time");
                }
            } else if (num6 == 2){
                System.out.println("You chose to become a bounty hunter and quit the Galactic Federation");
                System.out.println("On your travels you encounter a rival bounty hunter");
                System.out.println("Choose your path");
                System.out.println("1. Fight | 2. Run");
                int num8 = scnr.nextInt();
                if(num8 == 1){
                    System.out.println("You chose to Fight");
                    System.out.println("In an intense battle you sustain life threating injuries");
                    System.out.println("You become paralyzed from the waist down");
                } else if (num8 == 2){
                    System.out.println("You chose to run");
                    System.out.println("While trying to escape you are shot down by a missile and die.");
                }
            }
        }

    }
}
