package Day04;

import java.util.Random;
import java.util.Scanner;

public class Loops {

   // TODO: 1. Write a method that takes in an int, n, and prints the numbers from 1 to n, one number per line.

    public void print1ToN(int n){
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
    public void print1ToN2(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }

   // TODO: 2. Write a method that takes in an int, n, and prints the numbers from 0 to n, counting by two.
     public void print1ToNByTwo(int n){
         for(int i = 0; i<=n; i = i + 2){
             System.out.println(i);
         }
     }
   // TODO: 3. Write a method that takes in an int, n, and returns the sum of the integers from 1 to n.
     public int sum1ToN(int n){
        int total = 0;
        for(int i = 1; i<=n; i++){
            total = total + i;
        }
        return total;
     }
  //  TODO: 4. Write a method that plays the "Guess the number" game

    public void playGuessTheNumber() {
        System.out.println("I'm thinking of a number between 1 and 100. Guess it!");
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int secretNumber = r.nextInt(101);
        int guess = scan.nextInt();
        while(guess != secretNumber){
            if(guess > secretNumber){
                System.out.println("Lower! Guess again");
            }
            else{
                System.out.println("Higher! Guess again");
            }
            guess = scan.nextInt();
        }
        System.out.println("Yay! The number was " + secretNumber);

    }




}
