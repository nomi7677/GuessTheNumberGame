package com.firstpackage;

import java.util.Scanner;

class Guesser {
    int guessNum;
  public int guessNumber(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number: ");
      guessNum = sc.nextInt();
      if(guessNum <10){

      }else{
          System.out.println("Guess number from 1-10 and start it again");
          System.exit(0);
      }
        return guessNum;
    }
}

class Player{
    int pGuessNum;
    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player enter your number: ");
        pGuessNum = sc.nextInt();
        return pGuessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser gu = new Guesser();
        numFromGuesser = gu.guessNumber();
    }

    public void collectNumFromPlayer() {
        Player pl1 = new Player();
        Player pl2 = new Player();
        Player pl3 = new Player();
        numFromPlayer1 = pl1.guessNumber();
        numFromPlayer2 = pl2.guessNumber();
        numFromPlayer3 = pl3.guessNumber();
    }

    public void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Match is draw");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won the game");
            } else {
                System.out.println("Player 1 guessed the number");
            }
        }

        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }

        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 guessed the number");
        } else {
            System.out.println("No one guessed the number!!!");
        }
    }
}
public class LaunchGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}
