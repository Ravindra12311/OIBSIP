package pack1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
public static void main(String[]args)
{
Random rand=new Random();
int numberToGuess = rand.nextInt(100)+1;
Scanner scanner = new Scanner(System.in);
int guess=0;
int attempts=0;
System.out.println("guess the number between 1 to 100");
while(guess != numberToGuess)
{
System.out.println("your guessing number");
guess = scanner.nextInt();
attempts++;

if(guess < numberToGuess)
{
System.out.println("your guessing number is very less");
}

else if(guess > numberToGuess)
{
System.out.println("your guessing number is very high");
}

else
{
System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
}

}
scanner.close();
}
}