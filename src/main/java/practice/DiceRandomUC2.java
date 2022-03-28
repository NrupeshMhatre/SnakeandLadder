package practice;

import java.util.Scanner;

public class DiceRandomUC2 {

	public static void main(String[] args) {
		int playerPosition = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String playerName = sc.next();
        int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The Number of dice is:" + diceRoll);
    }

	}


