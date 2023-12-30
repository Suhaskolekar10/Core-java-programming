/*
  Write a program for matchstick game between the computer and the user.  
  Your program should ensure that the computer always wins. Rules for the game are as follows:				
  a. There are 21 matchsticks
  b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.					
  C. Player is given the chance to pick the sticks first then the computer picks the sticks.		
  d. Whoever is forced to pick up the last matchstick loses the game.
 * */

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		int msticks=21,user_choice,computer_choice;
		Scanner sc=new Scanner(System.in);
		while (msticks>=1)
		{
			System.out.println("pick up msticks between 1-4");
			user_choice=sc.nextInt();
			System.out.println("user piks up"+user_choice+"match sticks");
			
			if (user_choice>4)
			{
				System.out.println("Invalid Entry");
				break;
			}
			computer_choice=5-user_choice;
			System.out.println("computer picks up"+computer_choice+"match sticks");
			msticks = msticks-user_choice-computer_choice;
			System.out.println("Remaining match sticks="+msticks);
			if (msticks==1)
			{
				System.out.println("nYou have been lost via computer.");
				break;
			}
		}
	}
}