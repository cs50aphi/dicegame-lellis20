import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DiceGame
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the game of DOUBLE DICE!");
    System.out.println("We've been expecting you!");
    System.out.println("Step on up and try your luck! Challenge Lonzo the Marvellous!");
    System.out.println("First, choose the range of your dice. Minimum: ");
    Scanner kb = new Scanner(System.in);
    int minimum1 = kb.nextInt();
    System.out.println("Maximum: ");
    int maximum1 = kb.nextInt();

    Die player1dice = new Die();
    Die player1dice2 = new Die();
    Die lonzo = new Die();
    Die lonzo2 = new Die();

    System.out.println("The range of your two dice will be: " + (minimum1 * 2) + " to " + (maximum1 * 2));

    int playerRoll1 = player1dice.roll(minimum1, maximum1) + player1dice2.roll(minimum1, maximum1);
    int lonzoRoll1 = lonzo.roll(minimum1, maximum1) + lonzo2.roll(minimum1, maximum1);

    System.out.println("You have rolled a: " + playerRoll1);
    // System.out.println("Lonzo rolled " + lonzoRoll1);

    if (playerRoll1 > lonzoRoll1) {
        System.out.println("You have beat Lonzo the Magnificent and have earned the title of Player1 the Subpar!");
        System.out.println("Just for funsies, take a guess at what Lonzo rolled: ");
    }
    else {
        System.out.println("Lonzo the Fabulous has beaten you! But there is one more chance to win! Can you guess what he rolled?");
    }
    int userGuess = kb.nextInt();
    if (userGuess == lonzoRoll1) {
        System.out.println("Wow! You got it! You have forced a new title upon your nemesis: Lonzo the Irrelevant. And you have taken the title of Player1 the Moderate!");
    }
    else {
        System.out.println("That's definitely not it. Your nemesis escapes with his title Lonzo to Fortunate, and you are now Player1 the Lackluster!");
    }
    System.out.println("Thank you for playing! Goodbye!");
  }
}