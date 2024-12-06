import java.util.Random;
import java.util.Scanner;

public class game{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // create a Random object to generate a random number 
   Random random = new Random();

// Define the lower and upper bounds for the range of numbers
int lowerBound = 1;
int upperBand = 100;

// generate a random number with a specified range

int numberToGuess = random.nextInt(upperBand-lowerBound+1);
int attempts = 0;
int maxAttempts = 10;
System.out.println("Welcome to the number gussing game!");
System.out.println("I have selected a number between " + lowerBound + " and " + upperBand + " can you guess it ?");

while (attempts<maxAttempts) {
 System.out.println("Enter your guess number : ");
 int userGuess = sc.nextInt();
 attempts++;
 
 if (userGuess == numberToGuess) {
  System.out.println("Congratulations! you have Guessed the correct number in " + attempts + " attempts.");    
  break;
 }
 else if(userGuess< numberToGuess){
 System.out.println("Try to choose higher number");
 }
 else{
    System.out.println("Try to choose lower number");
 }
}
if(attempts == maxAttempts){
 System.out.println("Sorry, you have to reach maximum number of attempts.The correct number was: " + numberToGuess);   
}
System.out.println("Thanks for Playing.!");

    }
}