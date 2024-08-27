package Day04;

import java.util.Random;
import java.util.Scanner;

public class Loops {

   // TODO: 1. Write a method that takes in an int, n, and prints the numbers from 1 to n, one number per line.

    public void print1ToN(int n){

    }
   // TODO: 2. Write a method that takes in an int, n, and prints the numbers from 1 to n, counting by two.
     public void print1ToNByTwo(int n){

     }
   // TODO: 3. Write a method that takes in an int, n, and returns the sum of the integers from 1 to n.
     public int sum1ToN(int n){
        return -1;
     }
  //  TODO: 4. Write a method that plays the "Guess the number" game

    public void playGuessTheNumber() {
        System.out.println("I'm thinking of a number between 1 and 100. Guess it!");
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int secretNumber = r.nextInt(100);
        int guess = scan.nextInt();

    }




}
