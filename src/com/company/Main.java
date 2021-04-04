package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String p1name = null;
        String p2name = null;
        Integer p1age, p2age;
        int dice1 = 0;
        int dicenum1 = 0;
        int dice2 = 0;
        int dicenum2 = 0;
        int score1 = 0;
        int score2 = 0;


        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--------------------------------------------");
        System.out.println("             Welcome to Dice Game           ");
        System.out.println("--------------------------------------------");

        Function Player1;
        {
            System.out.println("Enter Player 1's Name:");
            p1name = s.nextLine();
            System.out.println("Enter Your Age:");
            p1age = s.nextInt();
            String sw = s.nextLine();
        }

        System.out.println("--------------------------------------------");

        Function Player2;
        {
            System.out.println("Enter Player 2's Name:");
            p2name = s.nextLine();
            System.out.println("Enter Your Age:");
            p2age = s.nextInt();
        }

        System.out.println("--------------------------------------------");

        if (p1age >= 5 && p2age >= 5) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println("--------------------------------------------");
                    System.out.println("CLICK ENTER TO ROLL");
                    String enterroll = s.nextLine();
                    dice1 = random.nextInt((6 - 1) + 1) + 1;
                    dicenum1 = dicenum1 + dice1;

                    System.out.println(p1name + " Have Rolled " + dice1);

                    if (dice1 == 1) {
                        System.out.println("  _________ ");
                        System.out.println(" |         |");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |_________| ");
                    }

                    if (dice1 == 2) {
                        System.out.println("  _________");
                        System.out.println(" |        o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o________| ");
                    }

                    if (dice1 == 3) {
                        System.out.println("  _________");
                        System.out.println(" |        o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o________| ");
                    }

                    if (dice1 == 4) {
                        System.out.println("  _________ ");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }

                    if (dice1 == 5) {
                        System.out.println("  _________");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }


                    if (dice1 == 6) {
                        System.out.println("  _________");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }

                    System.out.println("--------------------------------------------");
                    System.out.println("CLICK ENTER TO ROLL");
                    String enterroll2 = s.nextLine();
                    String sw2 = s.nextLine();
                    dice2 = random.nextInt((6 - 1) + 1) + 1;
                    dicenum2 = dicenum2 + dice2;

                    System.out.println(p2name + " Have Rolled " + dice2);

                    if (dice2 == 1) {
                        System.out.println("  _________ ");
                        System.out.println(" |         |");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |_________| ");
                    }

                    if (dice2 == 2) {
                        System.out.println("  _________");
                        System.out.println(" |        o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o________| ");
                    }

                    if (dice2 == 3) {
                        System.out.println("  _________");
                        System.out.println(" |        o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o________| ");
                    }

                    if (dice2 == 4) {
                        System.out.println("  _________ ");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }

                    if (dice2 == 5) {
                        System.out.println("  _________");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |    o    | ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }


                    if (dice2 == 6) {
                        System.out.println("  _________");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |o       o| ");
                        System.out.println(" |         | ");
                        System.out.println(" |o______ o| ");
                    }
                }

                if (dicenum1 % 2 == 0) {
                    score1 = score1 + dicenum1 + 10;
                    dicenum1=0;
                } else {
                    score1 = ((score1 + dicenum1) - 5);
                    dicenum1=0;
                }

                if (dicenum2 % 2 == 0) {
                    score2 = score2 + dicenum2 + 10;
                    dicenum2=0;
                } else {
                    score2 = ((score2 + dicenum2) - 5);
                    dicenum2=0;
                }


                System.out.println(p1name +" score: " + score1);
                System.out.println(p2name +" score: " + score2);
            }

            System.out.println("--------------------------------------------");
            if (score1>score2){
                System.out.println("Winner: " + p1name);
            }
            if (score2>score1){
                System.out.println("Winner: " + p2name);
            }
            if (score1==score2){
                System.out.println("Draw");
            }
            System.out.println("--------------------------------------------");


        } else {
            System.out.println("Not valid to play");
        }

    }
}