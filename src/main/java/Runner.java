import adventurers.Adventurer;
import adventurers.Knight;

import adventurers.Wizard;
import creatures.Monster;
import sun.tools.jstat.Scale;
import toolsandweapons.Spell;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Runner {

    public static void main(String[] args) {

        Generator generator = new Generator();
        ArrayList<Adventurer> party = new ArrayList<Adventurer>();

        int totalTreasure = 0;
        Knight knight = new Knight(30, "Sir Squiggly");
        Wizard wizard = new Wizard(20, "Rincewind");
        Spell fireball = new Spell("Fireball", 10);
        Spell iceShard = new Spell("ice shard", 11);

        wizard.addSpellToBook(fireball);
        wizard.addSpellToBook(iceShard);

        party.add(knight);
        party.add(wizard);

        Room room = generator.getRandomRoom();
        room.setAdventurers(party);

//        Monster monster = new Monster("Ogre",50,4);
//        int treasure = 100;
//        Room room = new Room(monster,treasure);
        Scanner scanner = new Scanner(System.in);
        boolean gameState = true;

        String endgame = "";


        Knight player1 = (Knight) room.getAdventurers().get(0);
        Wizard player2 = (Wizard) room.getAdventurers().get(1);

        System.out.println("Welcome to the game");
        System.out.println("- - - - - - - - - - -");
        System.out.println(player1.getName() + " and " + player2.getName()
                + " enters the room, the " + room.getMonster().getType() + " sees you");

        while (gameState) {
            System.out.println("What do you do: ");
            System.out.println("1. Run away");
            System.out.println("2. Fight ");
            String input = scanner.next();

            if (parseInt(input) == 1) {
                gameState = false;
                endgame = "You ran for your life";
            }

            if (parseInt(input) == 2) {
                if (room.getMonster().isAlive()) {
                    System.out.println("- - - - ");
                    System.out.println(player1.getName() + " HP: " + player1.getHp());
                    System.out.println(player2.getName() + " HP: " + player2.getHp());
                    System.out.println(room.getMonster().getType() + " HP: " + room.getMonster().getHp());
                    System.out.println("- - - - ");
                    if (player1.isAlive() && room.getMonster().isAlive()) {
                        System.out.println(player1.getName() + " to move: ");
                        System.out.println("1. Attack for " + player1.getWeapon().getBaseDamage() + " damage");
                        System.out.println("2. Pray - Increases damage and small heal");
                        String inputPlayer1 = scanner.next();
                        if (parseInt(inputPlayer1) == 1) {
                            player1.attack(room.getMonster());
                            System.out.println(room.getMonster().getType() + " was hit for " + player1.getWeapon().getBaseDamage());
                        }
                        if (parseInt(inputPlayer1) == 2) {
                            player1.pray();

                        }

                    }
                    if (player2.isAlive() && room.getMonster().isAlive()) {
                        System.out.println(player2.getName() + " to move: ");
                        System.out.println("1. Cast Fireball for " + player2.getSpellBook().get(0).getBaseDamage());
                        System.out.println("2. Cast ice Shard for " + player2.getSpellBook().get(1).getBaseDamage());
                        String inputPlayer2 = scanner.next();

                        if (parseInt(inputPlayer2) == 1) {
                            player2.selectSpell(0);
                            player2.castSpell(room.getMonster());
                            System.out.println(room.getMonster().getType() + " was hit for " + player2.getSelectedSpell().getBaseDamage());
                        }
                        if (parseInt(inputPlayer2) == 2) {
                            player2.selectSpell(1);
                            player2.castSpell(room.getMonster());
                            System.out.println(room.getMonster().getType() + " was hit for " + player2.getSelectedSpell().getBaseDamage());

                        }
                    }

                    if (!room.getMonster().isAlive()) {
                        endgame = " The brave adventurers defeated " + room.getMonster().getType()
                                + " and found the treasure of " + room.getTreasure() + " shmeckles! ";
                        totalTreasure += room.getTreasure();
                        gameState = false;
                    }
                    if (!room.getMonster().isAlive()) {

                        System.out.println(room.getMonster().getType() + " to move! ");
                        room.getMonster().attack(player1);

                        System.out.println(room.getMonster().getType() + " attacked " + player1.getName() + " for " + room.getMonster().getCurrentDamage() + " damage");
                        if (!player1.isAlive()) {
                            System.out.println(player1.getName() + " has been killed");
                        }

                        room.getMonster().attack(player2);
                        System.out.println(room.getMonster().getType() + " attacked " + player2.getName() + " for " + room.getMonster().getCurrentDamage() + " damage");
                        if (!player2.isAlive()) {
                            System.out.println(player2.getName() + " has been killed");
                        }
                    }

                    if (!player1.isAlive() && !player2.isAlive()) {
                        endgame = " the monster protected the treasure";
                        gameState = false;
                    }




                }


            }

        }


        System.out.println("the game ended");
        System.out.println(endgame);


    }


}
