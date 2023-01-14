package Assignment3;

import java.util.Scanner;

class Guesser
{	
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);		
		while(true) {
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum>0&&guessNum<=10){
			return guessNum;
		}				
		  else {
			 System.out.println("Guesser pls Guess The Number Between 1 to 10: ");	   
			 continue;   
			}
		}
	}	
}
class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Player kindly guess the number");
			guessNum=scan.nextInt();
			if(guessNum>0 && guessNum<=10) {
				return guessNum;	
			}
			else {		
				System.out.println("Player pls Guess The Number Between 1 to 10:");	
				continue;
			}
		}	
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
		numFromPlayer4=p4.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1) {
			if((numFromGuesser==numFromPlayer2) && (numFromGuesser==numFromPlayer3)
					&& (numFromGuesser==numFromPlayer4)) {
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("Player 1 & Player2 & Player 3 won");
			}
			else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4) {
				System.out.println("Player 1 & Player3 & Player 4 won The Game");
			}
			else if(numFromGuesser==numFromPlayer4) {
				System.out.println("Player 1 & Player 4 won The game");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2){
			if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4) {
				System.out.println("Player 2 & Player3 & Player 4 won The Game");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 2 & Player 3 won The Game");
			}else if(numFromGuesser==numFromPlayer4) {
				System.out.println("Player 2 & Player 4 won The Game");
			}
			else {
				System.out.println("Player 1 won the Game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			if(numFromGuesser==numFromPlayer4) {
				System.out.println("Player 3 & Player 4 won The Game");
			}else {
				System.out.println("Player 3 won the Game");
			}
		}
		else if(numFromGuesser==numFromPlayer4) {
			System.out.println("Player 4 won the Game");
		}
		else {
			System.out.println("Game lose ! pls Try again");
		}
	}	
}
public class GuesserGame2 {

	public static void main(String[] args) {
		for (int i=0;i<2;i++) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		}

	}

}
