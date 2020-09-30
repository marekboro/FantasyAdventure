import adventurers.Knight;

import creatures.Monster;
import sun.tools.jstat.Scale;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Runner {

    public static void main(String[] args) {
        Knight knight = new Knight(30,"Sir Squiggly");
        Monster ogre = new Monster("Ogre",50,4);
        int treasure = 100;
        Room room = new Room(knight,ogre,treasure);
        Scanner scanner = new Scanner(System.in);
        boolean gamestate = true;
        String endgame = "";




        System.out.println("Welcome to the game");
        System.out.println("- - - - - - - - - - -" );
        System.out.println(knight.getName() + " enters the room, the "+ ogre.getType() + " sees " + knight.getName());

        while (gamestate && knight.isAlive()) {
            System.out.println("What do you do: ");
            System.out.println("1. Run away");
            System.out.println("2. Fight ");
            String input = scanner.next();

            if (parseInt(input) == 1) {
                gamestate = false;
                endgame = "You ran for your life";
            }

            if (parseInt(input) == 2) {
                if(ogre.isAlive()){
                    System.out.println("1. Attack for " + knight.getWeapon().getBaseDamage()+ " damage");
                    System.out.println("2. Pray - Increases damage and small heal");
                    String choice = scanner.next();
                    if (parseInt(choice) == 1){
                        knight.attack(ogre);
                    }
                    if (parseInt(choice) == 2){
                        knight.pray();
                    }
                    ogre.attack(knight);
                }


            }
        }


        System.out.println("the game ended");
        System.out.println(endgame);




    }


}
