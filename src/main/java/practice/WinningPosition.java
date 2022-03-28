package practice;

import java.util.Scanner;

public class WinningPosition {

	public static void main(String[] args) 
	{
		int playerPosition=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String playerName = sc.next();
        int diceRoll = (int) Math.floor(Math.random() * 10) %6 +1 ;
        System.out.println("The Number of dice is:"+ diceRoll);

        int option =(int) Math.floor(Math.random()*10) %3;

        if(option == 0)
        {
            System.out.println("No Play");
            playerPosition =playerPosition + 0;
        }
        else if(option == 1)
        {
            System.out.println("Ladder");
            playerPosition =playerPosition + diceRoll;
        }
        else
        {
            System.out.println("Snake");
            playerPosition =playerPosition - diceRoll;

            if(playerPosition < 0) {
                playerPosition =0;
            }

        }
        System.out.println("Player Position is:" + playerPosition);
	}

}
